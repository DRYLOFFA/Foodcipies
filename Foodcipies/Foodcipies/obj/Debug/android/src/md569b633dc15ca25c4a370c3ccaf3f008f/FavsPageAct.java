package md569b633dc15ca25c4a370c3ccaf3f008f;


public class FavsPageAct
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Foodcipies.FavsPageAct, Foodcipies", FavsPageAct.class, __md_methods);
	}


	public FavsPageAct ()
	{
		super ();
		if (getClass () == FavsPageAct.class)
			mono.android.TypeManager.Activate ("Foodcipies.FavsPageAct, Foodcipies", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
