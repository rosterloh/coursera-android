package course.labs.notificationslab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class DoAlarm extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent)
	{
		Toast.makeText(context, "Alarm triggered", Toast.LENGTH_SHORT).show();
	}
}