package com.cspm.oos.enums;

/**
 * OOS操作类型DTO
 */
public enum ActionEnum {

    //预览
    VIEW("view"),
    //编辑
    EDIT("edit"),
    //编辑（新版本）
    EDIT_NEW("editnew"),
    //图片预览
    IMAGE_PREVIEW("imagepreview"),
    //交互式预览
    INTERACTIVE_PREVIEW("interactivepreview"),
    //手机预览
    MOBILE_VIEW("mobileView"),
    //嵌入视图
    EMBED_VEIW("embedview");

    //类型
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    ActionEnum(String type) {
        this.type = type;
    }

    public static ActionEnum getType(String type) {
        for (ActionEnum e : ActionEnum.values()) {
            if (e.getType().equals(type)) {
                return e;
            }
        }
        return null;
    }
}
