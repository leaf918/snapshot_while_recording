package mobapptut.com.camera2videoimage;

/**
 * Created by liliqiang on 2017/5/23.
 */

public interface IRecord {
    //start record video
    void startRecording();

    //stop record video
    void stopRecording();

    //shot picture
    void shot();

    // on activity onresume callback
    void startCameraProcess();

    //on activity onpause callback
    void stopCameraProcess();
}
