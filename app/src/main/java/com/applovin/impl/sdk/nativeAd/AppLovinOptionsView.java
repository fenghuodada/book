package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.C3393R;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class AppLovinOptionsView extends FrameLayout implements View.OnClickListener {
    private final Uri privacyDestinationUri;
    private final C3214m sdk;

    public AppLovinOptionsView(AppLovinNativeAdImpl appLovinNativeAdImpl, C3214m c3214m, Context context) {
        super(context);
        this.sdk = c3214m;
        this.privacyDestinationUri = appLovinNativeAdImpl.getPrivacyDestinationUri();
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Uri privacyIconUri = appLovinNativeAdImpl.getPrivacyIconUri();
        if (privacyIconUri != null) {
            imageView.setImageURI(privacyIconUri);
        } else {
            imageView.setImageResource(C3393R.C3395drawable.privacy_icon_layered_list);
        }
        addView(imageView);
        setOnClickListener(this);
    }

    public void destroy() {
        setOnTouchListener(null);
        removeAllViews();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Utils.openUri(this.sdk.m7476L(), this.privacyDestinationUri, this.sdk);
    }
}
