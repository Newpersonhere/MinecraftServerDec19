package net.minecraft.server;

import net.minecraft.server.Item;
import net.minecraft.server.class_aas;
import net.minecraft.server.World;
import net.minecraft.server.class_nc;
import net.minecraft.server.EnumUsedHand;
import net.minecraft.server.class_oq;
import net.minecraft.server.class_or;
import net.minecraft.server.class_pr;
import net.minecraft.server.class_xa;
import net.minecraft.server.class_xm;
import net.minecraft.server.CreativeTab;

public class class_abs extends Item {
   public class_abs() {
      this.h = 16;
      this.a(CreativeTab.f);
   }

   public class_or a(class_aas var1, World var2, class_xa var3, EnumUsedHand var4) {
      if(!var3.bH.d) {
         --var1.b;
      }

      var2.a((class_pr)var3, "random.bow", 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
      if(!var2.D) {
         class_xm var5 = new class_xm(var2, var3);
         var5.a(var3.z, var3.y, 0.0F, 1.5F, 1.0F);
         var2.a((class_pr)var5);
      }

      var3.b(class_nc.ad[Item.getId((Item)this)]);
      return new class_or(class_oq.a, var1);
   }
}
