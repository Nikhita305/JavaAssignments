package accesorsandmutators;

import accesorsandmutators.external.Photographer;
import accesorsandmutators.internal.Camera;
import accesorsandmutators.internal.CameraType;

public class CameraRunner {

    public static void main(String[] args) {
        Camera camera1 = new Camera("Canon", 1200.99, CameraType.DSLR, "WiFi");
        Camera camera2 = new Camera("Sony", 1500.75, CameraType.MIRRORLESS, "Bluetooth");

        Camera[] cameras = {camera1, camera2};

        Photographer photographer = new Photographer();
        photographer.capture(camera1);
        photographer.review(cameras);
    }
}
