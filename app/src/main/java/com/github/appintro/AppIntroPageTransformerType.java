package com.github.appintro;

import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m508d2 = {"Lcom/github/appintro/AppIntroPageTransformerType;", "", "()V", "Depth", "Fade", "Flow", "Parallax", "SlideOver", "Zoom", "Lcom/github/appintro/AppIntroPageTransformerType$Flow;", "Lcom/github/appintro/AppIntroPageTransformerType$Depth;", "Lcom/github/appintro/AppIntroPageTransformerType$Zoom;", "Lcom/github/appintro/AppIntroPageTransformerType$SlideOver;", "Lcom/github/appintro/AppIntroPageTransformerType$Fade;", "Lcom/github/appintro/AppIntroPageTransformerType$Parallax;", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public abstract class AppIntroPageTransformerType {

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m508d2 = {"Lcom/github/appintro/AppIntroPageTransformerType$Depth;", "Lcom/github/appintro/AppIntroPageTransformerType;", "()V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class Depth extends AppIntroPageTransformerType {
        @NotNull
        public static final Depth INSTANCE = new Depth();

        private Depth() {
            super(null);
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m508d2 = {"Lcom/github/appintro/AppIntroPageTransformerType$Fade;", "Lcom/github/appintro/AppIntroPageTransformerType;", "()V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class Fade extends AppIntroPageTransformerType {
        @NotNull
        public static final Fade INSTANCE = new Fade();

        private Fade() {
            super(null);
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m508d2 = {"Lcom/github/appintro/AppIntroPageTransformerType$Flow;", "Lcom/github/appintro/AppIntroPageTransformerType;", "()V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class Flow extends AppIntroPageTransformerType {
        @NotNull
        public static final Flow INSTANCE = new Flow();

        private Flow() {
            super(null);
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m508d2 = {"Lcom/github/appintro/AppIntroPageTransformerType$Parallax;", "Lcom/github/appintro/AppIntroPageTransformerType;", "titleParallaxFactor", "", "imageParallaxFactor", "descriptionParallaxFactor", "(DDD)V", "getDescriptionParallaxFactor", "()D", "getImageParallaxFactor", "getTitleParallaxFactor", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class Parallax extends AppIntroPageTransformerType {
        private final double descriptionParallaxFactor;
        private final double imageParallaxFactor;
        private final double titleParallaxFactor;

        public Parallax() {
            this(0.0d, 0.0d, 0.0d, 7, null);
        }

        public Parallax(double d, double d2, double d3) {
            super(null);
            this.titleParallaxFactor = d;
            this.imageParallaxFactor = d2;
            this.descriptionParallaxFactor = d3;
        }

        public /* synthetic */ Parallax(double d, double d2, double d3, int i, C10839f c10839f) {
            this((i & 1) != 0 ? 1.0d : d, (i & 2) != 0 ? -1.0d : d2, (i & 4) != 0 ? 2.0d : d3);
        }

        public final double getDescriptionParallaxFactor() {
            return this.descriptionParallaxFactor;
        }

        public final double getImageParallaxFactor() {
            return this.imageParallaxFactor;
        }

        public final double getTitleParallaxFactor() {
            return this.titleParallaxFactor;
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m508d2 = {"Lcom/github/appintro/AppIntroPageTransformerType$SlideOver;", "Lcom/github/appintro/AppIntroPageTransformerType;", "()V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class SlideOver extends AppIntroPageTransformerType {
        @NotNull
        public static final SlideOver INSTANCE = new SlideOver();

        private SlideOver() {
            super(null);
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m508d2 = {"Lcom/github/appintro/AppIntroPageTransformerType$Zoom;", "Lcom/github/appintro/AppIntroPageTransformerType;", "()V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class Zoom extends AppIntroPageTransformerType {
        @NotNull
        public static final Zoom INSTANCE = new Zoom();

        private Zoom() {
            super(null);
        }
    }

    private AppIntroPageTransformerType() {
    }

    public /* synthetic */ AppIntroPageTransformerType(C10839f c10839f) {
        this();
    }
}
