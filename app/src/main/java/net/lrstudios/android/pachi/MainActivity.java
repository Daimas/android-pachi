package net.lrstudios.android.pachi;

import lrstudios.games.ego.lib.ui.NewGameActivity;


public class MainActivity extends NewGameActivity {
    @Override
    protected Class<?> getBotClass() {
        return PachiEngine.class;
    }
}
