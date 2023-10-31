package com.unity3d.scar.adapter.v1950.signals;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.DispatchGroup;
import com.unity3d.scar.adapter.common.signals.ISignalCollectionListener;
import com.unity3d.scar.adapter.common.signals.ISignalsReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class SignalsReader implements ISignalsReader {

    /* renamed from: a */
    public static SignalsStorage f18080a;

    /* renamed from: com.unity3d.scar.adapter.v1950.signals.SignalsReader$a */
    /* loaded from: classes3.dex */
    public class RunnableC9281a implements Runnable {

        /* renamed from: a */
        public final ISignalCollectionListener f18081a;

        public RunnableC9281a(ISignalCollectionListener iSignalCollectionListener) {
            this.f18081a = iSignalCollectionListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            HashMap hashMap = new HashMap();
            String str2 = null;
            for (Map.Entry<String, QueryInfoMetadata> entry : SignalsReader.f18080a.getPlacementQueryInfoMap().entrySet()) {
                QueryInfoMetadata value = entry.getValue();
                hashMap.put(value.getPlacementId(), value.getQueryStr());
                if (value.getError() != null) {
                    str2 = value.getError();
                }
            }
            int size = hashMap.size();
            ISignalCollectionListener iSignalCollectionListener = this.f18081a;
            if (size > 0) {
                str = new JSONObject(hashMap).toString();
            } else if (str2 == null) {
                str = "";
            } else {
                iSignalCollectionListener.onSignalsCollectionFailed(str2);
                return;
            }
            iSignalCollectionListener.onSignalsCollected(str);
        }
    }

    public SignalsReader(SignalsStorage signalsStorage) {
        f18080a = signalsStorage;
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalsReader
    public void getSCARSignals(Context context, String[] strArr, String[] strArr2, ISignalCollectionListener iSignalCollectionListener) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        for (String str : strArr) {
            dispatchGroup.enter();
            AdFormat adFormat = AdFormat.INTERSTITIAL;
            AdRequest build = new AdRequest.Builder().build();
            QueryInfoMetadata queryInfoMetadata = new QueryInfoMetadata(str);
            QueryInfoCallback queryInfoCallback = new QueryInfoCallback(queryInfoMetadata, dispatchGroup);
            f18080a.put(str, queryInfoMetadata);
            QueryInfo.generate(context, adFormat, build, queryInfoCallback);
        }
        for (String str2 : strArr2) {
            dispatchGroup.enter();
            AdFormat adFormat2 = AdFormat.REWARDED;
            AdRequest build2 = new AdRequest.Builder().build();
            QueryInfoMetadata queryInfoMetadata2 = new QueryInfoMetadata(str2);
            QueryInfoCallback queryInfoCallback2 = new QueryInfoCallback(queryInfoMetadata2, dispatchGroup);
            f18080a.put(str2, queryInfoMetadata2);
            QueryInfo.generate(context, adFormat2, build2, queryInfoCallback2);
        }
        dispatchGroup.notify(new RunnableC9281a(iSignalCollectionListener));
    }
}
