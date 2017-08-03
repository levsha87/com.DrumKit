/**
 * Created by Рома on 12.07.2017.
 */
 class DrumKitTestDrive {
     public static void main(String[] args) {

    DrumKit d = new DrumKit();
    if (d.snare == true) {
        d.playSnare();
    } else {
    }
    d.snare = false;
    {
        d.playTopHat();
    }
}
}

