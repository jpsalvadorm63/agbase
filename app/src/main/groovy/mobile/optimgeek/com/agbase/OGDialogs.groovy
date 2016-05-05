package mobile.optimgeek.com.agbase

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.pm.PackageInfo
import android.support.v7.app.AppCompatActivity
import android.text.Html
import groovy.transform.CompileStatic


@CompileStatic
class OGDialogs {

    static AlertDialog quickie(AppCompatActivity actContainer, String htmlMsg) {
        PackageInfo pInfo = actContainer.getPackageManager().getPackageInfo(actContainer.getPackageName(), 0)

        String strHtml = """${(htmlMsg != null)?htmlMsg:'?'}
                            <p>(c) 2016 - Juan Salvador - OptimGeek.com</b></p>
                            <p>version <b>${pInfo.versionName}</b></p>"""

        AlertDialog.Builder db = new AlertDialog.Builder(actContainer)
        db.setTitle("About this app")
        db.setMessage(Html.fromHtml(strHtml))
        db.cancelable = false
        db.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }
        )
        return db.show()
        // ur attn please: an alternative solution using TextView at
        // http://stackoverflow.com/questions/14652894/using-html-in-android-alert-dialog
    }

}
