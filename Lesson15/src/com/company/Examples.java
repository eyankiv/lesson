package com.company;

/**
 * Created by hackeru on 17/08/2016.
 */
public class Examples {
}

class Button{
    private String text;
    OnClickListener listener;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    static interface OnClickListener{ //static because its nested
        void onClick();
    }

    private void detectClick(){
        //lines of code to detect touch
        if (listener != null)
            listener.onClick();

    }
}
