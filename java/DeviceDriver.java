/**
 * This class is used by the operating system to interact with the hardware 'FlashMemoryDevice'.
 */
public class DeviceDriver {

    FlashMemoryDevice hw;

    public DeviceDriver(FlashMemoryDevice hardware) {
        // TODO: implement this method
        hw = hardware;
    }

    public byte read(long address) {
        // TODO: implement this method
        return hw.read(address);//
    }

    public void write(long address, byte data) {
        // TODO: implement this method
        hw.write(address, data);
    }
}
