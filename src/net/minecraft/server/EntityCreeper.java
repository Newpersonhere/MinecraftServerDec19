package net.minecraft.server;

public class EntityCreeper extends EntityMonster {

	private static final int STATE_DW_ID = DataWathcer.claimId(EntityCreeper.class); //value = 11
	private static final int POWERED_DW_ID = DataWathcer.claimId(EntityCreeper.class); //value = 12
	private static final int IGNITED_DW_ID = DataWathcer.claimId(EntityCreeper.class); //value = 13

	private int bs;
	private int bt;
	private int bu = 30;
	private int bv = 3;
	private int bw = 0;

	public EntityCreeper(World var1) {
		super(var1);
		this.i.a(1, new class_rj(this));
		this.i.a(2, new class_sp(this));
		this.i.a(3, new class_rb(this, EntityOcelot.class, 6.0F, 1.0D, 1.2D));
		this.i.a(4, new class_ru(this, 1.0D, false));
		this.i.a(5, new class_si(this, 0.8D));
		this.i.a(6, new class_rr(this, EntityHuman.class, 8.0F));
		this.i.a(6, new class_sh(this));
		this.bn.a(1, new class_sz(this, EntityHuman.class, true));
		this.bn.a(2, new class_sw(this, false, new Class[0]));
	}

	protected void aY() {
		super.aY();
		this.a((class_qk) class_wl.d).a(0.25D);
	}

	public int aG() {
		return this.w() == null ? 3 : 3 + (int) (this.getHealth() - 1.0F);
	}

	public void e(float var1, float var2) {
		super.e(var1, var2);
		this.bt = (int) ((float) this.bt + var1 * 1.5F);
		if (this.bt > this.bu - 5) {
			this.bt = this.bu - 5;
		}

	}

	protected void initDatawatcher() {
		super.initDatawatcher();
		this.datawatcher.add(STATE_DW_ID, Byte.valueOf((byte) -1));
		this.datawatcher.add(POWERED_DW_ID, Byte.valueOf((byte) 0));
		this.datawatcher.add(IGNITED_DW_ID, Byte.valueOf((byte) 0));
	}

	public void write(NBTTagCompound var1) {
		super.write(var1);
		if (this.datawatcher.getByte(POWERED_DW_ID) == 1) {
			var1.put("powered", true);
		}

		var1.put("Fuse", (short) this.bu);
		var1.put("ExplosionRadius", (byte) this.bv);
		var1.put("ignited", this.cC());
	}

	public void read(NBTTagCompound var1) {
		super.read(var1);
		this.datawatcher.update(POWERED_DW_ID, Byte.valueOf((byte) (var1.getBoolean("powered") ? 1 : 0)));
		if (var1.hasOfType("Fuse", 99)) {
			this.bu = var1.getShort("Fuse");
		}

		if (var1.hasOfType("ExplosionRadius", 99)) {
			this.bv = var1.getByte("ExplosionRadius");
		}

		if (var1.getBoolean("ignited")) {
			this.setIgnited();
		}

	}

	public void t_() {
		if (this.isAlive()) {
			this.bs = this.bt;
			if (this.cC()) {
				this.a(1);
			}

			int var1 = this.cB();
			if (var1 > 0 && this.bt == 0) {
				this.makeSound("creeper.primed", 1.0F, 0.5F);
			}

			this.bt += var1;
			if (this.bt < 0) {
				this.bt = 0;
			}

			if (this.bt >= this.bu) {
				this.bt = this.bu;
				this.cG();
			}
		}

		super.t_();
	}

	protected String bp() {
		return "mob.creeper.say";
	}

	protected String bq() {
		return "mob.creeper.death";
	}

	public void a(DamageSource var1) {
		super.a(var1);
		if (var1.j() instanceof EntitySkeleton) {
			int var2 = Item.getId(Items.RECORD_13);
			int var3 = Item.getId(Items.RECORD_WAIT);
			int var4 = var2 + this.random.nextInt(var3 - var2 + 1);
			this.a(Item.getById(var4), 1);
		} else if (var1.j() instanceof EntityCreeper && var1.j() != this && ((EntityCreeper) var1.j()).isPowered() && ((EntityCreeper) var1.j()).cE()) {
			((EntityCreeper) var1.j()).cF();
			this.a(new ItemStack(Items.SKULL, 1, 4), 0.0F);
		}

	}

	public boolean r(Entity var1) {
		return true;
	}

	public boolean isPowered() {
		return this.datawatcher.getByte(POWERED_DW_ID) == 1;
	}

	protected Item D() {
		return Items.GUNPOWDER;
	}

	public int cB() {
		return this.datawatcher.getByte(STATE_DW_ID);
	}

	public void a(int var1) {
		this.datawatcher.update(STATE_DW_ID, Byte.valueOf((byte) var1));
	}

	public void a(class_vi var1) {
		super.a(var1);
		this.datawatcher.update(POWERED_DW_ID, Byte.valueOf((byte) 1));
	}

	protected boolean a(EntityHuman var1, EnumUsedHand var2, ItemStack var3) {
		if (var3 != null && var3.getItem() == Items.FLINT_AND_STEEL) {
			this.world.makeSound(this.locX + 0.5D, this.locY + 0.5D, this.locZ + 0.5D, "fire.ignite", 1.0F, this.random.nextFloat() * 0.4F + 0.8F);
			var1.a((EnumUsedHand) var2);
			if (!this.world.isClientSide) {
				this.setIgnited();
				var3.a(1, (EntityLiving) var1);
				return true;
			}
		}

		return super.a(var1, var2, var3);
	}

	private void cG() {
		if (!this.world.isClientSide) {
			boolean var1 = this.world.R().getBooleanValue("mobGriefing");
			float var2 = this.isPowered() ? 2.0F : 1.0F;
			this.world.a(this, this.locX, this.locY, this.locZ, (float) this.bv * var2, var1);
			this.die();
		}

	}

	public boolean cC() {
		return this.datawatcher.getByte(IGNITED_DW_ID) != 0;
	}

	public void setIgnited() {
		this.datawatcher.update(IGNITED_DW_ID, Byte.valueOf((byte) 1));
	}

	public boolean cE() {
		return this.bw < 1 && this.world.R().getBooleanValue("doMobLoot");
	}

	public void cF() {
		++this.bw;
	}
}
