package com.applovin.impl.mediation.debugger.p021ui.p026d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C3393R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.d */
/* loaded from: classes.dex */
public abstract class AbstractView$OnClickListenerC2961d extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a */
    private List<C2957c> f7298a = new ArrayList();

    /* renamed from: b */
    private Map<Integer, Integer> f7299b = new HashMap();

    /* renamed from: c */
    protected Context f7300c;

    /* renamed from: d */
    private InterfaceC2963a f7301d;

    /* renamed from: e */
    private LayoutInflater f7302e;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.d.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2963a {
        /* renamed from: a */
        void mo8220a(C2955a c2955a, C2957c c2957c);
    }

    public AbstractView$OnClickListenerC2961d(Context context) {
        this.f7300c = context;
    }

    /* renamed from: a */
    private LayoutInflater m8238a() {
        LayoutInflater layoutInflater = this.f7302e;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = (LayoutInflater) this.f7300c.getSystemService("layout_inflater");
        this.f7302e = layoutInflater2;
        return layoutInflater2;
    }

    /* renamed from: e */
    private C2955a m8234e(int i) {
        for (int i2 = 0; i2 < mo8224b(); i2++) {
            Integer num = this.f7299b.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + mo8225a(i2)) {
                    return new C2955a(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public abstract int mo8225a(int i);

    /* renamed from: a */
    public Bitmap m8237a(ListView listView) {
        int count = getCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 1073741824);
        int i = 0;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        ArrayList arrayList = new ArrayList(count);
        int i2 = 0;
        for (int i3 = 0; i3 < count; i3++) {
            View view = getView(i3, null, listView);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            arrayList.add(createBitmap);
            i2 += view.getMeasuredHeight();
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(listView.getMeasuredWidth(), i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) it.next();
            canvas.drawBitmap(bitmap, 0.0f, i, paint);
            i += bitmap.getHeight();
            bitmap.recycle();
        }
        return createBitmap2;
    }

    /* renamed from: a */
    public void m8236a(InterfaceC2963a interfaceC2963a) {
        this.f7301d = interfaceC2963a;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: b */
    public abstract int mo8224b();

    /* renamed from: b */
    public abstract C2957c mo8223b(int i);

    /* renamed from: c */
    public abstract List<C2957c> mo8222c(int i);

    @Override // android.widget.Adapter
    /* renamed from: d */
    public C2957c getItem(int i) {
        return this.f7298a.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7298a.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).m8260i();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C2956b c2956b;
        C2957c item = getItem(i);
        if (view == null) {
            view = m8238a().inflate(item.m8259j(), viewGroup, false);
            c2956b = new C2956b();
            c2956b.f7258a = (TextView) view.findViewById(16908308);
            c2956b.f7259b = (TextView) view.findViewById(16908309);
            c2956b.f7260c = (ImageView) view.findViewById(C3393R.C3396id.imageView);
            c2956b.f7261d = (ImageView) view.findViewById(C3393R.C3396id.detailImageView);
            view.setTag(c2956b);
            view.setOnClickListener(this);
        } else {
            c2956b = (C2956b) view.getTag();
        }
        c2956b.m8270a(i);
        c2956b.m8269a(item);
        view.setEnabled(item.mo8266b());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return C2957c.m8261h();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return getItem(i).mo8266b();
    }

    /* renamed from: j */
    public void m8233j() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.d.d.1
            @Override // java.lang.Runnable
            public void run() {
                AbstractView$OnClickListenerC2961d.this.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: k */
    public C2957c mo8221k() {
        return null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f7298a = new ArrayList();
        Integer num = 0;
        Integer valueOf = Integer.valueOf(mo8224b());
        this.f7299b = new HashMap(valueOf.intValue());
        C2957c mo8221k = mo8221k();
        if (mo8221k != null) {
            this.f7298a.add(mo8221k);
            num = Integer.valueOf(num.intValue() + 1);
        }
        for (int i = 0; i < valueOf.intValue(); i++) {
            Integer valueOf2 = Integer.valueOf(mo8225a(i));
            if (valueOf2.intValue() != 0) {
                this.f7298a.add(mo8223b(i));
                this.f7298a.addAll(mo8222c(i));
                this.f7299b.put(Integer.valueOf(i), num);
                num = Integer.valueOf(valueOf2.intValue() + 1 + num.intValue());
            }
        }
        this.f7298a.add(new C2964e(""));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C2956b c2956b = (C2956b) view.getTag();
        C2957c m8268b = c2956b.m8268b();
        C2955a m8234e = m8234e(c2956b.m8271a());
        InterfaceC2963a interfaceC2963a = this.f7301d;
        if (interfaceC2963a == null || m8234e == null) {
            return;
        }
        interfaceC2963a.mo8220a(m8234e, m8268b);
    }
}
