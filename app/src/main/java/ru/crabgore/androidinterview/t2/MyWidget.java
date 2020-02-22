package ru.crabgore.androidinterview.t2;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;

import ru.crabgore.androidinterview.R;

public class MyWidget extends AppWidgetProvider {
    public static String ACTION_WIDGET_RECEIVER = "ActionReceiverWidget";

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget);

        Intent intent = new Intent(context, MyWidget.class);
        intent.setAction(ACTION_WIDGET_RECEIVER);
        intent.putExtra("msg", "MyButton Pressed!");

        PendingIntent actionPendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);

        remoteViews.setOnClickPendingIntent(R.id.btn, actionPendingIntent);

        appWidgetManager.updateAppWidget(appWidgetIds, remoteViews);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();

        if (ACTION_WIDGET_RECEIVER.equals(action)) {
            String msg = intent.getStringExtra("msg");
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }

        super.onReceive(context, intent);
    }
}
