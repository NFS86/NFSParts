package mobx.projects.property.minimalist;
import androidx.preference.PreferenceCategory;
import android.content.Context;
import android.util.AttributeSet;

public class space extends PreferenceCategory {

	public space(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutResource(getContext().getResources().getIdentifier("card_space", "layout" , getContext().getPackageName()));
}

}

