package com.cspm.oos.dto;

import java.util.Arrays;

/**
 * OFFICE文件属性
 * Created by CHQIU on 2017-07-27.
 */
public class OfficeFileInfoDto {

    /**
     * AllowAdditionalMicrosoftServices：一个布尔值，指示WOPI客户端允许与外部Microsoft服务的连接提供其他功能。如果该值为false，则WOPI客户端不得允许这样的连接。
     * A Boolean value that indicates the WOPI client allows connections to external Microsoft services to provide additional functionality. If this value is false, then the WOPI client MUST NOT allow such connections.
     */
    private Boolean AllowAdditionalMicrosoftServices;
    //AllowExternalMarketplace：一个布尔值，指示WOPI客户端允许连接到文件中引用的外部服务（例如，嵌入式JavaScript应用程序的市场）。如果该值为false，则WOPI客户端不得允许这样的连接。
    private Boolean AllowExternalMarketplace;
    //BaseFileName：没有路径的文件的名称。用于在用户界面（UI）中显示，并确定文件的扩展名。
    private String BaseFileName;
    //BreadcrumbBrandName：一个字符串，该WOPI客户端显示，以指示WOPI服务器的品牌名称的用户。
    private String BreadcrumbBrandName;
    //BreadcrumbBrandUrl：当用户单击显示BreadcrumbBrandName的 UI时，WOPI客户端导航到的网页的URI 。
    private String BreadcrumbBrandUrl;
    //BreadcrumbDocName：一个字符串，该WOPI客户端显示，以表示该文件的名称的用户。
    private String BreadcrumbDocName;
    //BreadcrumbDocUrl：当用户单击显示BreadcrumbDocName的 UI时，WOPI客户端导航到的网页的URI 。
    private String BreadcrumbDocUrl;
    //BreadcrumbFolderName： WOPI客户端向用户显示的一个字符串，指示包含该文件的文件夹的名称。
    private String BreadcrumbFolderName;
    //BreadcrumbFolderUrl：当用户单击显示BreadcrumbFolderName的 UI时，WOPI客户端导航到的网页的URI 。
    private String BreadcrumbFolderUrl;
    //ClientUrl：直接用于通过客户机打开文件的文件的用户可访问的URI。可以是DAV URL（[RFC5323]），但可以是客户端可以打开给定类型的文件的任何URL。
    private String ClientUrl;
    //CloseButtonClosesWindow：一个布尔值，表示当用户调用close UI时，WOPI客户端应关闭包含WOPI客户端输出的浏览器窗口。
    private Boolean CloseButtonClosesWindow;
    //ClosePostMessage：一个布尔值，表示WOPI客户端应该在用户关闭当前使用该文件的呈现或编辑客户端的情况下通知WOPI服务器。
    private Boolean ClosePostMessage;
    //CloseURL：当用户关闭当前使用该文件的呈现或编辑客户端时，实现者认为对用户有用的URI的URI。
    private Boolean CloseURL;
    //DisableBrowserCachingOfUserContent：一个布尔值，表示WOPI客户端必须禁用缓存浏览器缓存中的文件内容。
    private Boolean DisableBrowserCachingOfUserContent;
    //DisablePrint：一个布尔值，表示WOPI客户端必须禁用其控制下的任何打印功能。
    private Boolean DisablePrint;
    //DisableTranslation：一个布尔值，表示WOPI客户端不得允许使用由WOPI客户端公开的机器翻译功能。
    private Boolean DisableTranslation;
    //DownloadUrl：用户可访问的URI，用于允许用户下载该文件的副本。
    private String DownloadUrl;
    //EditAndReplyUrl：使用WOPI客户端为文件提供编辑体验的网页的URI。
    private String EditAndReplyUrl;
    //EditModePostMessage：一个布尔值，表示WOPI客户端应在用户尝试编辑文件的情况下通知WOPI服务器。
    private Boolean EditModePostMessage;
    //EditNotificationPostMessage：一个布尔值，表示WOPI客户端应在用户尝试编辑该文件的情况下通知WOPI服务器。
    private Boolean EditNotificationPostMessage;
    //FileExtension：一个字符串指定文件扩展名的文件。该值必须以“.”开头
    private String FileExtension;
    //FileNameMaxLength：一个整数，指示文件名的最大长度，包括文件扩展名，由WOPI服务器支持。
    private Integer FileNameMaxLength;
    //FileSharingUrl：允许用户共享文件的位置的URI。
    private String FileSharingUrl;
    //FileSharingPostMessage：一个布尔值，表示WOPI客户端应在用户尝试共享文件的情况下通知WOPI服务器。
    private Boolean FileSharingPostMessage;
    //FileUrl： WOPI客户端用于获取文件的文件位置的URI。如果提供这一点，WOPI客户端必须使用此URI来获取文件，而不是HTTP：// server / <...> / wopi * / files / <id> / contents （参见第3.3.5.3节）。
    private String FileUrl;
    //HostAuthenticationId：一个字符串所使用由WOPI服务器唯一地识别用户。
    private String HostAuthenticationId;
    //HostEditUrl：使用WOPI客户端为文件提供编辑体验的网页的URI。
    private String HostEditUrl;
    //HostEmbeddedEditUrl：一个网页的URI，可以访问可嵌入另一个HTML页面的文件的编辑体验。例如，提供可以插入到博客的HTML中的HTML代码段的页面。
    private String HostEmbeddedEditUrl;
    //HostEmbeddedViewUrl：提供对可嵌入另一个HTML页面的文件的访问体验的网页的URI。例如，提供可以插入到博客的HTML中的HTML代码段的页面。
    private String HostEmbeddedViewUrl;
    // HostName：一个字符串，这是用来识别它记录和其他信息为目的的WOPI服务器提供的名称。
    private String HostName;
    // HostNotes：一个字符串所使用由WOPI服务器任意信息传递给WOPI客户端。如果无法识别内容，WOPI客户端可能会忽略该字符串。WOPI服务器不得要求WOPI客户端了解此字符串的内容进行操作。
    private String HostNotes;
    // HostRestUrl：作为文件的REST操作的基本URI的URI 。
    private String HostRestUrl;
    // HostViewUrl：使用WOPI客户端为文件提供查看体验的网页的URI。
    private String HostViewUrl;
    // IrmPolicyDescription：一个字符串，该WOPI客户端应显示为指示用户信息权限管理（IRM）的文件政策。该值应与IrmPolicyTitle结合使用。
    private String IrmPolicyDescription;
    // IrmPolicyTitle：一个字符串，该WOPI客户端应该显示指示该文件的IRM策略的用户。该值应与IrmPolicyDescription结合使用。
    private String IrmPolicyTitle;
    // LicenseCheckInEditIsEnabled：一个布尔值，表示WOPI客户端应该采取措施确保用户在允许编辑文件之前获得正确的许可。
    private Boolean LicenseCheckInEditIsEnabled;
    // OwnerId：一个字符串应该唯一标识文件的所有者。
    private String OwnerId;
    // PostMessageOrigin：当发送消息时，WOPI客户端必须用作targetOrigin参数的字符串，如[W3C-HTML5WEBMSG]中所述。
    private String PostMessageOrigin;
    // PresenceProvider：一个字符串，用于标识WOPI客户端用于发现有关用户在线状态的信息的信息提供者（例如，用户是否可通过即时通讯使用）。WOPI客户需要具体的存在提供者的知识才能够利用这一价值。
    private String PresenceProvider;
    // PresenceUserId：一个字符串，标识的上下文中的用户PresenceProvider。
    private String PresenceUserId;
    // PrivacyUrl：说明WOPI服务器隐私政策的网页的URI。
    private String PrivacyUrl;
    // ProtectInClient：一个布尔值，表示WOPI客户端应采取措施防止复制和打印文件。这旨在帮助在WOPI客户端实施IRM。
    private Boolean ProtectInClient;
    // ReadOnly：表示该用户无法更改该文件。
    private Boolean ReadOnly;
    // RestrictedWebViewOnly：一个布尔值，表示WOPI客户端不得允许用户下载文件或在单独的应用程序中打开该文件。
    private Boolean RestrictedWebViewOnly;
    // SHA256：如果它是存在且不为空，则它是文件内容的256位SHA-2编码[FIPS180-2]散列。<2>
    private String SHA256;
    // SignInUrl：将当前用户签入WOPI服务器支持的认证系统的URI。
    private String SignInUrl;
    //SignoutUrl：一个将当前用户从WOPI服务器支持的身份验证系统中签署的URI。
    private String SignoutUrl;
    // Size：以字节表示的文件大小。
    private Integer Size;
    //SupportedShareUrlTypes：一组字符串， 指示WOPI服务器支持的共享URL类型。
    private String[] SupportedShareUrlTypes;
    //SupportsCoauth：一个布尔值，表示WOPI服务器支持多个用户同时更改此文件。<3>
    private Boolean SupportsCoauth;
    //SupportsCobalt：一个布尔值，指示WOPI服务器支持ExecuteCellStorageRequest（见3.3.5.1.4）和ExcecuteCellStorageRelativeRequest （见3.3.5.1.3）操作此文件。
    private Boolean SupportsCobalt;
    //SupportsExtendedLockLength：一个布尔值，表示WOPI服务器支持长达1024个ASCII字符的锁定标识。<4>
    private Boolean SupportsExtendedLockLength;
    //SupportsFileCreation：一个布尔值，表示WOPI服务器支持使用WOPI客户端创建新文件。<5>
    private Boolean SupportsFileCreation;
    //SupportsFolders：一个布尔值，表示WOPI服务器支持该文件的EnumerateChildren（参见3.3.5.4.1）和DeleteFile （见3.3.5.1.2节）操作。
    private Boolean SupportsFolders;
    //SupportsGetLock：一个布尔值，表示WOPI服务器支持GetLock（参见3.3.5.1.5）。<6>
    private Boolean SupportsGetLock;
    //SupportsLocks：一个布尔值，该值指示该WOPI服务器支持锁定（见 节3.3.5.1.8），解锁 （见 节3.3.5.1.15）， RefreshLock（参见3.3.5.1.12），和UnlockAndRelock （见3.3.5.1.16）此文件的操作。
    private Boolean SupportsLocks;
    //SupportsRename：一个布尔值，该值指示该WOPI服务器支持RenameFile（参见3.3.5.1.13）。<7>
    private Boolean SupportsRename;
    //SupportsScenarioLinks：一个布尔值，表示WOPI服务器支持用户通过受限URL有限方式对文件进行操作的方案。
    private Boolean SupportsScenarioLinks;
    //SupportsSecureStore：一个布尔值，表示WOPI服务器支持使用存储在文件中的凭据对安全数据存储进行调用。
    private Boolean SupportsSecureStore;
    //SupportsUpdate：一个布尔值，表示WOPI服务器支持该文件的PutFile（见3.3.5.3.2）和PutRelativeFile （参见3.3.5.1.9）。
    private Boolean SupportsUpdate;
    //SupportsUserInfo：一个布尔值，表示WOPI服务器支持PutUserInfo（参见3.3.5.1.10）。<8>
    private Boolean SupportsUserInfo;
    //TenantId：一个字符串，用于由WOPI服务器唯一标识租户。
    private String TenantId;
    //TermsOfUseUrl：说明WOPI服务器使用条款的网页的URI。
    private String TermsOfUseUrl;
    //TimeZone：一个串，用于时区信息传递给客户端WOPI在由WOPI服务器选择的格式。
    private String TimeZone;
    //UniqueContentId：一个字符串，它唯一代表该文件的内容。<9>当文件内容更改时，此值必须更改。对于具有等效内容的所有文件，此值也必须相同。
    private String UniqueContentId;
    //UserCanAttend：一个布尔值，表示用户有权查看此文件的广播。广播是涉及一个或多个演示者控制一组参加者的文件的视图的文件活动。例如，演示者可以向许多与会者广播幻灯片。
    private Boolean UserCanAttend;
    //UserCanNotWriteRelative：一个布尔值，指示用户没有足够的权限在WOPI服务器上创建新文件。
    private Boolean UserCanNotWriteRelative;
    //UserCanPresent：一个布尔值，指示用户有权将广播此文件发送给有权广播或查看此文件的广播的一组用户。广播是涉及一个或多个演示者控制一组参加者的文件的视图的文件活动。例如，演示者可以向许多与会者广播幻灯片。
    private Boolean UserCanPresent;
    //UserCanRename：一个布尔值，表示用户有权重命名文件。
    private Boolean UserCanRename;
    //UserCanWrite：一个布尔值，表示用户具有更改文件的权限。
    private Boolean UserCanWrite;
    //UserFriendlyName：作为用户名称的字符串。如果为空，可以将WOPI客户端配置为 在某些情况下使用占位符字符串，或者根本不显示任何名称。
    private String UserFriendlyName;
    // UserId：一个字符串所使用由WOPI服务器唯一地识别用户。
    private String UserId;
    //UserInfo：一个字符串，该WOPI客户端应使用来验证用户的许可状态。如果无法识别内容，WOPI客户端可能会忽略该字符串。
    private String UserInfo;
    // Version：一个字符串，表示基于该WOPI服务器的文件版本控制模式文件的最新版本。当文件内容更改时，此值必须更改，并且版本值必须永远不会为给定文件重复。
    private String Version;
    //WebEditingDisabled：一个布尔值，表示WOPI客户端不得允许用户使用WOPI客户端的编辑功能对文件进行操作。这并不意味着用户没有权限编辑该文件。
    private Boolean WebEditingDisabled;
    //WorkflowPostMessage：一个布尔值，表示WOPI客户端应在用户尝试触发该文件上的工作流的情况下通知WOPI服务器。
    private Boolean WorkflowPostMessage;
    //WorkflowType：一个字符串数组代表可用于该文件的工作流类型。
    private String[] WorkflowType;
    // WorkflowUrl：一个字符串，表示基于该WOPI服务器的文件版本控制模式文件的最新版本。当文件内容更改时，此值必须更改，并且版本值必须永远不会为给定文件重复。
    private String WorkflowUrl;

    public Boolean getAllowAdditionalMicrosoftServices() {
        return AllowAdditionalMicrosoftServices;
    }

    public void setAllowAdditionalMicrosoftServices(Boolean allowAdditionalMicrosoftServices) {
        AllowAdditionalMicrosoftServices = allowAdditionalMicrosoftServices;
    }

    public Boolean getAllowExternalMarketplace() {
        return AllowExternalMarketplace;
    }

    public void setAllowExternalMarketplace(Boolean allowExternalMarketplace) {
        AllowExternalMarketplace = allowExternalMarketplace;
    }

    public String getBaseFileName() {
        return BaseFileName;
    }

    public void setBaseFileName(String baseFileName) {
        BaseFileName = baseFileName;
    }

    public String getBreadcrumbBrandName() {
        return BreadcrumbBrandName;
    }

    public void setBreadcrumbBrandName(String breadcrumbBrandName) {
        BreadcrumbBrandName = breadcrumbBrandName;
    }

    public String getBreadcrumbBrandUrl() {
        return BreadcrumbBrandUrl;
    }

    public void setBreadcrumbBrandUrl(String breadcrumbBrandUrl) {
        BreadcrumbBrandUrl = breadcrumbBrandUrl;
    }

    public String getBreadcrumbDocName() {
        return BreadcrumbDocName;
    }

    public void setBreadcrumbDocName(String breadcrumbDocName) {
        BreadcrumbDocName = breadcrumbDocName;
    }

    public String getBreadcrumbDocUrl() {
        return BreadcrumbDocUrl;
    }

    public void setBreadcrumbDocUrl(String breadcrumbDocUrl) {
        BreadcrumbDocUrl = breadcrumbDocUrl;
    }

    public String getBreadcrumbFolderName() {
        return BreadcrumbFolderName;
    }

    public void setBreadcrumbFolderName(String breadcrumbFolderName) {
        BreadcrumbFolderName = breadcrumbFolderName;
    }

    public String getBreadcrumbFolderUrl() {
        return BreadcrumbFolderUrl;
    }

    public void setBreadcrumbFolderUrl(String breadcrumbFolderUrl) {
        BreadcrumbFolderUrl = breadcrumbFolderUrl;
    }

    public String getClientUrl() {
        return ClientUrl;
    }

    public void setClientUrl(String clientUrl) {
        ClientUrl = clientUrl;
    }

    public Boolean getCloseButtonClosesWindow() {
        return CloseButtonClosesWindow;
    }

    public void setCloseButtonClosesWindow(Boolean closeButtonClosesWindow) {
        CloseButtonClosesWindow = closeButtonClosesWindow;
    }

    public Boolean getClosePostMessage() {
        return ClosePostMessage;
    }

    public void setClosePostMessage(Boolean closePostMessage) {
        ClosePostMessage = closePostMessage;
    }

    public Boolean getCloseURL() {
        return CloseURL;
    }

    public void setCloseURL(Boolean closeURL) {
        CloseURL = closeURL;
    }

    public Boolean getDisableBrowserCachingOfUserContent() {
        return DisableBrowserCachingOfUserContent;
    }

    public void setDisableBrowserCachingOfUserContent(Boolean disableBrowserCachingOfUserContent) {
        DisableBrowserCachingOfUserContent = disableBrowserCachingOfUserContent;
    }

    public Boolean getDisablePrint() {
        return DisablePrint;
    }

    public void setDisablePrint(Boolean disablePrint) {
        DisablePrint = disablePrint;
    }

    public Boolean getDisableTranslation() {
        return DisableTranslation;
    }

    public void setDisableTranslation(Boolean disableTranslation) {
        DisableTranslation = disableTranslation;
    }

    public String getDownloadUrl() {
        return DownloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        DownloadUrl = downloadUrl;
    }

    public String getEditAndReplyUrl() {
        return EditAndReplyUrl;
    }

    public void setEditAndReplyUrl(String editAndReplyUrl) {
        EditAndReplyUrl = editAndReplyUrl;
    }

    public Boolean getEditModePostMessage() {
        return EditModePostMessage;
    }

    public void setEditModePostMessage(Boolean editModePostMessage) {
        EditModePostMessage = editModePostMessage;
    }

    public Boolean getEditNotificationPostMessage() {
        return EditNotificationPostMessage;
    }

    public void setEditNotificationPostMessage(Boolean editNotificationPostMessage) {
        EditNotificationPostMessage = editNotificationPostMessage;
    }

    public String getFileExtension() {
        return FileExtension;
    }

    public void setFileExtension(String fileExtension) {
        FileExtension = fileExtension;
    }

    public Integer getFileNameMaxLength() {
        return FileNameMaxLength;
    }

    public void setFileNameMaxLength(Integer fileNameMaxLength) {
        FileNameMaxLength = fileNameMaxLength;
    }

    public String getFileSharingUrl() {
        return FileSharingUrl;
    }

    public void setFileSharingUrl(String fileSharingUrl) {
        FileSharingUrl = fileSharingUrl;
    }

    public Boolean getFileSharingPostMessage() {
        return FileSharingPostMessage;
    }

    public void setFileSharingPostMessage(Boolean fileSharingPostMessage) {
        FileSharingPostMessage = fileSharingPostMessage;
    }

    public String getFileUrl() {
        return FileUrl;
    }

    public void setFileUrl(String fileUrl) {
        FileUrl = fileUrl;
    }

    public String getHostAuthenticationId() {
        return HostAuthenticationId;
    }

    public void setHostAuthenticationId(String hostAuthenticationId) {
        HostAuthenticationId = hostAuthenticationId;
    }

    public String getHostEditUrl() {
        return HostEditUrl;
    }

    public void setHostEditUrl(String hostEditUrl) {
        HostEditUrl = hostEditUrl;
    }

    public String getHostEmbeddedEditUrl() {
        return HostEmbeddedEditUrl;
    }

    public void setHostEmbeddedEditUrl(String hostEmbeddedEditUrl) {
        HostEmbeddedEditUrl = hostEmbeddedEditUrl;
    }

    public String getHostEmbeddedViewUrl() {
        return HostEmbeddedViewUrl;
    }

    public void setHostEmbeddedViewUrl(String hostEmbeddedViewUrl) {
        HostEmbeddedViewUrl = hostEmbeddedViewUrl;
    }

    public String getHostName() {
        return HostName;
    }

    public void setHostName(String hostName) {
        HostName = hostName;
    }

    public String getHostNotes() {
        return HostNotes;
    }

    public void setHostNotes(String hostNotes) {
        HostNotes = hostNotes;
    }

    public String getHostRestUrl() {
        return HostRestUrl;
    }

    public void setHostRestUrl(String hostRestUrl) {
        HostRestUrl = hostRestUrl;
    }

    public String getHostViewUrl() {
        return HostViewUrl;
    }

    public void setHostViewUrl(String hostViewUrl) {
        HostViewUrl = hostViewUrl;
    }

    public String getIrmPolicyDescription() {
        return IrmPolicyDescription;
    }

    public void setIrmPolicyDescription(String irmPolicyDescription) {
        IrmPolicyDescription = irmPolicyDescription;
    }

    public String getIrmPolicyTitle() {
        return IrmPolicyTitle;
    }

    public void setIrmPolicyTitle(String irmPolicyTitle) {
        IrmPolicyTitle = irmPolicyTitle;
    }

    public Boolean getLicenseCheckInEditIsEnabled() {
        return LicenseCheckInEditIsEnabled;
    }

    public void setLicenseCheckInEditIsEnabled(Boolean licenseCheckInEditIsEnabled) {
        LicenseCheckInEditIsEnabled = licenseCheckInEditIsEnabled;
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String ownerId) {
        OwnerId = ownerId;
    }

    public String getPostMessageOrigin() {
        return PostMessageOrigin;
    }

    public void setPostMessageOrigin(String postMessageOrigin) {
        PostMessageOrigin = postMessageOrigin;
    }

    public String getPresenceProvider() {
        return PresenceProvider;
    }

    public void setPresenceProvider(String presenceProvider) {
        PresenceProvider = presenceProvider;
    }

    public String getPresenceUserId() {
        return PresenceUserId;
    }

    public void setPresenceUserId(String presenceUserId) {
        PresenceUserId = presenceUserId;
    }

    public String getPrivacyUrl() {
        return PrivacyUrl;
    }

    public void setPrivacyUrl(String privacyUrl) {
        PrivacyUrl = privacyUrl;
    }

    public Boolean getProtectInClient() {
        return ProtectInClient;
    }

    public void setProtectInClient(Boolean protectInClient) {
        ProtectInClient = protectInClient;
    }

    public Boolean getReadOnly() {
        return ReadOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        ReadOnly = readOnly;
    }

    public Boolean getRestrictedWebViewOnly() {
        return RestrictedWebViewOnly;
    }

    public void setRestrictedWebViewOnly(Boolean restrictedWebViewOnly) {
        RestrictedWebViewOnly = restrictedWebViewOnly;
    }

    public String getSHA256() {
        return SHA256;
    }

    public void setSHA256(String SHA256) {
        this.SHA256 = SHA256;
    }

    public String getSignInUrl() {
        return SignInUrl;
    }

    public void setSignInUrl(String signInUrl) {
        SignInUrl = signInUrl;
    }

    public String getSignoutUrl() {
        return SignoutUrl;
    }

    public void setSignoutUrl(String signoutUrl) {
        SignoutUrl = signoutUrl;
    }

    public Integer getSize() {
        return Size;
    }

    public void setSize(Integer size) {
        Size = size;
    }

    public String[] getSupportedShareUrlTypes() {
        return SupportedShareUrlTypes;
    }

    public void setSupportedShareUrlTypes(String[] supportedShareUrlTypes) {
        SupportedShareUrlTypes = supportedShareUrlTypes;
    }

    public Boolean getSupportsCoauth() {
        return SupportsCoauth;
    }

    public void setSupportsCoauth(Boolean supportsCoauth) {
        SupportsCoauth = supportsCoauth;
    }

    public Boolean getSupportsCobalt() {
        return SupportsCobalt;
    }

    public void setSupportsCobalt(Boolean supportsCobalt) {
        SupportsCobalt = supportsCobalt;
    }

    public Boolean getSupportsExtendedLockLength() {
        return SupportsExtendedLockLength;
    }

    public void setSupportsExtendedLockLength(Boolean supportsExtendedLockLength) {
        SupportsExtendedLockLength = supportsExtendedLockLength;
    }

    public Boolean getSupportsFileCreation() {
        return SupportsFileCreation;
    }

    public void setSupportsFileCreation(Boolean supportsFileCreation) {
        SupportsFileCreation = supportsFileCreation;
    }

    public Boolean getSupportsFolders() {
        return SupportsFolders;
    }

    public void setSupportsFolders(Boolean supportsFolders) {
        SupportsFolders = supportsFolders;
    }

    public Boolean getSupportsGetLock() {
        return SupportsGetLock;
    }

    public void setSupportsGetLock(Boolean supportsGetLock) {
        SupportsGetLock = supportsGetLock;
    }

    public Boolean getSupportsLocks() {
        return SupportsLocks;
    }

    public void setSupportsLocks(Boolean supportsLocks) {
        SupportsLocks = supportsLocks;
    }

    public Boolean getSupportsRename() {
        return SupportsRename;
    }

    public void setSupportsRename(Boolean supportsRename) {
        SupportsRename = supportsRename;
    }

    public Boolean getSupportsScenarioLinks() {
        return SupportsScenarioLinks;
    }

    public void setSupportsScenarioLinks(Boolean supportsScenarioLinks) {
        SupportsScenarioLinks = supportsScenarioLinks;
    }

    public Boolean getSupportsSecureStore() {
        return SupportsSecureStore;
    }

    public void setSupportsSecureStore(Boolean supportsSecureStore) {
        SupportsSecureStore = supportsSecureStore;
    }

    public Boolean getSupportsUpdate() {
        return SupportsUpdate;
    }

    public void setSupportsUpdate(Boolean supportsUpdate) {
        SupportsUpdate = supportsUpdate;
    }

    public Boolean getSupportsUserInfo() {
        return SupportsUserInfo;
    }

    public void setSupportsUserInfo(Boolean supportsUserInfo) {
        SupportsUserInfo = supportsUserInfo;
    }

    public String getTenantId() {
        return TenantId;
    }

    public void setTenantId(String tenantId) {
        TenantId = tenantId;
    }

    public String getTermsOfUseUrl() {
        return TermsOfUseUrl;
    }

    public void setTermsOfUseUrl(String termsOfUseUrl) {
        TermsOfUseUrl = termsOfUseUrl;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(String timeZone) {
        TimeZone = timeZone;
    }

    public String getUniqueContentId() {
        return UniqueContentId;
    }

    public void setUniqueContentId(String uniqueContentId) {
        UniqueContentId = uniqueContentId;
    }

    public Boolean getUserCanAttend() {
        return UserCanAttend;
    }

    public void setUserCanAttend(Boolean userCanAttend) {
        UserCanAttend = userCanAttend;
    }

    public Boolean getUserCanNotWriteRelative() {
        return UserCanNotWriteRelative;
    }

    public void setUserCanNotWriteRelative(Boolean userCanNotWriteRelative) {
        UserCanNotWriteRelative = userCanNotWriteRelative;
    }

    public Boolean getUserCanPresent() {
        return UserCanPresent;
    }

    public void setUserCanPresent(Boolean userCanPresent) {
        UserCanPresent = userCanPresent;
    }

    public Boolean getUserCanRename() {
        return UserCanRename;
    }

    public void setUserCanRename(Boolean userCanRename) {
        UserCanRename = userCanRename;
    }

    public Boolean getUserCanWrite() {
        return UserCanWrite;
    }

    public void setUserCanWrite(Boolean userCanWrite) {
        UserCanWrite = userCanWrite;
    }

    public String getUserFriendlyName() {
        return UserFriendlyName;
    }

    public void setUserFriendlyName(String userFriendlyName) {
        UserFriendlyName = userFriendlyName;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserInfo() {
        return UserInfo;
    }

    public void setUserInfo(String userInfo) {
        UserInfo = userInfo;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public Boolean getWebEditingDisabled() {
        return WebEditingDisabled;
    }

    public void setWebEditingDisabled(Boolean webEditingDisabled) {
        WebEditingDisabled = webEditingDisabled;
    }

    public Boolean getWorkflowPostMessage() {
        return WorkflowPostMessage;
    }

    public void setWorkflowPostMessage(Boolean workflowPostMessage) {
        WorkflowPostMessage = workflowPostMessage;
    }

    public String[] getWorkflowType() {
        return WorkflowType;
    }

    public void setWorkflowType(String[] workflowType) {
        WorkflowType = workflowType;
    }

    public String getWorkflowUrl() {
        return WorkflowUrl;
    }

    public void setWorkflowUrl(String workflowUrl) {
        WorkflowUrl = workflowUrl;
    }

    @Override
    public String toString() {
        return "OfficeFileInfoDto{" +
                "AllowAdditionalMicrosoftServices=" + AllowAdditionalMicrosoftServices +
                ", AllowExternalMarketplace=" + AllowExternalMarketplace +
                ", BaseFileName='" + BaseFileName + '\'' +
                ", BreadcrumbBrandName='" + BreadcrumbBrandName + '\'' +
                ", BreadcrumbBrandUrl='" + BreadcrumbBrandUrl + '\'' +
                ", BreadcrumbDocName='" + BreadcrumbDocName + '\'' +
                ", BreadcrumbDocUrl='" + BreadcrumbDocUrl + '\'' +
                ", BreadcrumbFolderName='" + BreadcrumbFolderName + '\'' +
                ", BreadcrumbFolderUrl='" + BreadcrumbFolderUrl + '\'' +
                ", ClientUrl='" + ClientUrl + '\'' +
                ", CloseButtonClosesWindow=" + CloseButtonClosesWindow +
                ", ClosePostMessage=" + ClosePostMessage +
                ", CloseURL=" + CloseURL +
                ", DisableBrowserCachingOfUserContent=" + DisableBrowserCachingOfUserContent +
                ", DisablePrint=" + DisablePrint +
                ", DisableTranslation=" + DisableTranslation +
                ", DownloadUrl='" + DownloadUrl + '\'' +
                ", EditAndReplyUrl='" + EditAndReplyUrl + '\'' +
                ", EditModePostMessage=" + EditModePostMessage +
                ", EditNotificationPostMessage=" + EditNotificationPostMessage +
                ", FileExtension='" + FileExtension + '\'' +
                ", FileNameMaxLength=" + FileNameMaxLength +
                ", FileSharingUrl='" + FileSharingUrl + '\'' +
                ", FileSharingPostMessage=" + FileSharingPostMessage +
                ", FileUrl='" + FileUrl + '\'' +
                ", HostAuthenticationId='" + HostAuthenticationId + '\'' +
                ", HostEditUrl='" + HostEditUrl + '\'' +
                ", HostEmbeddedEditUrl='" + HostEmbeddedEditUrl + '\'' +
                ", HostEmbeddedViewUrl='" + HostEmbeddedViewUrl + '\'' +
                ", HostName='" + HostName + '\'' +
                ", HostNotes='" + HostNotes + '\'' +
                ", HostRestUrl='" + HostRestUrl + '\'' +
                ", HostViewUrl='" + HostViewUrl + '\'' +
                ", IrmPolicyDescription='" + IrmPolicyDescription + '\'' +
                ", IrmPolicyTitle='" + IrmPolicyTitle + '\'' +
                ", LicenseCheckInEditIsEnabled=" + LicenseCheckInEditIsEnabled +
                ", OwnerId='" + OwnerId + '\'' +
                ", PostMessageOrigin='" + PostMessageOrigin + '\'' +
                ", PresenceProvider='" + PresenceProvider + '\'' +
                ", PresenceUserId='" + PresenceUserId + '\'' +
                ", PrivacyUrl='" + PrivacyUrl + '\'' +
                ", ProtectInClient=" + ProtectInClient +
                ", ReadOnly=" + ReadOnly +
                ", RestrictedWebViewOnly=" + RestrictedWebViewOnly +
                ", SHA256='" + SHA256 + '\'' +
                ", SignInUrl='" + SignInUrl + '\'' +
                ", SignoutUrl='" + SignoutUrl + '\'' +
                ", Size=" + Size +
                ", SupportedShareUrlTypes=" + Arrays.toString(SupportedShareUrlTypes) +
                ", SupportsCoauth=" + SupportsCoauth +
                ", SupportsCobalt=" + SupportsCobalt +
                ", SupportsExtendedLockLength=" + SupportsExtendedLockLength +
                ", SupportsFileCreation=" + SupportsFileCreation +
                ", SupportsFolders=" + SupportsFolders +
                ", SupportsGetLock=" + SupportsGetLock +
                ", SupportsLocks=" + SupportsLocks +
                ", SupportsRename=" + SupportsRename +
                ", SupportsScenarioLinks=" + SupportsScenarioLinks +
                ", SupportsSecureStore=" + SupportsSecureStore +
                ", SupportsUpdate=" + SupportsUpdate +
                ", SupportsUserInfo=" + SupportsUserInfo +
                ", TenantId='" + TenantId + '\'' +
                ", TermsOfUseUrl='" + TermsOfUseUrl + '\'' +
                ", TimeZone='" + TimeZone + '\'' +
                ", UniqueContentId='" + UniqueContentId + '\'' +
                ", UserCanAttend=" + UserCanAttend +
                ", UserCanNotWriteRelative=" + UserCanNotWriteRelative +
                ", UserCanPresent=" + UserCanPresent +
                ", UserCanRename=" + UserCanRename +
                ", UserCanWrite=" + UserCanWrite +
                ", UserFriendlyName='" + UserFriendlyName + '\'' +
                ", UserId='" + UserId + '\'' +
                ", UserInfo='" + UserInfo + '\'' +
                ", Version='" + Version + '\'' +
                ", WebEditingDisabled=" + WebEditingDisabled +
                ", WorkflowPostMessage=" + WorkflowPostMessage +
                ", WorkflowType=" + Arrays.toString(WorkflowType) +
                ", WorkflowUrl='" + WorkflowUrl + '\'' +
                '}';
    }

    public String toStringTrim() {
        return "{" +
                (BaseFileName == null ? "" : ("\"BaseFileName\":\"" + BaseFileName + '\"')) +
                (AllowAdditionalMicrosoftServices == null ? "" : (", \"AllowAdditionalMicrosoftServices\":\"" + AllowAdditionalMicrosoftServices + '\"')) +
                (AllowExternalMarketplace == null ? "" : (", \"AllowExternalMarketplace\":\"" + AllowExternalMarketplace + '\"')) +
                (BreadcrumbBrandName == null ? "" : (", \"BreadcrumbBrandName\":\"" + BreadcrumbBrandName + '\"')) +
                (BreadcrumbBrandUrl == null ? "" : (", \"BreadcrumbBrandUrl\":\"" + BreadcrumbBrandUrl + '\"')) +
                (BreadcrumbDocName == null ? "" : (", \"BreadcrumbDocName\":\"" + BreadcrumbDocName + '\"')) +
                (BreadcrumbDocUrl == null ? "" : (", \"BreadcrumbDocUrl\":\"" + BreadcrumbDocUrl + '\"')) +
                (BreadcrumbFolderName == null ? "" : (", \"BreadcrumbFolderName\":\"" + BreadcrumbFolderName + '\"')) +
                (BreadcrumbFolderUrl == null ? "" : (", \"BreadcrumbFolderUrl\":\"" + BreadcrumbFolderUrl + '\"')) +
                (ClientUrl == null ? "" : (", \"ClientUrl\":\"" + ClientUrl + '\"')) +
                (CloseButtonClosesWindow == null ? "" : (", \"CloseButtonClosesWindow\":\"" + CloseButtonClosesWindow + '\"')) +
                (ClosePostMessage == null ? "" : (", \"ClosePostMessage\":\"" + ClosePostMessage + '\"')) +
                (CloseURL == null ? "" : (", \"CloseURL\":\"" + CloseURL + '\"')) +
                (DisableBrowserCachingOfUserContent == null ? "" : (", \"DisableBrowserCachingOfUserContent\":\"" + DisableBrowserCachingOfUserContent + '\"')) +
                (DisablePrint == null ? "" : (", \"DisablePrint\":\"" + DisablePrint + '\"')) +
                (DisableTranslation == null ? "" : (", \"DisableTranslation\":\"" + DisableTranslation + '\"')) +
                (DownloadUrl == null ? "" : (", \"DownloadUrl\":\"" + DownloadUrl + '\"')) +
                (EditAndReplyUrl == null ? "" : (", \"EditAndReplyUrl\":\"" + EditAndReplyUrl + '\"')) +
                (EditModePostMessage == null ? "" : (", \"EditModePostMessage\":\"" + EditModePostMessage + '\"')) +
                (EditNotificationPostMessage == null ? "" : (", \"EditNotificationPostMessage\":\"" + EditNotificationPostMessage + '\"')) +
                (FileExtension == null ? "" : (", \"FileExtension\":\"" + FileExtension + '\"')) +
                (FileNameMaxLength == null ? "" : (", \"FileNameMaxLength\":\"" + FileNameMaxLength + '\"')) +
                (FileSharingUrl == null ? "" : (", \"FileSharingUrl\":\"" + FileSharingUrl + '\"')) +
                (FileSharingPostMessage == null ? "" : (", \"FileSharingPostMessage\":\"" + FileSharingPostMessage + '\"')) +
                (FileUrl == null ? "" : (", \"FileUrl\":\"" + FileUrl + '\"')) +
                (HostAuthenticationId == null ? "" : (", \"HostAuthenticationId\":\"" + HostAuthenticationId + '\"')) +
                (HostEditUrl == null ? "" : (", \"HostEditUrl\":\"" + HostEditUrl + '\"')) +
                (HostEmbeddedEditUrl == null ? "" : (", \"HostEmbeddedEditUrl\":\"" + HostEmbeddedEditUrl + '\"')) +
                (HostEmbeddedViewUrl == null ? "" : (", \"HostEmbeddedViewUrl\":\"" + HostEmbeddedViewUrl + '\"')) +
                (HostName == null ? "" : (", \"HostName\":\"" + HostName + '\"')) +
                (HostNotes == null ? "" : (", \"HostNotes\":\"" + HostNotes + '\"')) +
                (HostRestUrl == null ? "" : (", \"HostRestUrl\":\"" + HostRestUrl + '\"')) +
                (HostViewUrl == null ? "" : (", \"HostViewUrl\":\"" + HostViewUrl + '\"')) +
                (IrmPolicyDescription == null ? "" : (", \"IrmPolicyDescription\":\"" + IrmPolicyDescription + '\"')) +
                (IrmPolicyTitle == null ? "" : (", \"IrmPolicyTitle\":\"" + IrmPolicyTitle + '\"')) +
                (LicenseCheckInEditIsEnabled == null ? "" : (", \"LicenseCheckInEditIsEnabled\":\"" + LicenseCheckInEditIsEnabled + '\"')) +
                (OwnerId == null ? "" : (", \"OwnerId\":\"" + OwnerId + '\"')) +
                (PostMessageOrigin == null ? "" : (", \"PostMessageOrigin\":\"" + PostMessageOrigin + '\"')) +
                (PresenceProvider == null ? "" : (", \"PresenceProvider\":\"" + PresenceProvider + '\"')) +
                (PresenceUserId == null ? "" : (", \"PresenceUserId\":\"" + PresenceUserId + '\"')) +
                (PrivacyUrl == null ? "" : (", \"PrivacyUrl\":\"" + PrivacyUrl + '\"')) +
                (ProtectInClient == null ? "" : (", \"ProtectInClient\":\"" + ProtectInClient + '\"')) +
                (ReadOnly == null ? "" : (", \"ReadOnly\":\"" + ReadOnly)) +
                (RestrictedWebViewOnly == null ? "" : (", \"RestrictedWebViewOnly\":\"" + RestrictedWebViewOnly + '\"')) +
                (SHA256 == null ? "" : (", \"SHA256\":\"" + SHA256 + '\"')) +
                (SignInUrl == null ? "" : (", \"SignInUrl\":\"" + SignInUrl + '\"')) +
                (SignoutUrl == null ? "" : (", \"SignoutUrl\":\"" + SignoutUrl + '\"')) +
                (Size == null ? "" : (", \"Size\":\"" + Size + '\"')) +
                (SupportedShareUrlTypes == null ? "" : (", \"SupportedShareUrlTypes\":\"" + Arrays.toString(SupportedShareUrlTypes) + '\"')) +
                (SupportsCoauth == null ? "" : (", \"SupportsCoauth\":\"" + SupportsCoauth + '\"')) +
                (SupportsCobalt == null ? "" : (", \"SupportsCobalt\":\"" + SupportsCobalt + '\"')) +
                (SupportsExtendedLockLength == null ? "" : (", \"SupportsExtendedLockLength\":\"" + SupportsExtendedLockLength + '\"')) +
                (SupportsFileCreation == null ? "" : (", \"SupportsFileCreation\":\"" + SupportsFileCreation + '\"')) +
                (SupportsFolders == null ? "" : (", \"SupportsFolders\":\"" + SupportsFolders + '\"')) +
                (SupportsGetLock == null ? "" : (", \"SupportsGetLock\":\"" + SupportsGetLock + '\"')) +
                (SupportsLocks == null ? "" : (", \"SupportsLocks\":\"" + SupportsLocks + '\"')) +
                (SupportsRename == null ? "" : (", \"SupportsRename\":\"" + SupportsRename + '\"')) +
                (SupportsScenarioLinks == null ? "" : (", \"SupportsScenarioLinks\":\"" + SupportsScenarioLinks + '\"')) +
                (SupportsSecureStore == null ? "" : (", \"SupportsSecureStore\":\"" + SupportsSecureStore + '\"')) +
                (SupportsUpdate == null ? "" : (", \"SupportsUpdate\":\"" + SupportsUpdate + '\"')) +
                (SupportsUserInfo == null ? "" : (", \"SupportsUserInfo\":\"" + SupportsUserInfo + '\"')) +
                (TenantId == null ? "" : (", \"TenantId\":\"" + TenantId + '\"')) +
                (TermsOfUseUrl == null ? "" : (", \"TermsOfUseUrl\":\"" + TermsOfUseUrl + '\"')) +
                (TimeZone == null ? "" : (", \"TimeZone\":\"" + TimeZone + '\"')) +
                (UniqueContentId == null ? "" : (", \"UniqueContentId\":\"" + UniqueContentId + '\"')) +
                (UserCanAttend == null ? "" : (", \"UserCanAttend\":\"" + UserCanAttend + '\"')) +
                (UserCanNotWriteRelative == null ? "" : (", \"UserCanNotWriteRelative\":\"" + UserCanNotWriteRelative + '\"')) +
                (UserCanPresent == null ? "" : (", \"UserCanPresent\":\"" + UserCanPresent + '\"')) +
                (UserCanRename == null ? "" : (", \"UserCanRename\":\"" + UserCanRename + '\"')) +
                (UserCanWrite == null ? "" : (", \"UserCanWrite\":\"" + UserCanWrite + '\"')) +
                (UserFriendlyName == null ? "" : (", \"UserFriendlyName\":\"" + UserFriendlyName + '\"')) +
                (UserId == null ? "" : (", \"UserId\":\"" + UserId + '\"')) +
                (UserInfo == null ? "" : (", \"UserInfo\":\"" + UserInfo + '\"')) +
                (Version == null ? "" : (", \"Version\":\"" + Version + '\"')) +
                (WebEditingDisabled == null ? "" : (", \"WebEditingDisabled\":\"" + WebEditingDisabled + '\"')) +
                (WorkflowPostMessage == null ? "" : (", \"WorkflowPostMessage\":\"" + WorkflowPostMessage + '\"')) +
                (WorkflowType == null ? "" : (", \"WorkflowType\":\"" + Arrays.toString(WorkflowType) + '\"')) +
                (WorkflowUrl == null ? "" : (", \"WorkflowUrl\":\"" + WorkflowUrl + '\"')) +
                '}';
    }
}
