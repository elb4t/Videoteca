package es.elb4t.videoteca;

import android.app.Activity;
import android.os.Bundle;

public class ActividadDetalles extends Activity {
    public static final String MOVIE = "Movie";
    public static final String SHARED_ELEMENT_NAME = "hero";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
    }
}
