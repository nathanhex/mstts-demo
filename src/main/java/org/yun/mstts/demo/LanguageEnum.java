package org.yun.mstts.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 语种
 */
@AllArgsConstructor
@Getter
public enum LanguageEnum {

    afZA("af-ZA","Afrikaans (South Africa)"),
    sqAL("sq-AL","Albanian (Albania)"),
    amET("am-ET","Amharic (Ethiopia)"),
    arDZ("ar-DZ","Arabic (Algeria)"),
    arBH("ar-BH","Arabic (Bahrain)"),
    arEG("ar-EG","Arabic (Egypt)"),
    arIQ("ar-IQ","Arabic (Iraq)"),
    arJO("ar-JO","Arabic (Jordan)"),
    arKW("ar-KW","Arabic (Kuwait)"),
    arLB("ar-LB","Arabic (Lebanon)"),
    arLY("ar-LY","Arabic (Libya)"),
    arMA("ar-MA","Arabic (Morocco)"),
    arOM("ar-OM","Arabic (Oman)"),
    arQA("ar-QA","Arabic (Qatar)"),
    arSA("ar-SA","Arabic (Saudi Arabia)"),
    arSY("ar-SY","Arabic (Syria)"),
    arTN("ar-TN","Arabic (Tunisia)"),
    arAE("ar-AE","Arabic (United Arab Emirates)"),
    arYE("ar-YE","Arabic (Yemen)"),
    hyAM("hy-AM","Armenian (Armenia)"),
    azAZ("az-AZ","Azerbaijani (Latin, Azerbaijan)"),
    bnBD("bn-BD","Bangla (Bangladesh)"),
    euES("eu-ES","Basque"),
    bnIN("bn-IN","Bengali (India)"),
    bsBA("bs-BA","Bosnian (Bosnia and Herzegovina)"),
    bgBG("bg-BG","Bulgarian (Bulgaria)"),
    myMM("my-MM","Burmese (Myanmar)"),
    caES("ca-ES","Catalan (Spain)"),
    yueCN("yue-CN","Chinese (Cantonese, Simplified)"),
    zhHK("zh-HK","Chinese (Cantonese, Traditional)"),
    zhCN_shandong("zh-CN","shandong\">Chinese (Jilu Mandarin, Simplified)"),
    zhCN_Simplified("zh-CN","Chinese (Mandarin, Simplified)"),
    zhCN_liaoning("zh-CN","liaoning\">Chinese (Northeastern Mandarin, Simplified)"),
    zhCN_sichuan("zh-CN","sichuan\">Chinese (Southwestern Mandarin, Simplified)"),
    zhTW("zh-TW","Chinese (Taiwanese Mandarin, Traditional)"),
    wuuCN("wuu-CN","Chinese (Wu, Simplified)"),
    zhCN_henan("zh-CN","henan\">Chinese (Zhongyuan Mandarin Henan, Simplified)"),
    zhCN_shaanxi("zh-CN","shaanxi\">Chinese (Zhongyuan Mandarin Shaanxi, Simplified)"),
    hrHR("hr-HR","Croatian (Croatia)"),
    csCZ("cs-CZ","Czech (Czechia)"),
    daDK("da-DK","Danish (Denmark)"),
    nlBE("nl-BE","Dutch (Belgium)"),
    nlNL("nl-NL","Dutch (Netherlands)"),
    enAU("en-AU","English (Australia)"),
    enCA("en-CA","English (Canada)"),
    enHK("en-HK","English (Hong Kong SAR)"),
    enIN("en-IN","English (India)"),
    enIE("en-IE","English (Ireland)"),
    enKE("en-KE","English (Kenya)"),
    enNZ("en-NZ","English (New Zealand)"),
    enNG("en-NG","English (Nigeria)"),
    enPH("en-PH","English (Philippines)"),
    enSG("en-SG","English (Singapore)"),
    enZA("en-ZA","English (South Africa)"),
    enTZ("en-TZ","English (Tanzania)"),
    enGB("en-GB","English (United Kingdom)"),
    enUS("en-US","English (United States)"),
    etEE("et-EE","Estonian (Estonia)"),
    filPH("fil-PH","Filipino (Philippines)"),
    fiFI("fi-FI","Finnish (Finland)"),
    frBE("fr-BE","French (Belgium)"),
    frCA("fr-CA","French (Canada)"),
    frFR("fr-FR","French (France)"),
    frCH("fr-CH","French (Switzerland)"),
    glES("gl-ES","Galician"),
    kaGE("ka-GE","Georgian (Georgia)"),
    deAT("de-AT","German (Austria)"),
    deDE("de-DE","German (Germany)"),
    deCH("de-CH","German (Switzerland)"),
    elGR("el-GR","Greek (Greece)"),
    guIN("gu-IN","Gujarati (India)"),
    heIL("he-IL","Hebrew (Israel)"),
    hiIN("hi-IN","Hindi (India)"),
    huHU("hu-HU","Hungarian (Hungary)"),
    isIS("is-IS","Icelandic (Iceland)"),
    idID("id-ID","Indonesian (Indonesia)"),
    gaIE("ga-IE","Irish (Ireland)"),
    itIT("it-IT","Italian (Italy)"),
    jaJP("ja-JP","Japanese (Japan)"),
    jvID("jv-ID","Javanese (Latin, Indonesia)"),
    knIN("kn-IN","Kannada (India)"),
    kkKZ("kk-KZ","Kazakh (Kazakhstan)"),
    kmKH("km-KH","Khmer (Cambodia)"),
    koKR("ko-KR","Korean (Korea)"),
    loLA("lo-LA","Lao (Laos)"),
    lvLV("lv-LV","Latvian (Latvia)"),
    ltLT("lt-LT","Lithuanian (Lithuania)"),
    mkMK("mk-MK","Macedonian (North Macedonia)"),
    msMY("ms-MY","Malay (Malaysia)"),
    mlIN("ml-IN","Malayalam (India)"),
    mtMT("mt-MT","Maltese (Malta)"),
    mrIN("mr-IN","Marathi (India)"),
    mnMN("mn-MN","Mongolian (Mongolia)"),
    neNP("ne-NP","Nepali (Nepal)"),
    nbNO("nb-NO","Norwegian Bokmål (Norway)"),
    psAF("ps-AF","Pashto (Afghanistan)"),
    faIR("fa-IR","Persian (Iran)"),
    plPL("pl-PL","Polish (Poland)"),
    ptBR("pt-BR","Portuguese (Brazil)"),
    ptPT("pt-PT","Portuguese (Portugal)"),
    roRO("ro-RO","Romanian (Romania)"),
    ruRU("ru-RU","Russian (Russia)"),
    srRS("sr-RS","Serbian (Cyrillic, Serbia)"),
    siLK("si-LK","Sinhala (Sri Lanka)"),
    skSK("sk-SK","Slovak (Slovakia)"),
    slSI("sl-SI","Slovenian (Slovenia)"),
    soSO("so-SO","Somali (Somalia)"),
    esAR("es-AR","Spanish (Argentina)"),
    esBO("es-BO","Spanish (Bolivia)"),
    esCL("es-CL","Spanish (Chile)"),
    esCO("es-CO","Spanish (Colombia)"),
    esCR("es-CR","Spanish (Costa Rica)"),
    esCU("es-CU","Spanish (Cuba)"),
    esDO("es-DO","Spanish (Dominican Republic)"),
    esEC("es-EC","Spanish (Ecuador)"),
    esSV("es-SV","Spanish (El Salvador)"),
    esGQ("es-GQ","Spanish (Equatorial Guinea)"),
    esGT("es-GT","Spanish (Guatemala)"),
    esHN("es-HN","Spanish (Honduras)"),
    esMX("es-MX","Spanish (Mexico)"),
    esNI("es-NI","Spanish (Nicaragua)"),
    esPA("es-PA","Spanish (Panama)"),
    esPY("es-PY","Spanish (Paraguay)"),
    esPE("es-PE","Spanish (Peru)"),
    esPR("es-PR","Spanish (Puerto Rico)"),
    esES("es-ES","Spanish (Spain)"),
    esUS("es-US","Spanish (United States)"),
    esUY("es-UY","Spanish (Uruguay)"),
    esVE("es-VE","Spanish (Venezuela)"),
    suID("su-ID","Sundanese (Indonesia)"),
    swKE("sw-KE","Swahili (Kenya)"),
    swTZ("sw-TZ","Swahili (Tanzania)"),
    svSE("sv-SE","Swedish (Sweden)"),
    taIN("ta-IN","Tamil (India)"),
    taMY("ta-MY","Tamil (Malaysia)"),
    taSG("ta-SG","Tamil (Singapore)"),
    taLK("ta-LK","Tamil (Sri Lanka)"),
    teIN("te-IN","Telugu (India)"),
    thTH("th-TH","Thai (Thailand)"),
    trTR("tr-TR","Turkish (Turkey)"),
    ukUA("uk-UA","Ukrainian (Ukraine)"),
    urIN("ur-IN","Urdu (India)"),
    urPK("ur-PK","Urdu (Pakistan)"),
    uzUZ("uz-UZ","Uzbek (Latin, Uzbekistan)"),
    viVN("vi-VN","Vietnamese (Vietnam)"),
    cyGB("cy-GB","Welsh (United Kingdom)"),
    zuZA("zu-ZA","Zulu (South Africa)")
    ;
    private String code;
    private String desc;
}
