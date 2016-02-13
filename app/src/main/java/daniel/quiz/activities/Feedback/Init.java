package daniel.quiz.activities.Feedback;

import android.app.Activity;
import android.os.Bundle;

public class Init extends Activity{

    private Data mData;
    private Gui mGui;
    private ApplicationLogic mApplicationLogic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData(savedInstanceState);
        initGui();
        initApplicationLogic();
        initEventToListenerMapping();
    }


    private void initEventToListenerMapping() {
        new EventToListenerMapping(mGui, mApplicationLogic);
    }

    void initData(Bundle savedInstanceState){
        mData = new Data(this, savedInstanceState);
    }

    void initGui(){
        mGui = new Gui(this);
    }

    private void initApplicationLogic() {
        mApplicationLogic = new ApplicationLogic(mData, mGui);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        mData.saveDataFromBundle(outState);
        super.onSaveInstanceState(outState);
    }
}
