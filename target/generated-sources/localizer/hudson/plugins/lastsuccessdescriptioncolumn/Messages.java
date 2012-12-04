// CHECKSTYLE:OFF

package hudson.plugins.lastsuccessdescriptioncolumn;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;

@SuppressWarnings({
    "",
    "PMD"
})
public class Messages {

    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * N/A
     * 
     */
    public static String NoDescription() {
        return holder.format("NoDescription");
    }

    /**
     * N/A
     * 
     */
    public static Localizable _NoDescription() {
        return new Localizable(holder, "NoDescription");
    }

    /**
     * N/A
     * 
     */
    public static String NoBuild() {
        return holder.format("NoBuild");
    }

    /**
     * N/A
     * 
     */
    public static Localizable _NoBuild() {
        return new Localizable(holder, "NoBuild");
    }

    /**
     * Last Success Description
     * 
     */
    public static String LastSuccessDescriptionColumn_DisplayName() {
        return holder.format("LastSuccessDescriptionColumn.DisplayName");
    }

    /**
     * Last Success Description
     * 
     */
    public static Localizable _LastSuccessDescriptionColumn_DisplayName() {
        return new Localizable(holder, "LastSuccessDescriptionColumn.DisplayName");
    }

}
