package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.C8773a;
import com.iab.omid.library.applovin.p046b.C8782f;
import com.iab.omid.library.applovin.p048d.C8790b;
import com.iab.omid.library.applovin.p048d.C8794e;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class MediaEvents {
    private final C8773a adSession;

    private MediaEvents(C8773a c8773a) {
        this.adSession = c8773a;
    }

    private void confirmValidDuration(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession) {
        C8773a c8773a = (C8773a) adSession;
        C8794e.m3038a(adSession, "AdSession is null");
        C8794e.m3030g(c8773a);
        C8794e.m3039a(c8773a);
        C8794e.m3035b(c8773a);
        C8794e.m3032e(c8773a);
        MediaEvents mediaEvents = new MediaEvents(c8773a);
        c8773a.getAdSessionStatePublisher().m3017a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        C8794e.m3038a(interactionType, "InteractionType is null");
        C8794e.m3034c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8790b.m3054a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().m3014a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        C8794e.m3034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m3016a("bufferFinish");
    }

    public void bufferStart() {
        C8794e.m3034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m3016a("bufferStart");
    }

    public void complete() {
        C8794e.m3034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m3016a("complete");
    }

    public void firstQuartile() {
        C8794e.m3034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m3016a("firstQuartile");
    }

    public void midpoint() {
        C8794e.m3034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m3016a("midpoint");
    }

    public void pause() {
        C8794e.m3034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m3016a("pause");
    }

    public void playerStateChange(PlayerState playerState) {
        C8794e.m3038a(playerState, "PlayerState is null");
        C8794e.m3034c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8790b.m3054a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().m3014a("playerStateChange", jSONObject);
    }

    public void resume() {
        C8794e.m3034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m3016a("resume");
    }

    public void skipped() {
        C8794e.m3034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m3016a("skipped");
    }

    public void start(float f, float f2) {
        confirmValidDuration(f);
        confirmValidVolume(f2);
        C8794e.m3034c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8790b.m3054a(jSONObject, "duration", Float.valueOf(f));
        C8790b.m3054a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        C8790b.m3054a(jSONObject, "deviceVolume", Float.valueOf(C8782f.m3087a().m3081d()));
        this.adSession.getAdSessionStatePublisher().m3014a("start", jSONObject);
    }

    public void thirdQuartile() {
        C8794e.m3034c(this.adSession);
        this.adSession.getAdSessionStatePublisher().m3016a("thirdQuartile");
    }

    public void volumeChange(float f) {
        confirmValidVolume(f);
        C8794e.m3034c(this.adSession);
        JSONObject jSONObject = new JSONObject();
        C8790b.m3054a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C8790b.m3054a(jSONObject, "deviceVolume", Float.valueOf(C8782f.m3087a().m3081d()));
        this.adSession.getAdSessionStatePublisher().m3014a("volumeChange", jSONObject);
    }
}
