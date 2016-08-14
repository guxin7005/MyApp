package com.example.xin.myapplication;

import android.app.Fragment;
import android.content.Context;

/**
 * Created by xingu on 7/8/16.
 */
public class NumberButton extends Fragment{


    // send button info
    SendButton SendButtonCommand;

    public interface SendButton{
        public void getNumberFromNumberButton(int num);
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);

        try {
            SendButtonCommand = (SendButton) context;
        } catch(ClassCastException e){
            throw new ClassCastException(context.toString());

        }

    }


}
