package net.minecraft.server;

import net.minecraft.server.ItemStack;
import net.minecraft.server.Items;
import net.minecraft.server.World;
import net.minecraft.server.EnumUsedHand;
import net.minecraft.server.class_rm;
import net.minecraft.server.class_ul;
import net.minecraft.server.EntityHuman;

public class class_rc extends class_rm {
   private class_ul a;
   private EntityHuman b;
   private World c;
   private float d;
   private int e;

   public class_rc(class_ul var1, float var2) {
      this.a = var1;
      this.c = var1.o;
      this.d = var2;
      this.a(2);
   }

   public boolean a() {
      this.b = this.c.a(this.a, (double)this.d);
      return this.b == null?false:this.a(this.b);
   }

   public boolean b() {
      return !this.b.isAlive()?false:(this.a.h(this.b) > (double)(this.d * this.d)?false:this.e > 0 && this.a(this.b));
   }

   public void c() {
      this.a.q(true);
      this.e = 40 + this.a.bd().nextInt(40);
   }

   public void d() {
      this.a.q(false);
      this.b = null;
   }

   public void e() {
      this.a.q().a(this.b.s, this.b.t + (double)this.b.aU(), this.b.u, 10.0F, (float)this.a.cd());
      --this.e;
   }

   private boolean a(EntityHuman var1) {
      EnumUsedHand[] var2 = EnumUsedHand.values();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         EnumUsedHand var5 = var2[var4];
         ItemStack var6 = var1.getItemInHand((EnumUsedHand)var5);
         if(var6 != null) {
            if(this.a.cA() && var6.getItem() == Items.aZ) {
               return true;
            }

            if(this.a.d(var6)) {
               return true;
            }
         }
      }

      return false;
   }
}
