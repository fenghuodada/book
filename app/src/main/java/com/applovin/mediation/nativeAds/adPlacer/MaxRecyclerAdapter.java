package com.applovin.mediation.nativeAds.adPlacer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.mediation.p012b.p013a.C2862c;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C3393R;
import java.util.Collection;

/* loaded from: classes.dex */
public class MaxRecyclerAdapter extends RecyclerView.AbstractC1572e<RecyclerView.AbstractC1597y> implements MaxAdPlacer.Listener {

    /* renamed from: a */
    private final MaxAdPlacer f8946a;

    /* renamed from: b */
    private final RecyclerView.AbstractC1572e f8947b;

    /* renamed from: c */
    private final C3390a f8948c;

    /* renamed from: d */
    private RecyclerView f8949d;

    /* renamed from: e */
    private C2862c f8950e;

    /* renamed from: f */
    private MaxAdPlacer.Listener f8951f;

    /* renamed from: g */
    private int f8952g;

    /* loaded from: classes.dex */
    public static class MaxAdRecyclerViewHolder extends RecyclerView.AbstractC1597y {

        /* renamed from: a */
        private final ViewGroup f8954a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f8954a = (ViewGroup) view.findViewById(C3393R.C3396id.native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f8954a;
        }
    }

    /* renamed from: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter$a */
    /* loaded from: classes.dex */
    public class C3390a extends RecyclerView.AbstractC1575g {
        private C3390a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
        @SuppressLint({"NotifyDataSetChanged"})
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
        public void onItemRangeChanged(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.this.f8946a.getAdjustedPosition(i);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f8946a.getAdjustedPosition((i + i2) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
        public void onItemRangeInserted(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.this.f8946a.getAdjustedPosition(i);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.this.f8946a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
        @SuppressLint({"NotifyDataSetChanged"})
        public void onItemRangeMoved(int i, int i2, int i3) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1575g
        public void onItemRangeRemoved(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.this.f8946a.getAdjustedPosition(i);
            int itemCount = MaxRecyclerAdapter.this.f8947b.getItemCount();
            int adjustedCount = MaxRecyclerAdapter.this.f8946a.getAdjustedCount(itemCount + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.this.f8946a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f8946a.getAdjustedCount(itemCount);
            int i4 = adjustedCount - adjustedCount2;
            Collection<Integer> clearTrailingAds = MaxRecyclerAdapter.this.f8946a.clearTrailingAds(adjustedCount2 - 1);
            if (!clearTrailingAds.isEmpty()) {
                i4 += clearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i4 - i2), i4);
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.AbstractC1572e abstractC1572e, Activity activity) {
        C3390a c3390a = new C3390a();
        this.f8948c = c3390a;
        this.f8952g = 8;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f8946a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(abstractC1572e.hasStableIds());
        this.f8947b = abstractC1572e;
        abstractC1572e.registerAdapterDataObserver(c3390a);
    }

    /* renamed from: a */
    private int m6798a(int i) {
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f8949d.getContext(), this.f8949d.getWidth());
        RecyclerView.LayoutManager layoutManager = this.f8949d.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            return (pxToDp / gridLayoutManager.f3578F) * gridLayoutManager.f3583K.mo6385d(i);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            return pxToDp / ((StaggeredGridLayoutManager) layoutManager).f3807p;
        } else {
            return pxToDp;
        }
    }

    public void destroy() {
        try {
            this.f8947b.unregisterAdapterDataObserver(this.f8948c);
        } catch (Exception unused) {
        }
        this.f8946a.destroy();
        C2862c c2862c = this.f8950e;
        if (c2862c != null) {
            c2862c.m8573a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f8946a;
    }

    public int getAdjustedPosition(int i) {
        return this.f8946a.getAdjustedPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public int getItemCount() {
        return this.f8946a.getAdjustedCount(this.f8947b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public long getItemId(int i) {
        if (this.f8947b.hasStableIds()) {
            return this.f8946a.isFilledPosition(i) ? this.f8946a.getAdItemId(i) : this.f8947b.getItemId(this.f8946a.getOriginalPosition(i));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public int getItemViewType(int i) {
        if (this.f8946a.isAdPosition(i)) {
            return -42;
        }
        return this.f8947b.getItemViewType(this.f8946a.getOriginalPosition(i));
    }

    public int getOriginalPosition(int i) {
        return this.f8946a.getOriginalPosition(i);
    }

    public void loadAds() {
        this.f8946a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f8951f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i) {
        notifyItemChanged(i);
        MaxAdPlacer.Listener listener = this.f8951f;
        if (listener != null) {
            listener.onAdLoaded(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i) {
        MaxAdPlacer.Listener listener = this.f8951f;
        if (listener != null) {
            listener.onAdRemoved(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f8951f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f8949d = recyclerView;
        C2862c c2862c = new C2862c(recyclerView);
        this.f8950e = c2862c;
        c2862c.m8570a(new C2862c.InterfaceC2865a() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.1
            @Override // com.applovin.impl.mediation.p012b.p013a.C2862c.InterfaceC2865a
            /* renamed from: a */
            public void mo6794a(int i, int i2) {
                MaxRecyclerAdapter.this.f8946a.updateFillablePositions(i, Math.min(MaxRecyclerAdapter.this.f8952g + i2, MaxRecyclerAdapter.this.getItemCount() - 1));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC1597y abstractC1597y, int i) {
        this.f8950e.m8571a(abstractC1597y.itemView, i);
        if (!this.f8946a.isAdPosition(i)) {
            this.f8947b.onBindViewHolder(abstractC1597y, this.f8946a.getOriginalPosition(i));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f8946a.getAdSize(i, m6798a(i));
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) abstractC1597y).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
            return;
        }
        layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
        layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
        containerView.setLayoutParams(layoutParams);
        this.f8946a.renderAd(i, containerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    @NonNull
    public RecyclerView.AbstractC1597y onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == -42) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C3393R.C3398layout.max_native_ad_recycler_view_item, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            RecyclerView.LayoutManager layoutManager = this.f8949d.getLayoutManager();
            if (layoutManager == null || !layoutManager.mo10232e()) {
                layoutParams.width = -1;
                layoutParams.height = -2;
            } else {
                layoutParams.width = -2;
                layoutParams.height = -1;
            }
            inflate.setLayoutParams(layoutParams);
            return new MaxAdRecyclerViewHolder(inflate);
        }
        return this.f8947b.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f8949d = null;
        C2862c c2862c = this.f8950e;
        if (c2862c != null) {
            c2862c.m8573a();
            this.f8950e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public boolean onFailedToRecycleView(@NonNull RecyclerView.AbstractC1597y abstractC1597y) {
        return abstractC1597y instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(abstractC1597y) : this.f8947b.onFailedToRecycleView(abstractC1597y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC1597y abstractC1597y) {
        if (abstractC1597y instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(abstractC1597y);
        } else {
            this.f8947b.onViewAttachedToWindow(abstractC1597y);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC1597y abstractC1597y) {
        if (abstractC1597y instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(abstractC1597y);
        } else {
            this.f8947b.onViewDetachedFromWindow(abstractC1597y);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public void onViewRecycled(@NonNull RecyclerView.AbstractC1597y abstractC1597y) {
        C2862c c2862c = this.f8950e;
        if (c2862c != null) {
            c2862c.m8572a(abstractC1597y.itemView);
        }
        if (!(abstractC1597y instanceof MaxAdRecyclerViewHolder)) {
            this.f8947b.onViewRecycled(abstractC1597y);
            return;
        }
        if (this.f8946a.isFilledPosition(abstractC1597y.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) abstractC1597y).getContainerView().removeAllViews();
        }
        super.onViewRecycled(abstractC1597y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f8947b.unregisterAdapterDataObserver(this.f8948c);
        this.f8947b.setHasStableIds(z);
        this.f8947b.registerAdapterDataObserver(this.f8948c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f8951f = listener;
    }

    public void setLookAhead(int i) {
        this.f8952g = i;
    }
}
