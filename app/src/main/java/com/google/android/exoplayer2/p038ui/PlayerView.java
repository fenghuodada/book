package com.google.android.exoplayer2.p038ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.ambrose.overwall.R;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.C6633a1;
import com.google.android.exoplayer2.C7127q0;
import com.google.android.exoplayer2.InterfaceC6979i;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.p038ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.p038ui.C7325i;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.C7303k;
import com.google.android.exoplayer2.trackselection.InterfaceC7302j;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7424q;
import com.google.android.exoplayer2.util.InterfaceC7407g;
import com.google.android.exoplayer2.video.C7496w;
import com.google.common.collect.AbstractC8013s;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.exoplayer2.ui.PlayerView */
/* loaded from: classes.dex */
public final class PlayerView extends FrameLayout {

    /* renamed from: a */
    public final View$OnLayoutChangeListenerC7313a f13509a;
    @Nullable

    /* renamed from: b */
    public final AspectRatioFrameLayout f13510b;
    @Nullable

    /* renamed from: c */
    public final View f13511c;
    @Nullable

    /* renamed from: d */
    public final View f13512d;

    /* renamed from: e */
    public final boolean f13513e;
    @Nullable

    /* renamed from: f */
    public final ImageView f13514f;
    @Nullable

    /* renamed from: g */
    public final SubtitleView f13515g;
    @Nullable

    /* renamed from: h */
    public final View f13516h;
    @Nullable

    /* renamed from: i */
    public final TextView f13517i;
    @Nullable

    /* renamed from: j */
    public final C7325i f13518j;
    @Nullable

    /* renamed from: k */
    public final FrameLayout f13519k;
    @Nullable

    /* renamed from: l */
    public final FrameLayout f13520l;
    @Nullable

    /* renamed from: m */
    public Player f13521m;

    /* renamed from: n */
    public boolean f13522n;
    @Nullable

    /* renamed from: o */
    public C7325i.InterfaceC7329d f13523o;

    /* renamed from: p */
    public boolean f13524p;
    @Nullable

    /* renamed from: q */
    public Drawable f13525q;

    /* renamed from: r */
    public int f13526r;

    /* renamed from: s */
    public boolean f13527s;
    @Nullable

    /* renamed from: t */
    public CharSequence f13528t;

    /* renamed from: u */
    public int f13529u;

    /* renamed from: v */
    public boolean f13530v;

    /* renamed from: w */
    public boolean f13531w;

    /* renamed from: x */
    public boolean f13532x;

    /* renamed from: y */
    public int f13533y;

    /* renamed from: z */
    public boolean f13534z;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.PlayerView$ShowBuffering */
    /* loaded from: classes.dex */
    public @interface ShowBuffering {
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerView$a */
    /* loaded from: classes.dex */
    public final class View$OnLayoutChangeListenerC7313a implements Player.InterfaceC6628d, View.OnLayoutChangeListener, View.OnClickListener, C7325i.InterfaceC7329d {

        /* renamed from: a */
        public final AbstractC6984j1.C6986b f13535a = new AbstractC6984j1.C6986b();
        @Nullable

        /* renamed from: b */
        public Object f13536b;

        public View$OnLayoutChangeListenerC7313a() {
        }

        @Override // com.google.android.exoplayer2.device.InterfaceC6753a
        /* renamed from: A */
        public final /* synthetic */ void mo5196A() {
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7465l
        /* renamed from: K */
        public final /* synthetic */ void mo4926K(int i, int i2) {
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6696g, com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: a */
        public final /* synthetic */ void mo5195a(boolean z) {
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7465l
        /* renamed from: b */
        public final void mo4925b() {
            View view = PlayerView.this.f13511c;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7465l, com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: c */
        public final void mo4898c(C7496w c7496w) {
            PlayerView.this.m5229i();
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7465l
        /* renamed from: f */
        public final /* synthetic */ void mo4924f() {
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6696g
        /* renamed from: o */
        public final /* synthetic */ void mo5194o(float f) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onAvailableCommandsChanged(Player.C6624a c6624a) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PlayerView.this.m5230h();
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onEvents(Player player, Player.C6627c c6627c) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m5237a((TextureView) view, PlayerView.this.f13533y);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onMediaItemTransition(C7127q0 c7127q0, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final void onPlayWhenReadyChanged(boolean z, int i) {
            PlayerView playerView = PlayerView.this;
            playerView.m5228j();
            if (playerView.m5235c() && playerView.f13531w) {
                playerView.m5236b();
            } else {
                playerView.m5234d(false);
            }
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlaybackParametersChanged(C6633a1 c6633a1) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final void onPlaybackStateChanged(int i) {
            PlayerView playerView = PlayerView.this;
            playerView.m5228j();
            playerView.m5226l();
            if (playerView.m5235c() && playerView.f13531w) {
                playerView.m5236b();
            } else {
                playerView.m5234d(false);
            }
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final void onPositionDiscontinuity(Player.C6629e c6629e, Player.C6629e c6629e2, int i) {
            PlayerView playerView = PlayerView.this;
            if (playerView.m5235c() && playerView.f13531w) {
                playerView.m5236b();
            }
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onStaticMetadataChanged(List list) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onTimelineChanged(AbstractC6984j1 abstractC6984j1, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final void onTracksChanged(C7178k0 c7178k0, C7303k c7303k) {
            Object obj;
            boolean z;
            PlayerView playerView = PlayerView.this;
            Player player = playerView.f13521m;
            player.getClass();
            AbstractC6984j1 mo5762G = player.mo5762G();
            if (!mo5762G.m5685p()) {
                if (player.mo5764E().f12905a == 0) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC6984j1.C6986b c6986b = this.f13535a;
                if (!z) {
                    obj = mo5762G.mo5413f(player.mo5736j(), c6986b, true).f12153b;
                    this.f13536b = obj;
                    playerView.m5225m(false);
                }
                Object obj2 = this.f13536b;
                if (obj2 != null) {
                    int mo5414b = mo5762G.mo5414b(obj2);
                    if (mo5414b != -1) {
                        if (player.mo5730p() == mo5762G.mo5413f(mo5414b, c6986b, false).f12154c) {
                            return;
                        }
                    }
                }
                playerView.m5225m(false);
            }
            obj = null;
            this.f13536b = obj;
            playerView.m5225m(false);
        }

        @Override // com.google.android.exoplayer2.p038ui.C7325i.InterfaceC7329d
        public final void onVisibilityChange(int i) {
            PlayerView.this.m5227k();
        }

        @Override // com.google.android.exoplayer2.metadata.InterfaceC7052e
        /* renamed from: r */
        public final /* synthetic */ void mo5193r(C7042a c7042a) {
        }

        @Override // com.google.android.exoplayer2.device.InterfaceC6753a
        /* renamed from: v */
        public final /* synthetic */ void mo5192v() {
        }

        @Override // com.google.android.exoplayer2.text.InterfaceC7239i
        /* renamed from: z */
        public final void mo5191z(List<Cue> list) {
            SubtitleView subtitleView = PlayerView.this.f13515g;
            if (subtitleView != null) {
                subtitleView.setCues(list);
            }
        }
    }

    public PlayerView(Context context) {
        super(context, null, 0);
        boolean z;
        int i;
        View$OnLayoutChangeListenerC7313a view$OnLayoutChangeListenerC7313a = new View$OnLayoutChangeListenerC7313a();
        this.f13509a = view$OnLayoutChangeListenerC7313a;
        if (isInEditMode()) {
            this.f13510b = null;
            this.f13511c = null;
            this.f13512d = null;
            this.f13513e = false;
            this.f13514f = null;
            this.f13515g = null;
            this.f13516h = null;
            this.f13517i = null;
            this.f13518j = null;
            this.f13519k = null;
            this.f13520l = null;
            ImageView imageView = new ImageView(context);
            if (C7408g0.f13905a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f13510b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.f13511c = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            this.f13512d = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(view$OnLayoutChangeListenerC7313a);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.f13512d = null;
        }
        this.f13513e = false;
        this.f13519k = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f13520l = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f13514f = imageView2;
        if (imageView2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f13524p = z;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f13515g = subtitleView;
        if (subtitleView != null) {
            subtitleView.m5223a();
            subtitleView.m5222b();
        }
        View findViewById = findViewById(R.id.exo_buffering);
        this.f13516h = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.f13526r = 0;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f13517i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C7325i c7325i = (C7325i) findViewById(R.id.exo_controller);
        View findViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (c7325i != null) {
            this.f13518j = c7325i;
        } else if (findViewById2 != null) {
            C7325i c7325i2 = new C7325i(context);
            this.f13518j = c7325i2;
            c7325i2.setId(R.id.exo_controller);
            c7325i2.setLayoutParams(findViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById2.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById2);
            viewGroup.removeView(findViewById2);
            viewGroup.addView(c7325i2, indexOfChild);
        } else {
            this.f13518j = null;
        }
        C7325i c7325i3 = this.f13518j;
        if (c7325i3 != null) {
            i = 5000;
        } else {
            i = 0;
        }
        this.f13529u = i;
        this.f13532x = true;
        this.f13530v = true;
        this.f13531w = true;
        this.f13522n = c7325i3 != null;
        m5236b();
        m5227k();
        C7325i c7325i4 = this.f13518j;
        if (c7325i4 != null) {
            c7325i4.f13628b.add(view$OnLayoutChangeListenerC7313a);
        }
    }

    /* renamed from: a */
    public static void m5237a(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* renamed from: b */
    public final void m5236b() {
        C7325i c7325i = this.f13518j;
        if (c7325i != null) {
            c7325i.m5208c();
        }
    }

    /* renamed from: c */
    public final boolean m5235c() {
        Player player = this.f13521m;
        return player != null && player.mo5746d() && this.f13521m.mo5740g();
    }

    /* renamed from: d */
    public final void m5234d(boolean z) {
        if (!(m5235c() && this.f13531w) && m5224n()) {
            C7325i c7325i = this.f13518j;
            boolean z2 = c7325i.m5206e() && c7325i.getShowTimeoutMs() <= 0;
            boolean m5232f = m5232f();
            if (z || z2 || m5232f) {
                m5231g(m5232f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        Player player = this.f13521m;
        if (player != null && player.mo5746d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z = false;
        } else {
            z = true;
        }
        C7325i c7325i = this.f13518j;
        if (!z || !m5224n() || c7325i.m5206e()) {
            if (m5224n() && c7325i.m5210a(keyEvent)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !super.dispatchKeyEvent(keyEvent)) {
                if (!z || !m5224n()) {
                    return false;
                }
                m5234d(true);
                return false;
            }
        }
        m5234d(true);
        return true;
    }

    @RequiresNonNull({"artworkView"})
    /* renamed from: e */
    public final boolean m5233e(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f13510b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                ImageView imageView = this.f13514f;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m5232f() {
        Player player = this.f13521m;
        if (player == null) {
            return true;
        }
        int mo5725v = player.mo5725v();
        return this.f13530v && (mo5725v == 1 || mo5725v == 4 || !this.f13521m.mo5740g());
    }

    /* renamed from: g */
    public final void m5231g(boolean z) {
        int i;
        if (!m5224n()) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = this.f13529u;
        }
        C7325i c7325i = this.f13518j;
        c7325i.setShowTimeoutMs(i);
        if (!c7325i.m5206e()) {
            c7325i.setVisibility(0);
            Iterator<C7325i.InterfaceC7329d> it = c7325i.f13628b.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(c7325i.getVisibility());
            }
            c7325i.m5202i();
            c7325i.m5203h();
            c7325i.m5200k();
            c7325i.m5199l();
            c7325i.m5198m();
            boolean m5205f = c7325i.m5205f();
            View view = c7325i.f13634f;
            View view2 = c7325i.f13632e;
            if (!m5205f && view2 != null) {
                view2.requestFocus();
            } else if (m5205f && view != null) {
                view.requestFocus();
            }
            boolean m5205f2 = c7325i.m5205f();
            if (!m5205f2 && view2 != null) {
                view2.sendAccessibilityEvent(8);
            } else if (m5205f2 && view != null) {
                view.sendAccessibilityEvent(8);
            }
        }
        c7325i.m5207d();
    }

    public List<AdOverlayInfo> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f13520l;
        if (frameLayout != null) {
            arrayList.add(new AdOverlayInfo(frameLayout));
        }
        C7325i c7325i = this.f13518j;
        if (c7325i != null) {
            arrayList.add(new AdOverlayInfo(c7325i));
        }
        return AbstractC8013s.m4246p(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f13519k;
        C7394a.m5129f(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.f13530v;
    }

    public boolean getControllerHideOnTouch() {
        return this.f13532x;
    }

    public int getControllerShowTimeoutMs() {
        return this.f13529u;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f13525q;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f13520l;
    }

    @Nullable
    public Player getPlayer() {
        return this.f13521m;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13510b;
        C7394a.m5130e(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f13515g;
    }

    public boolean getUseArtwork() {
        return this.f13524p;
    }

    public boolean getUseController() {
        return this.f13522n;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f13512d;
    }

    /* renamed from: h */
    public final boolean m5230h() {
        if (!m5224n() || this.f13521m == null) {
            return false;
        }
        C7325i c7325i = this.f13518j;
        if (!c7325i.m5206e()) {
            m5234d(true);
        } else if (this.f13532x) {
            c7325i.m5208c();
        }
        return true;
    }

    /* renamed from: i */
    public final void m5229i() {
        C7496w c7496w;
        float f;
        Player player = this.f13521m;
        if (player != null) {
            c7496w = player.mo5734l();
        } else {
            c7496w = C7496w.f14218e;
        }
        int i = c7496w.f14219a;
        float f2 = 0.0f;
        int i2 = c7496w.f14220b;
        if (i2 != 0 && i != 0) {
            f = (i * c7496w.f14222d) / i2;
        } else {
            f = 0.0f;
        }
        View view = this.f13512d;
        if (view instanceof TextureView) {
            int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int i4 = c7496w.f14221c;
            if (i3 > 0 && (i4 == 90 || i4 == 270)) {
                f = 1.0f / f;
            }
            int i5 = this.f13533y;
            View$OnLayoutChangeListenerC7313a view$OnLayoutChangeListenerC7313a = this.f13509a;
            if (i5 != 0) {
                view.removeOnLayoutChangeListener(view$OnLayoutChangeListenerC7313a);
            }
            this.f13533y = i4;
            if (i4 != 0) {
                view.addOnLayoutChangeListener(view$OnLayoutChangeListenerC7313a);
            }
            m5237a((TextureView) view, this.f13533y);
        }
        if (!this.f13513e) {
            f2 = f;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13510b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r5.f13521m.mo5740g() == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5228j() {
        /*
            r5 = this;
            android.view.View r0 = r5.f13516h
            if (r0 == 0) goto L29
            com.google.android.exoplayer2.Player r1 = r5.f13521m
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r1.mo5725v()
            r3 = 2
            if (r1 != r3) goto L20
            int r1 = r5.f13526r
            r4 = 1
            if (r1 == r3) goto L21
            if (r1 != r4) goto L20
            com.google.android.exoplayer2.Player r1 = r5.f13521m
            boolean r1 = r1.mo5740g()
            if (r1 == 0) goto L20
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 == 0) goto L24
            goto L26
        L24:
            r2 = 8
        L26:
            r0.setVisibility(r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p038ui.PlayerView.m5228j():void");
    }

    /* renamed from: k */
    public final void m5227k() {
        Resources resources;
        int i;
        String str = null;
        C7325i c7325i = this.f13518j;
        if (c7325i != null && this.f13522n) {
            if (c7325i.getVisibility() != 0) {
                resources = getResources();
                i = R.string.exo_controls_show;
            } else if (this.f13532x) {
                resources = getResources();
                i = R.string.exo_controls_hide;
            }
            str = resources.getString(i);
        }
        setContentDescription(str);
    }

    /* renamed from: l */
    public final void m5226l() {
        TextView textView = this.f13517i;
        if (textView != null) {
            CharSequence charSequence = this.f13528t;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            Player player = this.f13521m;
            if (player != null) {
                player.mo5723x();
            }
            textView.setVisibility(8);
        }
    }

    /* renamed from: m */
    public final void m5225m(boolean z) {
        boolean z2;
        Player player = this.f13521m;
        View view = this.f13511c;
        ImageView imageView = this.f13514f;
        boolean z3 = false;
        if (player != null) {
            boolean z4 = true;
            if (player.mo5764E().f12905a == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (z && !this.f13527s && view != null) {
                    view.setVisibility(0);
                }
                C7303k mo5757N = player.mo5757N();
                for (int i = 0; i < mo5757N.f13437a; i++) {
                    InterfaceC7302j interfaceC7302j = mo5757N.f13438b[i];
                    if (interfaceC7302j != null) {
                        for (int i2 = 0; i2 < interfaceC7302j.length(); i2++) {
                            if (C7424q.m5043g(interfaceC7302j.mo5259f(i2).f12287l) == 2) {
                                if (imageView != null) {
                                    imageView.setImageResource(17170445);
                                    imageView.setVisibility(4);
                                    return;
                                }
                                return;
                            }
                        }
                        continue;
                    }
                }
                if (view != null) {
                    view.setVisibility(0);
                }
                if (this.f13524p) {
                    C7394a.m5130e(imageView);
                } else {
                    z4 = false;
                }
                if (z4) {
                    byte[] bArr = player.mo5756P().f10491i;
                    if (bArr != null) {
                        z3 = m5233e(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    }
                    if (z3 || m5233e(this.f13525q)) {
                        return;
                    }
                }
                if (imageView != null) {
                    imageView.setImageResource(17170445);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
        }
        if (!this.f13527s) {
            if (imageView != null) {
                imageView.setImageResource(17170445);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* renamed from: n */
    public final boolean m5224n() {
        if (this.f13522n) {
            C7394a.m5130e(this.f13518j);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m5224n() || this.f13521m == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13534z = true;
            return true;
        } else if (action == 1 && this.f13534z) {
            this.f13534z = false;
            performClick();
            return true;
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m5224n() || this.f13521m == null) {
            return false;
        }
        m5234d(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return m5230h();
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.InterfaceC7311a interfaceC7311a) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13510b;
        C7394a.m5130e(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC7311a);
    }

    @Deprecated
    public void setControlDispatcher(InterfaceC6979i interfaceC6979i) {
        C7325i c7325i = this.f13518j;
        C7394a.m5130e(c7325i);
        c7325i.setControlDispatcher(interfaceC6979i);
    }

    public void setControllerAutoShow(boolean z) {
        this.f13530v = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f13531w = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C7394a.m5130e(this.f13518j);
        this.f13532x = z;
        m5227k();
    }

    public void setControllerShowTimeoutMs(int i) {
        C7325i c7325i = this.f13518j;
        C7394a.m5130e(c7325i);
        this.f13529u = i;
        if (c7325i.m5206e()) {
            m5231g(m5232f());
        }
    }

    public void setControllerVisibilityListener(@Nullable C7325i.InterfaceC7329d interfaceC7329d) {
        C7325i c7325i = this.f13518j;
        C7394a.m5130e(c7325i);
        C7325i.InterfaceC7329d interfaceC7329d2 = this.f13523o;
        if (interfaceC7329d2 == interfaceC7329d) {
            return;
        }
        CopyOnWriteArrayList<C7325i.InterfaceC7329d> copyOnWriteArrayList = c7325i.f13628b;
        if (interfaceC7329d2 != null) {
            copyOnWriteArrayList.remove(interfaceC7329d2);
        }
        this.f13523o = interfaceC7329d;
        if (interfaceC7329d != null) {
            copyOnWriteArrayList.add(interfaceC7329d);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        C7394a.m5131d(this.f13517i != null);
        this.f13528t = charSequence;
        m5226l();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f13525q != drawable) {
            this.f13525q = drawable;
            m5225m(false);
        }
    }

    public void setErrorMessageProvider(@Nullable InterfaceC7407g<? super PlaybackException> interfaceC7407g) {
        if (interfaceC7407g != null) {
            m5226l();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f13527s != z) {
            this.f13527s = z;
            m5225m(false);
        }
    }

    public void setPlayer(@Nullable Player player) {
        C7394a.m5131d(Looper.myLooper() == Looper.getMainLooper());
        C7394a.m5134a(player == null || player.mo5761H() == Looper.getMainLooper());
        Player player2 = this.f13521m;
        if (player2 == player) {
            return;
        }
        View view = this.f13512d;
        View$OnLayoutChangeListenerC7313a view$OnLayoutChangeListenerC7313a = this.f13509a;
        if (player2 != null) {
            player2.mo5733m(view$OnLayoutChangeListenerC7313a);
            if (player2.mo5791A(26)) {
                if (view instanceof TextureView) {
                    player2.mo5735k((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    player2.mo5766C((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f13515g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f13521m = player;
        if (m5224n()) {
            this.f13518j.setPlayer(player);
        }
        m5228j();
        m5226l();
        m5225m(true);
        if (player == null) {
            m5236b();
            return;
        }
        if (player.mo5791A(26)) {
            if (view instanceof TextureView) {
                player.mo5758M((TextureView) view);
            } else if (view instanceof SurfaceView) {
                player.mo5731o((SurfaceView) view);
            }
            m5229i();
        }
        if (subtitleView != null && player.mo5791A(27)) {
            subtitleView.setCues(player.mo5724w());
        }
        player.mo5726u(view$OnLayoutChangeListenerC7313a);
        m5234d(false);
    }

    public void setRepeatToggleModes(int i) {
        C7325i c7325i = this.f13518j;
        C7394a.m5130e(c7325i);
        c7325i.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13510b;
        C7394a.m5130e(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f13526r != i) {
            this.f13526r = i;
            m5228j();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C7325i c7325i = this.f13518j;
        C7394a.m5130e(c7325i);
        c7325i.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C7325i c7325i = this.f13518j;
        C7394a.m5130e(c7325i);
        c7325i.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C7325i c7325i = this.f13518j;
        C7394a.m5130e(c7325i);
        c7325i.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        C7325i c7325i = this.f13518j;
        C7394a.m5130e(c7325i);
        c7325i.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C7325i c7325i = this.f13518j;
        C7394a.m5130e(c7325i);
        c7325i.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C7325i c7325i = this.f13518j;
        C7394a.m5130e(c7325i);
        c7325i.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f13511c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        C7394a.m5131d((z && this.f13514f == null) ? false : true);
        if (this.f13524p != z) {
            this.f13524p = z;
            m5225m(false);
        }
    }

    public void setUseController(boolean z) {
        Player player;
        C7325i c7325i = this.f13518j;
        C7394a.m5131d((z && c7325i == null) ? false : true);
        if (this.f13522n == z) {
            return;
        }
        this.f13522n = z;
        if (!m5224n()) {
            if (c7325i != null) {
                c7325i.m5208c();
                player = null;
            }
            m5227k();
        }
        player = this.f13521m;
        c7325i.setPlayer(player);
        m5227k();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f13512d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }
}
