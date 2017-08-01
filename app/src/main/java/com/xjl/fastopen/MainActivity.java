package com.xjl.fastopen;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import shortbread.Shortcut;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();
    }

    @Shortcut(id = "aliPay", icon = R.drawable.weixiao, shortLabel = "支付宝付款")
    public void aliPay() {
        Uri uri = Uri.parse("alipayqr://platformapi/startapp?saId=20000056");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        finish();
    }

    @Shortcut(id = "aliScan", icon = R.drawable.weixiao, shortLabel = "支付宝扫一扫")
    public void aliScan() {
        Uri uri = Uri.parse("alipayqr://platformapi/startapp?saId=10000007");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        finish();
    }

    @Shortcut(id = "weChatScan", icon = R.drawable.weixin, shortLabel = "微信扫一扫")
    public void weChatScan() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI"));
        intent.putExtra("LauncherUI.From.Scaner.Shortcut", true);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
        finish();
    }

    @Shortcut(id = "weChatPay", icon = R.drawable.naguo, shortLabel = "微信支付")
    public void weChatPay() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI"));
        intent.putExtra("LauncherUI.From.Purse.Shortcut", true);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setAction("android.intent.action.VIEW");
        startActivity(intent);
        finish();
    }
}
