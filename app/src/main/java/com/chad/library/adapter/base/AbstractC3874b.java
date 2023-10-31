package com.chad.library.adapter.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.listener.InterfaceC3876a;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.chad.library.adapter.base.b */
/* loaded from: classes.dex */
public abstract class AbstractC3874b<T, VH extends BaseViewHolder> extends RecyclerView.AbstractC1572e<VH> {
    @NotNull

    /* renamed from: h */
    public List<T> f9967h;

    /* renamed from: i */
    public boolean f9968i;

    /* renamed from: j */
    public FrameLayout f9969j;

    /* renamed from: k */
    public InterfaceC3876a f9970k;
    @Nullable

    /* renamed from: l */
    public RecyclerView f9971l;

    /* renamed from: m */
    public final int f9972m;

    /* renamed from: com.chad.library.adapter.base.b$a */
    /* loaded from: classes.dex */
    public static final class C3875a extends GridLayoutManager.AbstractC1556c {

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.LayoutManager f9974e;

        /* renamed from: f */
        public final /* synthetic */ GridLayoutManager.AbstractC1556c f9975f;

        public C3875a(RecyclerView.LayoutManager layoutManager, GridLayoutManager.AbstractC1556c abstractC1556c) {
            this.f9974e = layoutManager;
            this.f9975f = abstractC1556c;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1556c
        /* renamed from: d */
        public final int mo6385d(int i) {
            boolean z;
            int itemViewType = AbstractC3874b.this.getItemViewType(i);
            if (itemViewType != 268436821 && itemViewType != 268435729 && itemViewType != 268436275 && itemViewType != 268436002) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return ((GridLayoutManager) this.f9974e).f3578F;
            }
            return this.f9975f.mo6385d(i);
        }
    }

    @JvmOverloads
    public AbstractC3874b(@LayoutRes int i, @Nullable List<T> list) {
        this.f9972m = i;
        this.f9967h = list == null ? new ArrayList<>() : list;
        this.f9968i = true;
        new LinkedHashSet();
        new LinkedHashSet();
    }

    /* renamed from: a */
    public abstract void mo6389a(@NotNull VH vh, T t);

    @NotNull
    /* renamed from: b */
    public final VH m6388b(@NotNull View view) {
        VH vh;
        T newInstance;
        Type[] actualTypeArguments;
        C10843j.m430f(view, "view");
        Class<?> cls = getClass();
        BaseViewHolder baseViewHolder = null;
        Class cls2 = null;
        while (true) {
            if (cls2 != null || cls == null) {
                break;
            }
            try {
                Type genericSuperclass = cls.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    for (Type type : ((ParameterizedType) genericSuperclass).getActualTypeArguments()) {
                        if (type instanceof Class) {
                            if (BaseViewHolder.class.isAssignableFrom((Class) type)) {
                                cls2 = (Class) type;
                                break;
                            }
                        } else {
                            if (type instanceof ParameterizedType) {
                                type = ((ParameterizedType) type).getRawType();
                                if ((type instanceof Class) && BaseViewHolder.class.isAssignableFrom((Class) type)) {
                                    cls2 = (Class) type;
                                    break;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } catch (TypeNotPresentException | GenericSignatureFormatError | MalformedParameterizedTypeException e) {
                e.printStackTrace();
            }
            cls2 = null;
            cls = cls.getSuperclass();
        }
        if (cls2 == null) {
            vh = (VH) new BaseViewHolder(view);
        } else {
            try {
                if (cls2.isMemberClass() && !Modifier.isStatic(cls2.getModifiers())) {
                    Constructor<T> declaredConstructor = cls2.getDeclaredConstructor(getClass(), View.class);
                    C10843j.m431e(declaredConstructor, "z.getDeclaredConstructor…aClass, View::class.java)");
                    declaredConstructor.setAccessible(true);
                    newInstance = declaredConstructor.newInstance(this, view);
                    if (newInstance == null) {
                        throw new NullPointerException("null cannot be cast to non-null type VH");
                    }
                } else {
                    Constructor<T> declaredConstructor2 = cls2.getDeclaredConstructor(View.class);
                    C10843j.m431e(declaredConstructor2, "z.getDeclaredConstructor(View::class.java)");
                    declaredConstructor2.setAccessible(true);
                    newInstance = declaredConstructor2.newInstance(view);
                    if (newInstance == null) {
                        throw new NullPointerException("null cannot be cast to non-null type VH");
                    }
                }
                baseViewHolder = (BaseViewHolder) newInstance;
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                e2.printStackTrace();
            }
            vh = (VH) baseViewHolder;
        }
        return vh != null ? vh : (VH) new BaseViewHolder(view);
    }

    /* renamed from: c */
    public final boolean m6387c() {
        FrameLayout frameLayout = this.f9969j;
        if (frameLayout != null) {
            if (frameLayout == null) {
                C10843j.m424l("mEmptyLayout");
                throw null;
            } else if (frameLayout.getChildCount() != 0 && this.f9968i) {
                return this.f9967h.isEmpty();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    /* renamed from: d */
    public final void onBindViewHolder(@NotNull VH holder, int i) {
        C10843j.m430f(holder, "holder");
        switch (holder.getItemViewType()) {
            case 268435729:
            case 268436002:
            case 268436275:
            case 268436821:
                return;
            default:
                mo6389a(holder, this.f9967h.get(i + 0));
                return;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final int getItemCount() {
        if (m6387c()) {
            return 1;
        }
        return this.f9967h.size() + 0 + 0 + 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final int getItemViewType(int i) {
        if (m6387c()) {
            if (i != 0 && (i == 1 || i == 2)) {
                return 268436275;
            }
            return 268436821;
        }
        int size = this.f9967h.size();
        if (i < size) {
            return super.getItemViewType(i);
        }
        if (i - size < 0) {
            return 268436275;
        }
        return 268436002;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        C10843j.m430f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        new WeakReference(recyclerView);
        this.f9971l = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f3583K = new C3875a(layoutManager, gridLayoutManager.f3583K);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final void onBindViewHolder(RecyclerView.AbstractC1597y abstractC1597y, int i, List payloads) {
        BaseViewHolder holder = (BaseViewHolder) abstractC1597y;
        C10843j.m430f(holder, "holder");
        C10843j.m430f(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i);
            return;
        }
        switch (holder.getItemViewType()) {
            case 268435729:
            case 268436002:
            case 268436275:
            case 268436821:
                return;
            default:
                this.f9967h.get(i + 0);
                return;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final RecyclerView.AbstractC1597y onCreateViewHolder(ViewGroup parent, int i) {
        C10843j.m430f(parent, "parent");
        switch (i) {
            case 268435729:
                C10843j.m424l("mHeaderLayout");
                throw null;
            case 268436002:
                C10843j.m433c(null);
                throw null;
            case 268436275:
                C10843j.m424l("mFooterLayout");
                throw null;
            case 268436821:
                FrameLayout frameLayout = this.f9969j;
                if (frameLayout != null) {
                    ViewParent parent2 = frameLayout.getParent();
                    if (parent2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent2;
                        FrameLayout frameLayout2 = this.f9969j;
                        if (frameLayout2 != null) {
                            viewGroup.removeView(frameLayout2);
                        } else {
                            C10843j.m424l("mEmptyLayout");
                            throw null;
                        }
                    }
                    FrameLayout frameLayout3 = this.f9969j;
                    if (frameLayout3 != null) {
                        return m6388b(frameLayout3);
                    }
                    C10843j.m424l("mEmptyLayout");
                    throw null;
                }
                C10843j.m424l("mEmptyLayout");
                throw null;
            default:
                View inflate = LayoutInflater.from(parent.getContext()).inflate(this.f9972m, parent, false);
                C10843j.m431e(inflate, "LayoutInflater.from(this…layoutResId, this, false)");
                VH m6388b = m6388b(inflate);
                if (this.f9970k != null) {
                    m6388b.itemView.setOnClickListener(new View$OnClickListenerC3873a(this, m6388b));
                    return m6388b;
                }
                return m6388b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        C10843j.m430f(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f9971l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
    public final void onViewAttachedToWindow(RecyclerView.AbstractC1597y abstractC1597y) {
        boolean z;
        BaseViewHolder holder = (BaseViewHolder) abstractC1597y;
        C10843j.m430f(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int itemViewType = holder.getItemViewType();
        if (itemViewType != 268436821 && itemViewType != 268435729 && itemViewType != 268436275 && itemViewType != 268436002) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View view = holder.itemView;
            C10843j.m431e(view, "holder.itemView");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.C1600c) {
                ((StaggeredGridLayoutManager.C1600c) layoutParams).f3827f = true;
            }
        }
    }
}
