package lapra.toast.custoast;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Lahiru Prasanna 
 */

public class CusToast extends Toast {

    private Context context;


    public CusToast(Context context) {
        super(context);
        this.context = context;
    }

    public static Toast makeText(Context context, CharSequence text, int duration) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_toast, null);

        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(text);


        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(duration);
        toast.setView(view);
        return toast;
    }

    public static Toast makeText(Context context, CharSequence text, int duration,int drawable) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.custom_toast, null);

        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(text);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(drawable);


        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(duration);
        toast.setView(view);
        return toast;
    }


}
