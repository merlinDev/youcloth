package com.example.youcloths;

import android.view.View;

public class CustomAnimation {
    public static void animate(final View view) {
        view.animate()
                .rotationX(2f)
                .setDuration(2000)
                .withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        view.animate()
                                .rotationX(-2f)
                                .setDuration(2000)
                                .start();
                    }
                })
                .start();
    }
}
