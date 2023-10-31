package com.facebook.ads.redexgen.p036X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.B6 */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC4574B6 {
    void onAudioSessionId(C4573B5 c4573b5, int i);

    void onAudioUnderrun(C4573B5 c4573b5, int i, long j, long j2);

    void onDecoderDisabled(C4573B5 c4573b5, int i, C4626Bw c4626Bw);

    void onDecoderEnabled(C4573B5 c4573b5, int i, C4626Bw c4626Bw);

    void onDecoderInitialized(C4573B5 c4573b5, int i, String str, long j);

    void onDecoderInputFormatChanged(C4573B5 c4573b5, int i, Format format);

    void onDownstreamFormatChanged(C4573B5 c4573b5, C4844Fn c4844Fn);

    void onDrmKeysLoaded(C4573B5 c4573b5);

    void onDrmKeysRemoved(C4573B5 c4573b5);

    void onDrmKeysRestored(C4573B5 c4573b5);

    void onDrmSessionManagerError(C4573B5 c4573b5, Exception exc);

    void onDroppedVideoFrames(C4573B5 c4573b5, int i, long j);

    void onLoadError(C4573B5 c4573b5, C4843Fm c4843Fm, C4844Fn c4844Fn, IOException iOException, boolean z);

    void onLoadingChanged(C4573B5 c4573b5, boolean z);

    void onMediaPeriodCreated(C4573B5 c4573b5);

    void onMediaPeriodReleased(C4573B5 c4573b5);

    void onMetadata(C4573B5 c4573b5, Metadata metadata);

    void onPlaybackParametersChanged(C4573B5 c4573b5, C4549Ah c4549Ah);

    void onPlayerError(C4573B5 c4573b5, C4529AM c4529am);

    void onPlayerStateChanged(C4573B5 c4573b5, boolean z, int i);

    void onPositionDiscontinuity(C4573B5 c4573b5, int i);

    void onReadingStarted(C4573B5 c4573b5);

    void onRenderedFirstFrame(C4573B5 c4573b5, Surface surface);

    void onSeekProcessed(C4573B5 c4573b5);

    void onSeekStarted(C4573B5 c4573b5);

    void onTimelineChanged(C4573B5 c4573b5, int i);

    void onTracksChanged(C4573B5 c4573b5, TrackGroupArray trackGroupArray, C4942HR c4942hr);

    void onVideoSizeChanged(C4573B5 c4573b5, int i, int i2, int i3, float f);
}
