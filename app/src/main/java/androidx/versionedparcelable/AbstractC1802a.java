package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.C0470b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
public abstract class AbstractC1802a {

    /* renamed from: a */
    public final C0470b<String, Method> f4386a;

    /* renamed from: b */
    public final C0470b<String, Method> f4387b;

    /* renamed from: c */
    public final C0470b<String, Class> f4388c;

    public AbstractC1802a(C0470b<String, Method> c0470b, C0470b<String, Method> c0470b2, C0470b<String, Class> c0470b3) {
        this.f4386a = c0470b;
        this.f4387b = c0470b2;
        this.f4388c = c0470b3;
    }

    /* renamed from: a */
    public abstract C1803b mo9928a();

    /* renamed from: b */
    public final Class m9936b(Class<? extends InterfaceC1804c> cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0470b<String, Class> c0470b = this.f4388c;
        Class orDefault = c0470b.getOrDefault(name, null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            c0470b.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    /* renamed from: c */
    public final Method m9935c(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        C0470b<String, Method> c0470b = this.f4386a;
        Method orDefault = c0470b.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC1802a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1802a.class);
            c0470b.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    /* renamed from: d */
    public final Method m9934d(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0470b<String, Method> c0470b = this.f4387b;
        Method orDefault = c0470b.getOrDefault(name, null);
        if (orDefault == null) {
            Class m9936b = m9936b(cls);
            System.currentTimeMillis();
            Method declaredMethod = m9936b.getDeclaredMethod("write", cls, AbstractC1802a.class);
            c0470b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    /* renamed from: e */
    public abstract boolean mo9927e();

    /* renamed from: f */
    public abstract byte[] mo9926f();

    /* renamed from: g */
    public abstract CharSequence mo9925g();

    /* renamed from: h */
    public abstract boolean mo9924h(int i);

    /* renamed from: i */
    public abstract int mo9923i();

    /* renamed from: j */
    public final int m9933j(int i, int i2) {
        return !mo9924h(i2) ? i : mo9923i();
    }

    /* renamed from: k */
    public abstract <T extends Parcelable> T mo9922k();

    /* renamed from: l */
    public final <T extends Parcelable> T m9932l(T t, int i) {
        return !mo9924h(i) ? t : (T) mo9922k();
    }

    /* renamed from: m */
    public abstract String mo9921m();

    /* renamed from: n */
    public final <T extends InterfaceC1804c> T m9931n() {
        String mo9921m = mo9921m();
        if (mo9921m == null) {
            return null;
        }
        try {
            return (T) m9935c(mo9921m).invoke(null, mo9928a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: o */
    public abstract void mo9920o(int i);

    /* renamed from: p */
    public abstract void mo9919p(boolean z);

    /* renamed from: q */
    public abstract void mo9918q(byte[] bArr);

    /* renamed from: r */
    public abstract void mo9917r(CharSequence charSequence);

    /* renamed from: s */
    public abstract void mo9916s(int i);

    /* renamed from: t */
    public final void m9930t(int i, int i2) {
        mo9920o(i2);
        mo9916s(i);
    }

    /* renamed from: u */
    public abstract void mo9915u(Parcelable parcelable);

    /* renamed from: v */
    public abstract void mo9914v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public final void m9929w(InterfaceC1804c interfaceC1804c) {
        if (interfaceC1804c == null) {
            mo9914v(null);
            return;
        }
        try {
            mo9914v(m9936b(interfaceC1804c.getClass()).getName());
            C1803b mo9928a = mo9928a();
            try {
                m9934d(interfaceC1804c.getClass()).invoke(null, interfaceC1804c, mo9928a);
                mo9928a.m9913x();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC1804c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
