package mobapptut.com.camera2videoimage;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by liliqiang on 2017/5/24.
 */

public class UseMyCam2 extends Activity {
    private View.OnClickListener startRecordHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            cam.startRecording();
        }
    };
    private Camera2ReocrdImageCapture cam;
    private View.OnClickListener stopRecordHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            cam.stopRecording();
        }
    };
    private View.OnClickListener shotRecordHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            cam.shot();
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycam2);
        cam = new Camera2ReocrdImageCapture(this);
        findViewById(R.id.doRecord).setOnClickListener(startRecordHandler);
        findViewById(R.id.doStopRecord).setOnClickListener(stopRecordHandler);
        findViewById(R.id.doTakePicture).setOnClickListener(shotRecordHandler);
    }

    @Override
    protected void onPause() {
        super.onPause();
        cam.stopCameraProcess();
    }

    @Override
    protected void onResume() {
        super.onResume();
        cam.startCameraProcess();
    }
}
