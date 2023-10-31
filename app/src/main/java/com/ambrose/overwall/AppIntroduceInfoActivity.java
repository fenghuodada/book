package com.ambrose.overwall;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import cn.hutool.core.codec.C2026c;
import com.android.tool.util.util.C2603g;
import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroCustomLayoutFragment;
import com.github.appintro.AppIntroPageTransformerType;
import com.github.appintro.indicator.DotIndicatorController;
import com.unity3d.ads.metadata.MetaData;
import java.util.Locale;
import org.jetbrains.annotations.Nullable;
import p060j$.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public class AppIntroduceInfoActivity extends AppIntro {
    @Override // com.github.appintro.AppIntroBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0629l, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super.onCreate(bundle);
        boolean z5 = true;
        setWizardMode(true);
        setIndicatorController(new DotIndicatorController(this));
        setIndicatorColor(getColor(R.color.qmui_config_color_red), getColor(R.color.btn_filled_blue_bg_pressed));
        setNextArrowColor(getColor(R.color.gray));
        setBackArrowColor(getColor(R.color.gray));
        setColorDoneText(getColor(R.color.black));
        setDoneText(getString(R.string.enter_app));
        showStatusBar(false);
        addSlide(AppIntroCustomLayoutFragment.newInstance(R.layout.guide_one));
        addSlide(AppIntroCustomLayoutFragment.newInstance(R.layout.guide_three));
        C2603g.m9336d("DOMAIN", C2026c.m9721b("b250b3dhbGwuY29t"));
        C2603g.m9336d("CUSTOMDOMAIN", C2026c.m9721b("b250b3dhbGwuY29t"));
        if (Locale.getDefault().toString().contains("zh")) {
            C2603g.m9337c(0, "LocaleLan");
        } else {
            C2603g.m9337c(1, "LocaleLan");
        }
        if (C2603g.m9339a("AnimStyle") == 0) {
            C2603g.m9337c(1, "AnimStyle");
        }
        if (C2603g.m9338b("ProxyPort") == null) {
            C2603g.m9336d("ProxyPort", "5678");
        }
        setTransformer(AppIntroPageTransformerType.Fade.INSTANCE);
        if (C2603g.m9338b("UNITYPRIVICEY") == null) {
            MetaData metaData = new MetaData(this);
            if (ThreadLocalRandom.current().nextInt(1, 100) >= 10) {
                z = true;
            } else {
                z = false;
            }
            metaData.set("user.nonbehavioral", Boolean.valueOf(z));
            if (ThreadLocalRandom.current().nextInt(1, 100) >= 10) {
                z2 = true;
            } else {
                z2 = false;
            }
            metaData.set("pipl.consent", Boolean.valueOf(z2));
            if (ThreadLocalRandom.current().nextInt(1, 100) >= 10) {
                z3 = true;
            } else {
                z3 = false;
            }
            metaData.set("privacy.consent", Boolean.valueOf(z3));
            if (ThreadLocalRandom.current().nextInt(1, 100) >= 10) {
                z4 = true;
            } else {
                z4 = false;
            }
            metaData.set("gdpr.consent", Boolean.valueOf(z4));
            if (ThreadLocalRandom.current().nextInt(1, 100) < 10) {
                z5 = false;
            }
            metaData.set("privacy.useroveragelimit", Boolean.valueOf(z5));
            metaData.commit();
            C2603g.m9336d("UNITYPRIVICEY", "SUCCESS");
        }
    }

    @Override // com.github.appintro.AppIntroBase
    public final void onDonePressed(@Nullable Fragment fragment) {
        super.onDonePressed(fragment);
        C2603g.m9336d("IntroduceV450", "ok");
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override // com.github.appintro.AppIntroBase
    public final void onSkipPressed(@Nullable Fragment fragment) {
        super.onSkipPressed(fragment);
    }
}
