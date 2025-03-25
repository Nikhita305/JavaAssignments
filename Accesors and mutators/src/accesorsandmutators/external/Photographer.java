package accesorsandmutators.external;

import accesorsandmutators.internal.Camera;

public class Photographer {

    public Photographer() {
        System.out.println("No-argument constructor running in Photographer");
    }

    public void capture(Camera camera) {
        System.out.println("Capturing with Camera...");
        if (camera != null) {
            camera.display();
        }
    }

    public void review(Camera[] cameras) {
        System.out.println("Reviewing Camera Collection...");
        if (cameras != null) {
            for (Camera camera : cameras) {
                camera.display();
            }
        }
    }
}