package mobile.optimgeek.com.agbase

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.pm.PackageInfo
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.view.View
import groovy.transform.CompileStatic

import java.util.zip.Inflater


@CompileStatic
class OGDialogs {

    static AlertDialog quickie(AppCompatActivity actContainer, String strTitle, String htmlMsg) {
        PackageInfo pInfo = actContainer.getPackageManager().getPackageInfo(actContainer.getPackageName(), 0)
        String strHtml = """${(htmlMsg != null)?htmlMsg:'?'}
                            <p>${actContainer.getResources().getString(R.string.my_copyright)}</p>
                            <p>version <b>${pInfo.versionName}</b></p>"""
        return new AlertDialog.Builder(actContainer).
                setIcon(R.mipmap.ic_attach_file_black_24dp).
                setTitle(strTitle).
                setMessage(Html.fromHtml(strHtml)).
                setCancelable(false).
                setPositiveButton("OK", { DialogInterface dialogInterface, int i -> } as DialogInterface.OnClickListener).
                show()

        // ur attn please:
        // http://stackoverflow.com/questions/14652894/using-html-in-android-alert-dialog
        // http://stackoverflow.com/questions/37082305/android-alertdialog-builder-better-code
        //TODO: add background
    }

    static AlertDialog quickie(AppCompatActivity actContainer, int strTitle, int htmlMsg) {
        return OGDialogs.quickie(actContainer,
                            actContainer.getResources().getString(strTitle),
                            actContainer.getResources().getString(htmlMsg))
    }

}
