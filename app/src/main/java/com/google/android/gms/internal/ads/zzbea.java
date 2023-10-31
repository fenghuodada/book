package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbea extends RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    @Nullable
    private AnimationDrawable zzb;

    public zzbea(Context context, zzbdz zzbdzVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(zzbdzVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zza, null, null));
        shapeDrawable.getPaint().setColor(zzbdzVar.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbdzVar.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbdzVar.zzg());
            textView.setTextColor(zzbdzVar.zze());
            textView.setTextSize(zzbdzVar.zzf());
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int zzx = zzbzm.zzx(context, 4);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            textView.setPadding(zzx, 0, zzbzm.zzx(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzbec> zzi = zzbdzVar.zzi();
        if (zzi != null && zzi.size() > 1) {
            this.zzb = new AnimationDrawable();
            for (zzbec zzbecVar : zzi) {
                try {
                    this.zzb.addFrame((Drawable) ObjectWrapper.unwrap(zzbecVar.zzf()), zzbdzVar.zzb());
                } catch (Exception e) {
                    zzbzt.zzh("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.zzb);
        } else if (zzi.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.unwrap(((zzbec) zzi.get(0)).zzf()));
            } catch (Exception e2) {
                zzbzt.zzh("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
