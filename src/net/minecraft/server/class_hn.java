package net.minecraft.server;

import java.io.IOException;
import net.minecraft.server.class_aas;
import net.minecraft.server.PacketDataSerializer;
import net.minecraft.server.PacketListener;
import net.minecraft.server.Packet;
import net.minecraft.server.PacketListenerPlayOut;
import net.minecraft.server.class_pw;

public class class_hn implements Packet {
   private int a;
   private class_pw b;
   private class_aas c;

   public class_hn() {
   }

   public class_hn(int var1, class_pw var2, class_aas var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3 == null?null:var3.k();
   }

   public void decode(PacketDataSerializer var1) throws IOException {
      this.a = var1.readVarInt();
      this.b = (class_pw)var1.readEnum(class_pw.class);
      this.c = var1.i();
   }

   public void encode(PacketDataSerializer var1) throws IOException {
      var1.writeVarInt(this.a);
      var1.writeEnum((Enum)this.b);
      var1.a(this.c);
   }

   public void a(PacketListenerPlayOut var1) {
      var1.a(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketListener var1) {
      this.a((PacketListenerPlayOut)var1);
   }
}
