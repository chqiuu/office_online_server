package com.cspm.oos.enums;

/**
 * 枚举
 * Created by CHQIU on 2017-09-13.
 */
public enum WopiDiscoveryEnum {

    Word_view_doc(ActionEnum.VIEW, "doc", true, null, "<OOS>/wv/wordviewerframe.aspx?<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    Word_view_docm(ActionEnum.VIEW, "docm", true, null, "<OOS>/wv/wordviewerframe.aspx?<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    Word_view_docx(ActionEnum.VIEW, "docx", true, null, "<OOS>/wv/wordviewerframe.aspx?<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    Word_view_dot(ActionEnum.VIEW, "dot", true, null, "<OOS>/wv/wordviewerframe.aspx?<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    Word_view_dotm(ActionEnum.VIEW, "dotm", true, null, "<OOS>/wv/wordviewerframe.aspx?<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    Word_view_dotx(ActionEnum.VIEW, "dotx", true, null, "<OOS>/wv/wordviewerframe.aspx?<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    Word_view_odt(ActionEnum.VIEW, "odt", true, null, "<OOS>/wv/wordviewerframe.aspx?<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),

    Word_edit_docm(ActionEnum.EDIT, "docm", null, "locks,cobalt,update", "<OOS>/we/wordeditorframe.aspx?<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    Word_edit_docx(ActionEnum.EDIT, "docx", null, "locks,cobalt,update", "<OOS>/we/wordeditorframe.aspx?<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    Word_edit_odt(ActionEnum.EDIT, "odt", null, "locks,cobalt,update", "<OOS>/we/wordeditorframe.aspx?<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    Word_editnew_docx(ActionEnum.EDIT_NEW, "docx", null, "locks,cobalt,update", "<OOS>/we/wordeditorframe.aspx?new=1&<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    Word_editnew_dotx(ActionEnum.EDIT_NEW, "dotx", null, "locks,cobalt,update", "<OOS>/we/wordeditorframe.aspx?new=1&<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    Word_editnew_odt(ActionEnum.EDIT_NEW, "odt", null, "locks,cobalt,update", "<OOS>/we/wordeditorframe.aspx?new=1&<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),

    Excel_view_ods(ActionEnum.VIEW, "ods", true, null, "<OOS>/x/_layouts/xlviewerinternal.aspx?<ui=UI_LLCC&><rs=DC_LLCC&>"),
    Excel_view_xls(ActionEnum.VIEW, "xls", true, null, "<OOS>/x/_layouts/xlviewerinternal.aspx?<ui=UI_LLCC&><rs=DC_LLCC&>"),
    Excel_view_xlsb(ActionEnum.VIEW, "xlsb", true, null, "<OOS>/x/_layouts/xlviewerinternal.aspx?<ui=UI_LLCC&><rs=DC_LLCC&>"),
    Excel_view_xlsm(ActionEnum.VIEW, "xlsm", true, null, "<OOS>/x/_layouts/xlviewerinternal.aspx?<ui=UI_LLCC&><rs=DC_LLCC&>"),
    Excel_view_xlsx(ActionEnum.VIEW, "xlsx", true, null, "<OOS>/x/_layouts/xlviewerinternal.aspx?<ui=UI_LLCC&><rs=DC_LLCC&>"),
    Excel_edit_ods(ActionEnum.EDIT, "ods", null, "update", "<OOS>/x/_layouts/xlviewerinternal.aspx?edit=1&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    Excel_edit_xls(ActionEnum.EDIT, "xls", null, "update", "<OOS>/x/_layouts/xlviewerinternal.aspx?edit=1&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    Excel_edit_xlsb(ActionEnum.EDIT, "xlsb", null, "update", "<OOS>/x/_layouts/xlviewerinternal.aspx?edit=1&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    Excel_edit_xlsm(ActionEnum.EDIT, "xlsm", null, "update", "<OOS>/x/_layouts/xlviewerinternal.aspx?edit=1&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    Excel_edit_xlsx(ActionEnum.EDIT, "xlsx", null, "update", "<OOS>/x/_layouts/xlviewerinternal.aspx?edit=1&<ui=UI_LLCC&><rs=DC_LLCC&>"),

    PowerPoint_view_odp(ActionEnum.VIEW, "odp", true, null, "<OOS>/p/PowerPointFrame.aspx?PowerPointView=ReadingView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_view_pot(ActionEnum.VIEW, "pot", true, null, "<OOS>/p/PowerPointFrame.aspx?PowerPointView=ReadingView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_view_potm(ActionEnum.VIEW, "potm", true, null, "<OOS>/p/PowerPointFrame.aspx?PowerPointView=ReadingView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_view_potx(ActionEnum.VIEW, "potx", true, null, "<OOS>/p/PowerPointFrame.aspx?PowerPointView=ReadingView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_view_pps(ActionEnum.VIEW, "pps", true, null, "<OOS>/p/PowerPointFrame.aspx?PowerPointView=ReadingView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_view_ppsm(ActionEnum.VIEW, "ppsm", true, null, "<OOS>/p/PowerPointFrame.aspx?PowerPointView=ReadingView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_view_ppsx(ActionEnum.VIEW, "ppsx", true, null, "<OOS>/p/PowerPointFrame.aspx?PowerPointView=ReadingView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_view_ppt(ActionEnum.VIEW, "ppt", true, null, "<OOS>/p/PowerPointFrame.aspx?PowerPointView=ReadingView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_view_pptm(ActionEnum.VIEW, "pptm", true, null, "<OOS>/p/PowerPointFrame.aspx?PowerPointView=ReadingView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_view_pptx(ActionEnum.VIEW, "pptx", true, null, "<OOS>/p/PowerPointFrame.aspx?PowerPointView=ReadingView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_edit_odp(ActionEnum.EDIT, "odp", null, "update", "<OOS>/p/PowerPointFrame.aspx?PowerPointView=EditView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_edit_ppsx(ActionEnum.EDIT, "ppsx", null, "update", "<OOS>/p/PowerPointFrame.aspx?PowerPointView=EditView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_edit_pptx(ActionEnum.EDIT, "pptx", null, "update", "<OOS>/p/PowerPointFrame.aspx?PowerPointView=EditView&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_editnew_odp(ActionEnum.EDIT_NEW, "odp", null, "update", "<OOS>/p/PowerPointFrame.aspx?PowerPointView=EditView&New=1&<ui=UI_LLCC&><rs=DC_LLCC&>"),
    PowerPoint_editnew_pptx(ActionEnum.EDIT_NEW, "pptx", null, "update", "<OOS>/p/PowerPointFrame.aspx?PowerPointView=EditView&New=1&<ui=UI_LLCC&><rs=DC_LLCC&>"),

    WordPdf_view_pdf(ActionEnum.VIEW, "pdf", true, null, "<OOS>/wv/wordviewerframe.aspx?PdfMode=1&<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    WordPdf_imagepreview_pdf(ActionEnum.IMAGE_PREVIEW, "pdf", null, null, "<OOS>/wv/WordPreviewHandler.ashx?PdfMode=1&<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    WordPdf_interactivepreview_pdf(ActionEnum.INTERACTIVE_PREVIEW, "pdf", null, null, "<OOS>/wv/wordviewerframe.aspx?embed=1&PdfMode=1&<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    WordPdf_mobileView_pdf(ActionEnum.MOBILE_VIEW, "pdf", null, null, "<OOS>/wv/wordviewerframe.aspx?PdfMode=1&<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>"),
    WordPdf_embedview_pdf(ActionEnum.EMBED_VEIW, "pdf", null, null, "<OOS>/wv/wordviewerframe.aspx?embed=1&PdfMode=1&<ui=UI_LLCC&><rs=DC_LLCC&><showpagestats=PERFSTATS&>");

    //操作类型
    private ActionEnum action;
    private String ext;
    private Boolean isDefault;
    private String requires;
    private String urlsrc;

    WopiDiscoveryEnum(ActionEnum action, String ext, Boolean isDefault, String requires, String urlsrc) {
        this.action = action;
        this.ext = ext;
        this.isDefault = isDefault;
        this.requires = requires;
        this.urlsrc = urlsrc;
    }

    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public String getRequires() {
        return requires;
    }

    public void setRequires(String requires) {
        this.requires = requires;
    }

    public String getUrlsrc() {
        return urlsrc;
    }

    public void setUrlsrc(String urlsrc) {
        this.urlsrc = urlsrc;
    }

    public static WopiDiscoveryEnum getActionExt(ActionEnum action, String ext) {
        for (WopiDiscoveryEnum e : WopiDiscoveryEnum.values()) {
            if (e.getAction().equals(action) && e.getExt().equals(ext)) {
                /*
                    OOS可用在线预览地址
                    https://docview.mingdao.com
                    http://office.scaqjg.com
                    http://owas.sciencepeditor.com
                    http://oos.sciencepeditor.com
                 */
                e.setUrlsrc(e.getUrlsrc().replaceAll("<OOS>", "http://oos.sciencepeditor.com"));
                return e;
            }
        }
        return null;
    }
}
