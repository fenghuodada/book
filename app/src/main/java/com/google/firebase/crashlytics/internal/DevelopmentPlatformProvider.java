package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class DevelopmentPlatformProvider {
    private static final String FLUTTER_ASSET_FILE = "flutter_assets/NOTICES.Z";
    private static final String FLUTTER_PLATFORM = "Flutter";
    private static final String UNITY_PLATFORM = "Unity";
    private static final String UNITY_VERSION_FIELD = "com.google.firebase.crashlytics.unity_version";
    private final Context context;
    @Nullable
    private DevelopmentPlatform developmentPlatform = null;

    /* loaded from: classes3.dex */
    public class DevelopmentPlatform {
        @Nullable
        private final String developmentPlatform;
        @Nullable
        private final String developmentPlatformVersion;

        private DevelopmentPlatform() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.this.context, DevelopmentPlatformProvider.UNITY_VERSION_FIELD, "string");
            if (resourcesIdentifier != 0) {
                this.developmentPlatform = DevelopmentPlatformProvider.UNITY_PLATFORM;
                String string = DevelopmentPlatformProvider.this.context.getResources().getString(resourcesIdentifier);
                this.developmentPlatformVersion = string;
                Logger logger = Logger.getLogger();
                logger.m3342v("Unity Editor version is: " + string);
            } else if (!DevelopmentPlatformProvider.this.assetFileExists(DevelopmentPlatformProvider.FLUTTER_ASSET_FILE)) {
                this.developmentPlatform = null;
                this.developmentPlatformVersion = null;
            } else {
                this.developmentPlatform = DevelopmentPlatformProvider.FLUTTER_PLATFORM;
                this.developmentPlatformVersion = null;
                Logger.getLogger().m3342v("Development platform is: Flutter");
            }
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean assetFileExists(String str) {
        if (this.context.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.context.getAssets().open(str);
            if (open != null) {
                open.close();
                return true;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private DevelopmentPlatform initDevelopmentPlatform() {
        if (this.developmentPlatform == null) {
            this.developmentPlatform = new DevelopmentPlatform();
        }
        return this.developmentPlatform;
    }

    public static boolean isUnity(Context context) {
        return CommonUtils.getResourcesIdentifier(context, UNITY_VERSION_FIELD, "string") != 0;
    }

    @Nullable
    public String getDevelopmentPlatform() {
        return initDevelopmentPlatform().developmentPlatform;
    }

    @Nullable
    public String getDevelopmentPlatformVersion() {
        return initDevelopmentPlatform().developmentPlatformVersion;
    }
}
