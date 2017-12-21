import java.io.IOException;
import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;
import jpcap.PacketReceiver;
import jpcap.packet.Packet;

public class PkPirate_PacketContents implements PacketReceiver
{

    @Override
    public void receivePacket(Packet packet) {
        
       PkPirate_Interface.TA_OUTPUT.append(packet
               +"\n------------------------------------------"
       +"------------------------------------------------\n\n");
    }
  
 

   
}