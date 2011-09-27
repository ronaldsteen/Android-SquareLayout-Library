package nl.tamtam.widget.squarelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class SquareLayout extends LinearLayout {

	public SquareLayout(Context context, AttributeSet attributes){
		super(context, attributes);
	}
	
	public SquareLayout(Context context) {
		super(context);
	}

	public void onLayout(boolean changed, int l, int t, int r, int b) {
		int width = r - l;
		ViewGroup.LayoutParams params = this.getLayoutParams();
		params.height = width;
		this.setLayoutParams(params);
		this.setMeasuredDimension(width, width);
		super.onLayout(changed, l, t, r, t + width);
	}
}
