package app;

import javax.inject.Inject;

public final class EntryPoint1 {
  private Integer keeper = 0;

  @Inject
  EntryPoint1(Dep2 dep2) {
    this.keeper += dep2.getKeeper();
  }

  public Integer getKeeper() {
    return keeper;
  }

  static final class Dep2 {
    private Integer keeper = 0;

    Dep2(Dep3 dep3, Dep4 dep4, Dep5 dep5, Dep6 dep6, Dep7 dep7) {
      this.keeper += dep3.getKeeper();
      this.keeper += dep4.getKeeper();
      this.keeper += dep5.getKeeper();
      this.keeper += dep6.getKeeper();
      this.keeper += dep7.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep3 {
    private Integer keeper = 0;

    @Inject
    Dep3(Dep8 dep8, Dep9 dep9) {
      this.keeper += dep8.getKeeper();
      this.keeper += dep9.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep4 {
    private Integer keeper = 0;

    Dep4(Dep10 dep10, Dep11 dep11, Dep12 dep12, Dep13 dep13, Dep14 dep14, Dep15 dep15) {
      this.keeper += dep10.getKeeper();
      this.keeper += dep11.getKeeper();
      this.keeper += dep12.getKeeper();
      this.keeper += dep13.getKeeper();
      this.keeper += dep14.getKeeper();
      this.keeper += dep15.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep5 {
    private Integer keeper = 0;

    Dep5(Dep16 dep16, Dep17 dep17, Dep18 dep18, Dep19 dep19, Dep20 dep20, Dep21 dep21) {
      this.keeper += dep16.getKeeper();
      this.keeper += dep17.getKeeper();
      this.keeper += dep18.getKeeper();
      this.keeper += dep19.getKeeper();
      this.keeper += dep20.getKeeper();
      this.keeper += dep21.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep6 {
    private Integer keeper = 0;

    Dep6(Dep22 dep22, Dep23 dep23, Dep24 dep24, Dep25 dep25, Dep26 dep26, Dep27 dep27) {
      this.keeper += dep22.getKeeper();
      this.keeper += dep23.getKeeper();
      this.keeper += dep24.getKeeper();
      this.keeper += dep25.getKeeper();
      this.keeper += dep26.getKeeper();
      this.keeper += dep27.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep7 {
    private Integer keeper = 0;

    @Inject
    Dep7(Dep28 dep28, Dep29 dep29, Dep30 dep30, Dep31 dep31, Dep32 dep32, Dep33 dep33) {
      this.keeper += dep28.getKeeper();
      this.keeper += dep29.getKeeper();
      this.keeper += dep30.getKeeper();
      this.keeper += dep31.getKeeper();
      this.keeper += dep32.getKeeper();
      this.keeper += dep33.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep8 {
    private Integer keeper = 0;

    @Inject
    Dep8(Dep34 dep34, Dep35 dep35, Dep36 dep36, Dep37 dep37) {
      this.keeper += dep34.getKeeper();
      this.keeper += dep35.getKeeper();
      this.keeper += dep36.getKeeper();
      this.keeper += dep37.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep9 {
    private Integer keeper = 0;

    Dep9(Dep38 dep38, Dep39 dep39, Dep40 dep40, Dep41 dep41) {
      this.keeper += dep38.getKeeper();
      this.keeper += dep39.getKeeper();
      this.keeper += dep40.getKeeper();
      this.keeper += dep41.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep10 {
    private Integer keeper = 0;

    Dep10(Dep42 dep42, Dep43 dep43, Dep44 dep44) {
      this.keeper += dep42.getKeeper();
      this.keeper += dep43.getKeeper();
      this.keeper += dep44.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep11 {
    private Integer keeper = 0;

    Dep11(Dep45 dep45, Dep46 dep46, Dep47 dep47, Dep48 dep48, Dep49 dep49, Dep50 dep50) {
      this.keeper += dep45.getKeeper();
      this.keeper += dep46.getKeeper();
      this.keeper += dep47.getKeeper();
      this.keeper += dep48.getKeeper();
      this.keeper += dep49.getKeeper();
      this.keeper += dep50.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep12 {
    private Integer keeper = 0;

    @Inject
    Dep12(Dep51 dep51, Dep52 dep52, Dep53 dep53, Dep54 dep54, Dep55 dep55, Dep56 dep56) {
      this.keeper += dep51.getKeeper();
      this.keeper += dep52.getKeeper();
      this.keeper += dep53.getKeeper();
      this.keeper += dep54.getKeeper();
      this.keeper += dep55.getKeeper();
      this.keeper += dep56.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep13 {
    private Integer keeper = 0;

    @Inject
    Dep13(Dep57 dep57, Dep58 dep58, Dep59 dep59, Dep60 dep60, Dep61 dep61, Dep62 dep62) {
      this.keeper += dep57.getKeeper();
      this.keeper += dep58.getKeeper();
      this.keeper += dep59.getKeeper();
      this.keeper += dep60.getKeeper();
      this.keeper += dep61.getKeeper();
      this.keeper += dep62.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep14 {
    private Integer keeper = 0;

    @Inject
    Dep14(Dep63 dep63, Dep64 dep64, Dep65 dep65, Dep66 dep66, Dep67 dep67) {
      this.keeper += dep63.getKeeper();
      this.keeper += dep64.getKeeper();
      this.keeper += dep65.getKeeper();
      this.keeper += dep66.getKeeper();
      this.keeper += dep67.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep15 {
    private Integer keeper = 0;

    @Inject
    Dep15(Dep68 dep68, Dep69 dep69, Dep70 dep70, Dep71 dep71, Dep72 dep72, Dep73 dep73) {
      this.keeper += dep68.getKeeper();
      this.keeper += dep69.getKeeper();
      this.keeper += dep70.getKeeper();
      this.keeper += dep71.getKeeper();
      this.keeper += dep72.getKeeper();
      this.keeper += dep73.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep16 {
    private Integer keeper = 0;

    Dep16(Dep74 dep74, Dep75 dep75, Dep76 dep76) {
      this.keeper += dep74.getKeeper();
      this.keeper += dep75.getKeeper();
      this.keeper += dep76.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep17 {
    private Integer keeper = 0;

    Dep17(Dep77 dep77, Dep78 dep78, Dep79 dep79, Dep80 dep80, Dep81 dep81) {
      this.keeper += dep77.getKeeper();
      this.keeper += dep78.getKeeper();
      this.keeper += dep79.getKeeper();
      this.keeper += dep80.getKeeper();
      this.keeper += dep81.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep18 {
    private Integer keeper = 0;

    @Inject
    Dep18(Dep82 dep82, Dep83 dep83, Dep84 dep84, Dep85 dep85) {
      this.keeper += dep82.getKeeper();
      this.keeper += dep83.getKeeper();
      this.keeper += dep84.getKeeper();
      this.keeper += dep85.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep19 {
    private Integer keeper = 0;

    Dep19(Dep86 dep86, Dep87 dep87, Dep88 dep88, Dep89 dep89, Dep90 dep90, Dep91 dep91) {
      this.keeper += dep86.getKeeper();
      this.keeper += dep87.getKeeper();
      this.keeper += dep88.getKeeper();
      this.keeper += dep89.getKeeper();
      this.keeper += dep90.getKeeper();
      this.keeper += dep91.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep20 {
    private Integer keeper = 0;

    @Inject
    Dep20(Dep92 dep92, Dep93 dep93, Dep94 dep94) {
      this.keeper += dep92.getKeeper();
      this.keeper += dep93.getKeeper();
      this.keeper += dep94.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep21 {
    private Integer keeper = 0;

    Dep21(Dep95 dep95, Dep96 dep96) {
      this.keeper += dep95.getKeeper();
      this.keeper += dep96.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep22 {
    private Integer keeper = 0;

    Dep22(Dep97 dep97) {
      this.keeper += dep97.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep23 {
    private Integer keeper = 0;

    @Inject
    Dep23(Dep98 dep98, Dep99 dep99, Dep100 dep100) {
      this.keeper += dep98.getKeeper();
      this.keeper += dep99.getKeeper();
      this.keeper += dep100.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep24 {
    private Integer keeper = 0;

    Dep24(
        Dep101 dep101, Dep102 dep102, Dep103 dep103, Dep104 dep104, Dep105 dep105, Dep106 dep106) {
      this.keeper += dep101.getKeeper();
      this.keeper += dep102.getKeeper();
      this.keeper += dep103.getKeeper();
      this.keeper += dep104.getKeeper();
      this.keeper += dep105.getKeeper();
      this.keeper += dep106.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep25 {
    private Integer keeper = 0;

    Dep25(Dep107 dep107, Dep108 dep108, Dep109 dep109) {
      this.keeper += dep107.getKeeper();
      this.keeper += dep108.getKeeper();
      this.keeper += dep109.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep26 {
    private Integer keeper = 0;

    Dep26(Dep110 dep110, Dep111 dep111, Dep112 dep112, Dep113 dep113, Dep114 dep114) {
      this.keeper += dep110.getKeeper();
      this.keeper += dep111.getKeeper();
      this.keeper += dep112.getKeeper();
      this.keeper += dep113.getKeeper();
      this.keeper += dep114.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep27 {
    private Integer keeper = 0;

    Dep27(Dep115 dep115, Dep116 dep116, Dep117 dep117, Dep118 dep118) {
      this.keeper += dep115.getKeeper();
      this.keeper += dep116.getKeeper();
      this.keeper += dep117.getKeeper();
      this.keeper += dep118.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep28 {
    private Integer keeper = 0;

    Dep28(Dep119 dep119, Dep120 dep120, Dep121 dep121, Dep122 dep122, Dep123 dep123) {
      this.keeper += dep119.getKeeper();
      this.keeper += dep120.getKeeper();
      this.keeper += dep121.getKeeper();
      this.keeper += dep122.getKeeper();
      this.keeper += dep123.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep29 {
    private Integer keeper = 0;

    Dep29(Dep124 dep124) {
      this.keeper += dep124.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep30 {
    private Integer keeper = 0;

    @Inject
    Dep30(
        Dep125 dep125, Dep126 dep126, Dep127 dep127, Dep128 dep128, Dep129 dep129, Dep130 dep130) {
      this.keeper += dep125.getKeeper();
      this.keeper += dep126.getKeeper();
      this.keeper += dep127.getKeeper();
      this.keeper += dep128.getKeeper();
      this.keeper += dep129.getKeeper();
      this.keeper += dep130.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep31 {
    private Integer keeper = 0;

    @Inject
    Dep31(
        Dep131 dep131, Dep132 dep132, Dep133 dep133, Dep134 dep134, Dep135 dep135, Dep136 dep136) {
      this.keeper += dep131.getKeeper();
      this.keeper += dep132.getKeeper();
      this.keeper += dep133.getKeeper();
      this.keeper += dep134.getKeeper();
      this.keeper += dep135.getKeeper();
      this.keeper += dep136.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep32 {
    private Integer keeper = 0;

    Dep32(
        Dep137 dep137, Dep138 dep138, Dep139 dep139, Dep140 dep140, Dep141 dep141, Dep142 dep142) {
      this.keeper += dep137.getKeeper();
      this.keeper += dep138.getKeeper();
      this.keeper += dep139.getKeeper();
      this.keeper += dep140.getKeeper();
      this.keeper += dep141.getKeeper();
      this.keeper += dep142.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep33 {
    private Integer keeper = 0;

    Dep33(
        Dep143 dep143, Dep144 dep144, Dep145 dep145, Dep146 dep146, Dep147 dep147, Dep148 dep148) {
      this.keeper += dep143.getKeeper();
      this.keeper += dep144.getKeeper();
      this.keeper += dep145.getKeeper();
      this.keeper += dep146.getKeeper();
      this.keeper += dep147.getKeeper();
      this.keeper += dep148.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep34 {
    private Integer keeper = 0;

    Dep34(
        Dep149 dep149, Dep150 dep150, Dep151 dep151, Dep152 dep152, Dep153 dep153, Dep154 dep154) {
      this.keeper += dep149.getKeeper();
      this.keeper += dep150.getKeeper();
      this.keeper += dep151.getKeeper();
      this.keeper += dep152.getKeeper();
      this.keeper += dep153.getKeeper();
      this.keeper += dep154.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep35 {
    private Integer keeper = 0;

    @Inject
    Dep35(Dep155 dep155, Dep156 dep156, Dep157 dep157) {
      this.keeper += dep155.getKeeper();
      this.keeper += dep156.getKeeper();
      this.keeper += dep157.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep36 {
    private Integer keeper = 0;

    @Inject
    Dep36(Dep158 dep158, Dep159 dep159, Dep160 dep160) {
      this.keeper += dep158.getKeeper();
      this.keeper += dep159.getKeeper();
      this.keeper += dep160.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep37 {
    private Integer keeper = 0;

    @Inject
    Dep37(Dep161 dep161, Dep162 dep162, Dep163 dep163, Dep164 dep164) {
      this.keeper += dep161.getKeeper();
      this.keeper += dep162.getKeeper();
      this.keeper += dep163.getKeeper();
      this.keeper += dep164.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep38 {
    private Integer keeper = 0;

    @Inject
    Dep38(
        Dep165 dep165, Dep166 dep166, Dep167 dep167, Dep168 dep168, Dep169 dep169, Dep170 dep170) {
      this.keeper += dep165.getKeeper();
      this.keeper += dep166.getKeeper();
      this.keeper += dep167.getKeeper();
      this.keeper += dep168.getKeeper();
      this.keeper += dep169.getKeeper();
      this.keeper += dep170.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep39 {
    private Integer keeper = 0;

    @Inject
    Dep39(Dep171 dep171, Dep172 dep172, Dep173 dep173, Dep174 dep174, Dep175 dep175) {
      this.keeper += dep171.getKeeper();
      this.keeper += dep172.getKeeper();
      this.keeper += dep173.getKeeper();
      this.keeper += dep174.getKeeper();
      this.keeper += dep175.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep40 {
    private Integer keeper = 0;

    @Inject
    Dep40(Dep176 dep176, Dep177 dep177, Dep178 dep178, Dep179 dep179) {
      this.keeper += dep176.getKeeper();
      this.keeper += dep177.getKeeper();
      this.keeper += dep178.getKeeper();
      this.keeper += dep179.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep41 {
    private Integer keeper = 0;

    Dep41(Dep180 dep180, Dep181 dep181, Dep182 dep182) {
      this.keeper += dep180.getKeeper();
      this.keeper += dep181.getKeeper();
      this.keeper += dep182.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep42 {
    private Integer keeper = 0;

    Dep42(Dep183 dep183, Dep184 dep184) {
      this.keeper += dep183.getKeeper();
      this.keeper += dep184.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep43 {
    private Integer keeper = 0;

    Dep43(
        Dep185 dep185, Dep186 dep186, Dep187 dep187, Dep188 dep188, Dep189 dep189, Dep190 dep190) {
      this.keeper += dep185.getKeeper();
      this.keeper += dep186.getKeeper();
      this.keeper += dep187.getKeeper();
      this.keeper += dep188.getKeeper();
      this.keeper += dep189.getKeeper();
      this.keeper += dep190.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep44 {
    private Integer keeper = 0;

    Dep44(Dep191 dep191, Dep192 dep192, Dep193 dep193) {
      this.keeper += dep191.getKeeper();
      this.keeper += dep192.getKeeper();
      this.keeper += dep193.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep45 {
    private Integer keeper = 0;

    @Inject
    Dep45(Dep194 dep194, Dep195 dep195, Dep196 dep196, Dep197 dep197, Dep198 dep198) {
      this.keeper += dep194.getKeeper();
      this.keeper += dep195.getKeeper();
      this.keeper += dep196.getKeeper();
      this.keeper += dep197.getKeeper();
      this.keeper += dep198.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep46 {
    private Integer keeper = 0;

    @Inject
    Dep46(Dep199 dep199, Dep200 dep200, Dep201 dep201, Dep202 dep202) {
      this.keeper += dep199.getKeeper();
      this.keeper += dep200.getKeeper();
      this.keeper += dep201.getKeeper();
      this.keeper += dep202.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep47 {
    private Integer keeper = 0;

    Dep47(Dep203 dep203, Dep204 dep204, Dep205 dep205, Dep206 dep206, Dep207 dep207) {
      this.keeper += dep203.getKeeper();
      this.keeper += dep204.getKeeper();
      this.keeper += dep205.getKeeper();
      this.keeper += dep206.getKeeper();
      this.keeper += dep207.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep48 {
    private Integer keeper = 0;

    @Inject
    Dep48(Dep208 dep208, Dep209 dep209, Dep210 dep210, Dep211 dep211, Dep212 dep212) {
      this.keeper += dep208.getKeeper();
      this.keeper += dep209.getKeeper();
      this.keeper += dep210.getKeeper();
      this.keeper += dep211.getKeeper();
      this.keeper += dep212.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep49 {
    private Integer keeper = 0;

    Dep49(Dep213 dep213, Dep214 dep214, Dep215 dep215, Dep216 dep216, Dep217 dep217) {
      this.keeper += dep213.getKeeper();
      this.keeper += dep214.getKeeper();
      this.keeper += dep215.getKeeper();
      this.keeper += dep216.getKeeper();
      this.keeper += dep217.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep50 {
    private Integer keeper = 0;

    Dep50(Dep218 dep218) {
      this.keeper += dep218.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep51 {
    private Integer keeper = 0;

    Dep51(Dep219 dep219, Dep220 dep220) {
      this.keeper += dep219.getKeeper();
      this.keeper += dep220.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep52 {
    private Integer keeper = 0;

    @Inject
    Dep52(Dep221 dep221, Dep222 dep222, Dep223 dep223, Dep224 dep224) {
      this.keeper += dep221.getKeeper();
      this.keeper += dep222.getKeeper();
      this.keeper += dep223.getKeeper();
      this.keeper += dep224.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep53 {
    private Integer keeper = 0;

    Dep53(Dep225 dep225, Dep226 dep226, Dep227 dep227) {
      this.keeper += dep225.getKeeper();
      this.keeper += dep226.getKeeper();
      this.keeper += dep227.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep54 {
    private Integer keeper = 0;

    Dep54(Dep228 dep228) {
      this.keeper += dep228.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep55 {
    private Integer keeper = 0;

    @Inject
    Dep55(Dep229 dep229, Dep230 dep230, Dep231 dep231, Dep232 dep232) {
      this.keeper += dep229.getKeeper();
      this.keeper += dep230.getKeeper();
      this.keeper += dep231.getKeeper();
      this.keeper += dep232.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep56 {
    private Integer keeper = 0;

    @Inject
    Dep56(Dep233 dep233, Dep234 dep234, Dep235 dep235, Dep236 dep236, Dep237 dep237) {
      this.keeper += dep233.getKeeper();
      this.keeper += dep234.getKeeper();
      this.keeper += dep235.getKeeper();
      this.keeper += dep236.getKeeper();
      this.keeper += dep237.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep57 {
    private Integer keeper = 0;

    Dep57(Dep238 dep238, Dep239 dep239, Dep240 dep240, Dep241 dep241, Dep242 dep242) {
      this.keeper += dep238.getKeeper();
      this.keeper += dep239.getKeeper();
      this.keeper += dep240.getKeeper();
      this.keeper += dep241.getKeeper();
      this.keeper += dep242.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep58 {
    private Integer keeper = 0;

    Dep58(
        Dep243 dep243, Dep244 dep244, Dep245 dep245, Dep246 dep246, Dep247 dep247, Dep248 dep248) {
      this.keeper += dep243.getKeeper();
      this.keeper += dep244.getKeeper();
      this.keeper += dep245.getKeeper();
      this.keeper += dep246.getKeeper();
      this.keeper += dep247.getKeeper();
      this.keeper += dep248.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep59 {
    private Integer keeper = 0;

    Dep59(Dep249 dep249, Dep250 dep250, Dep251 dep251, Dep252 dep252) {
      this.keeper += dep249.getKeeper();
      this.keeper += dep250.getKeeper();
      this.keeper += dep251.getKeeper();
      this.keeper += dep252.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep60 {
    private Integer keeper = 0;

    Dep60(Dep253 dep253, Dep254 dep254) {
      this.keeper += dep253.getKeeper();
      this.keeper += dep254.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep61 {
    private Integer keeper = 0;

    @Inject
    Dep61(
        Dep255 dep255, Dep256 dep256, Dep257 dep257, Dep258 dep258, Dep259 dep259, Dep260 dep260) {
      this.keeper += dep255.getKeeper();
      this.keeper += dep256.getKeeper();
      this.keeper += dep257.getKeeper();
      this.keeper += dep258.getKeeper();
      this.keeper += dep259.getKeeper();
      this.keeper += dep260.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep62 {
    private Integer keeper = 0;

    Dep62(Dep261 dep261, Dep262 dep262, Dep263 dep263, Dep264 dep264, Dep265 dep265) {
      this.keeper += dep261.getKeeper();
      this.keeper += dep262.getKeeper();
      this.keeper += dep263.getKeeper();
      this.keeper += dep264.getKeeper();
      this.keeper += dep265.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep63 {
    private Integer keeper = 0;

    Dep63(Dep266 dep266, Dep267 dep267) {
      this.keeper += dep266.getKeeper();
      this.keeper += dep267.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep64 {
    private Integer keeper = 0;

    Dep64(Dep268 dep268) {
      this.keeper += dep268.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep65 {
    private Integer keeper = 0;

    Dep65(Dep269 dep269) {
      this.keeper += dep269.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep66 {
    private Integer keeper = 0;

    @Inject
    Dep66(Dep270 dep270, Dep271 dep271, Dep272 dep272, Dep273 dep273) {
      this.keeper += dep270.getKeeper();
      this.keeper += dep271.getKeeper();
      this.keeper += dep272.getKeeper();
      this.keeper += dep273.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep67 {
    private Integer keeper = 0;

    @Inject
    Dep67(Dep274 dep274, Dep275 dep275) {
      this.keeper += dep274.getKeeper();
      this.keeper += dep275.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep68 {
    private Integer keeper = 0;

    Dep68(Dep276 dep276, Dep277 dep277, Dep278 dep278) {
      this.keeper += dep276.getKeeper();
      this.keeper += dep277.getKeeper();
      this.keeper += dep278.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep69 {
    private Integer keeper = 0;

    Dep69(Dep279 dep279, Dep280 dep280, Dep281 dep281, Dep282 dep282, Dep283 dep283) {
      this.keeper += dep279.getKeeper();
      this.keeper += dep280.getKeeper();
      this.keeper += dep281.getKeeper();
      this.keeper += dep282.getKeeper();
      this.keeper += dep283.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep70 {
    private Integer keeper = 0;

    Dep70(Dep284 dep284) {
      this.keeper += dep284.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep71 {
    private Integer keeper = 0;

    Dep71(Dep285 dep285, Dep286 dep286, Dep287 dep287) {
      this.keeper += dep285.getKeeper();
      this.keeper += dep286.getKeeper();
      this.keeper += dep287.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep72 {
    private Integer keeper = 0;

    @Inject
    Dep72(Dep288 dep288, Dep289 dep289, Dep290 dep290, Dep291 dep291, Dep292 dep292) {
      this.keeper += dep288.getKeeper();
      this.keeper += dep289.getKeeper();
      this.keeper += dep290.getKeeper();
      this.keeper += dep291.getKeeper();
      this.keeper += dep292.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep73 {
    private Integer keeper = 0;

    @Inject
    Dep73(
        Dep293 dep293, Dep294 dep294, Dep295 dep295, Dep296 dep296, Dep297 dep297, Dep298 dep298) {
      this.keeper += dep293.getKeeper();
      this.keeper += dep294.getKeeper();
      this.keeper += dep295.getKeeper();
      this.keeper += dep296.getKeeper();
      this.keeper += dep297.getKeeper();
      this.keeper += dep298.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep74 {
    private Integer keeper = 0;

    @Inject
    Dep74(
        Dep299 dep299, Dep300 dep300, Dep301 dep301, Dep302 dep302, Dep303 dep303, Dep304 dep304) {
      this.keeper += dep299.getKeeper();
      this.keeper += dep300.getKeeper();
      this.keeper += dep301.getKeeper();
      this.keeper += dep302.getKeeper();
      this.keeper += dep303.getKeeper();
      this.keeper += dep304.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep75 {
    private Integer keeper = 0;

    @Inject
    Dep75(Dep305 dep305, Dep306 dep306, Dep307 dep307) {
      this.keeper += dep305.getKeeper();
      this.keeper += dep306.getKeeper();
      this.keeper += dep307.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep76 {
    private Integer keeper = 0;

    @Inject
    Dep76(Dep308 dep308) {
      this.keeper += dep308.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep77 {
    private Integer keeper = 0;

    Dep77(
        Dep309 dep309, Dep310 dep310, Dep311 dep311, Dep312 dep312, Dep313 dep313, Dep314 dep314) {
      this.keeper += dep309.getKeeper();
      this.keeper += dep310.getKeeper();
      this.keeper += dep311.getKeeper();
      this.keeper += dep312.getKeeper();
      this.keeper += dep313.getKeeper();
      this.keeper += dep314.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep78 {
    private Integer keeper = 0;

    Dep78(Dep315 dep315) {
      this.keeper += dep315.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep79 {
    private Integer keeper = 0;

    Dep79(Dep316 dep316, Dep317 dep317) {
      this.keeper += dep316.getKeeper();
      this.keeper += dep317.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep80 {
    private Integer keeper = 0;

    Dep80(Dep318 dep318, Dep319 dep319, Dep320 dep320, Dep321 dep321, Dep322 dep322) {
      this.keeper += dep318.getKeeper();
      this.keeper += dep319.getKeeper();
      this.keeper += dep320.getKeeper();
      this.keeper += dep321.getKeeper();
      this.keeper += dep322.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep81 {
    private Integer keeper = 0;

    @Inject
    Dep81(Dep323 dep323, Dep324 dep324) {
      this.keeper += dep323.getKeeper();
      this.keeper += dep324.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep82 {
    private Integer keeper = 0;

    @Inject
    Dep82(Dep325 dep325, Dep326 dep326, Dep327 dep327, Dep328 dep328) {
      this.keeper += dep325.getKeeper();
      this.keeper += dep326.getKeeper();
      this.keeper += dep327.getKeeper();
      this.keeper += dep328.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep83 {
    private Integer keeper = 0;

    Dep83(Dep329 dep329, Dep330 dep330, Dep331 dep331, Dep332 dep332) {
      this.keeper += dep329.getKeeper();
      this.keeper += dep330.getKeeper();
      this.keeper += dep331.getKeeper();
      this.keeper += dep332.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep84 {
    private Integer keeper = 0;

    @Inject
    Dep84(Dep333 dep333, Dep334 dep334) {
      this.keeper += dep333.getKeeper();
      this.keeper += dep334.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep85 {
    private Integer keeper = 0;

    @Inject
    Dep85(Dep335 dep335, Dep336 dep336, Dep337 dep337, Dep338 dep338) {
      this.keeper += dep335.getKeeper();
      this.keeper += dep336.getKeeper();
      this.keeper += dep337.getKeeper();
      this.keeper += dep338.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep86 {
    private Integer keeper = 0;

    @Inject
    Dep86(Dep339 dep339) {
      this.keeper += dep339.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep87 {
    private Integer keeper = 0;

    @Inject
    Dep87(Dep340 dep340, Dep341 dep341) {
      this.keeper += dep340.getKeeper();
      this.keeper += dep341.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep88 {
    private Integer keeper = 0;

    Dep88(Dep342 dep342, Dep343 dep343) {
      this.keeper += dep342.getKeeper();
      this.keeper += dep343.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep89 {
    private Integer keeper = 0;

    @Inject
    Dep89(Dep344 dep344, Dep345 dep345, Dep346 dep346, Dep347 dep347) {
      this.keeper += dep344.getKeeper();
      this.keeper += dep345.getKeeper();
      this.keeper += dep346.getKeeper();
      this.keeper += dep347.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep90 {
    private Integer keeper = 0;

    @Inject
    Dep90(Dep348 dep348, Dep349 dep349) {
      this.keeper += dep348.getKeeper();
      this.keeper += dep349.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep91 {
    private Integer keeper = 0;

    Dep91(Dep350 dep350, Dep351 dep351, Dep352 dep352, Dep353 dep353) {
      this.keeper += dep350.getKeeper();
      this.keeper += dep351.getKeeper();
      this.keeper += dep352.getKeeper();
      this.keeper += dep353.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep92 {
    private Integer keeper = 0;

    Dep92(Dep354 dep354, Dep355 dep355, Dep356 dep356, Dep357 dep357, Dep358 dep358) {
      this.keeper += dep354.getKeeper();
      this.keeper += dep355.getKeeper();
      this.keeper += dep356.getKeeper();
      this.keeper += dep357.getKeeper();
      this.keeper += dep358.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep93 {
    private Integer keeper = 0;

    @Inject
    Dep93(Dep359 dep359) {
      this.keeper += dep359.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep94 {
    private Integer keeper = 0;

    Dep94(Dep360 dep360) {
      this.keeper += dep360.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep95 {
    private Integer keeper = 0;

    Dep95(Dep361 dep361, Dep362 dep362, Dep363 dep363) {
      this.keeper += dep361.getKeeper();
      this.keeper += dep362.getKeeper();
      this.keeper += dep363.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep96 {
    private Integer keeper = 0;

    Dep96(Dep364 dep364, Dep365 dep365) {
      this.keeper += dep364.getKeeper();
      this.keeper += dep365.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep97 {
    private Integer keeper = 0;

    @Inject
    Dep97(Dep366 dep366, Dep367 dep367, Dep368 dep368, Dep369 dep369) {
      this.keeper += dep366.getKeeper();
      this.keeper += dep367.getKeeper();
      this.keeper += dep368.getKeeper();
      this.keeper += dep369.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep98 {
    private Integer keeper = 0;

    Dep98(Dep370 dep370) {
      this.keeper += dep370.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep99 {
    private Integer keeper = 0;

    @Inject
    Dep99(Dep371 dep371, Dep372 dep372, Dep373 dep373, Dep374 dep374) {
      this.keeper += dep371.getKeeper();
      this.keeper += dep372.getKeeper();
      this.keeper += dep373.getKeeper();
      this.keeper += dep374.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep100 {
    private Integer keeper = 0;

    Dep100(Dep375 dep375, Dep376 dep376, Dep377 dep377, Dep378 dep378) {
      this.keeper += dep375.getKeeper();
      this.keeper += dep376.getKeeper();
      this.keeper += dep377.getKeeper();
      this.keeper += dep378.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep101 {
    private Integer keeper = 0;

    Dep101(Dep379 dep379, Dep380 dep380, Dep381 dep381) {
      this.keeper += dep379.getKeeper();
      this.keeper += dep380.getKeeper();
      this.keeper += dep381.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep102 {
    private Integer keeper = 0;

    @Inject
    Dep102(Dep382 dep382, Dep383 dep383, Dep384 dep384, Dep385 dep385) {
      this.keeper += dep382.getKeeper();
      this.keeper += dep383.getKeeper();
      this.keeper += dep384.getKeeper();
      this.keeper += dep385.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep103 {
    private Integer keeper = 0;

    @Inject
    Dep103(
        Dep386 dep386, Dep387 dep387, Dep388 dep388, Dep389 dep389, Dep390 dep390, Dep391 dep391) {
      this.keeper += dep386.getKeeper();
      this.keeper += dep387.getKeeper();
      this.keeper += dep388.getKeeper();
      this.keeper += dep389.getKeeper();
      this.keeper += dep390.getKeeper();
      this.keeper += dep391.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep104 {
    private Integer keeper = 0;

    Dep104(
        Dep392 dep392, Dep393 dep393, Dep394 dep394, Dep395 dep395, Dep396 dep396, Dep397 dep397) {
      this.keeper += dep392.getKeeper();
      this.keeper += dep393.getKeeper();
      this.keeper += dep394.getKeeper();
      this.keeper += dep395.getKeeper();
      this.keeper += dep396.getKeeper();
      this.keeper += dep397.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep105 {
    private Integer keeper = 0;

    @Inject
    Dep105(Dep398 dep398, Dep399 dep399, Dep400 dep400, Dep401 dep401) {
      this.keeper += dep398.getKeeper();
      this.keeper += dep399.getKeeper();
      this.keeper += dep400.getKeeper();
      this.keeper += dep401.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep106 {
    private Integer keeper = 0;

    @Inject
    Dep106(Dep402 dep402, Dep403 dep403) {
      this.keeper += dep402.getKeeper();
      this.keeper += dep403.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep107 {
    private Integer keeper = 0;

    Dep107(Dep404 dep404, Dep405 dep405, Dep406 dep406, Dep407 dep407) {
      this.keeper += dep404.getKeeper();
      this.keeper += dep405.getKeeper();
      this.keeper += dep406.getKeeper();
      this.keeper += dep407.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep108 {
    private Integer keeper = 0;

    Dep108(Dep408 dep408, Dep409 dep409, Dep410 dep410, Dep411 dep411) {
      this.keeper += dep408.getKeeper();
      this.keeper += dep409.getKeeper();
      this.keeper += dep410.getKeeper();
      this.keeper += dep411.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep109 {
    private Integer keeper = 0;

    Dep109(Dep412 dep412) {
      this.keeper += dep412.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep110 {
    private Integer keeper = 0;

    @Inject
    Dep110(Dep413 dep413, Dep414 dep414) {
      this.keeper += dep413.getKeeper();
      this.keeper += dep414.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep111 {
    private Integer keeper = 0;

    @Inject
    Dep111(Dep415 dep415, Dep416 dep416, Dep417 dep417, Dep418 dep418, Dep419 dep419) {
      this.keeper += dep415.getKeeper();
      this.keeper += dep416.getKeeper();
      this.keeper += dep417.getKeeper();
      this.keeper += dep418.getKeeper();
      this.keeper += dep419.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep112 {
    private Integer keeper = 0;

    Dep112(
        Dep420 dep420, Dep421 dep421, Dep422 dep422, Dep423 dep423, Dep424 dep424, Dep425 dep425) {
      this.keeper += dep420.getKeeper();
      this.keeper += dep421.getKeeper();
      this.keeper += dep422.getKeeper();
      this.keeper += dep423.getKeeper();
      this.keeper += dep424.getKeeper();
      this.keeper += dep425.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep113 {
    private Integer keeper = 0;

    @Inject
    Dep113(Dep426 dep426, Dep427 dep427, Dep428 dep428, Dep429 dep429, Dep430 dep430) {
      this.keeper += dep426.getKeeper();
      this.keeper += dep427.getKeeper();
      this.keeper += dep428.getKeeper();
      this.keeper += dep429.getKeeper();
      this.keeper += dep430.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep114 {
    private Integer keeper = 0;

    @Inject
    Dep114(Dep431 dep431, Dep432 dep432) {
      this.keeper += dep431.getKeeper();
      this.keeper += dep432.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep115 {
    private Integer keeper = 0;

    @Inject
    Dep115(Dep433 dep433, Dep434 dep434) {
      this.keeper += dep433.getKeeper();
      this.keeper += dep434.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep116 {
    private Integer keeper = 0;

    Dep116(Dep435 dep435, Dep436 dep436) {
      this.keeper += dep435.getKeeper();
      this.keeper += dep436.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep117 {
    private Integer keeper = 0;

    @Inject
    Dep117(Dep437 dep437) {
      this.keeper += dep437.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep118 {
    private Integer keeper = 0;

    @Inject
    Dep118(Dep438 dep438, Dep439 dep439) {
      this.keeper += dep438.getKeeper();
      this.keeper += dep439.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep119 {
    private Integer keeper = 0;

    Dep119(Dep440 dep440) {
      this.keeper += dep440.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep120 {
    private Integer keeper = 0;

    @Inject
    Dep120(Dep441 dep441, Dep442 dep442, Dep443 dep443, Dep444 dep444) {
      this.keeper += dep441.getKeeper();
      this.keeper += dep442.getKeeper();
      this.keeper += dep443.getKeeper();
      this.keeper += dep444.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep121 {
    private Integer keeper = 0;

    @Inject
    Dep121(Dep445 dep445, Dep446 dep446, Dep447 dep447, Dep448 dep448) {
      this.keeper += dep445.getKeeper();
      this.keeper += dep446.getKeeper();
      this.keeper += dep447.getKeeper();
      this.keeper += dep448.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep122 {
    private Integer keeper = 0;

    Dep122(Dep449 dep449, Dep450 dep450, Dep451 dep451) {
      this.keeper += dep449.getKeeper();
      this.keeper += dep450.getKeeper();
      this.keeper += dep451.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep123 {
    private Integer keeper = 0;

    Dep123(Dep452 dep452, Dep453 dep453, Dep454 dep454) {
      this.keeper += dep452.getKeeper();
      this.keeper += dep453.getKeeper();
      this.keeper += dep454.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep124 {
    private Integer keeper = 0;

    Dep124(Dep455 dep455, Dep456 dep456) {
      this.keeper += dep455.getKeeper();
      this.keeper += dep456.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep125 {
    private Integer keeper = 0;

    Dep125(Dep457 dep457, Dep458 dep458, Dep459 dep459, Dep460 dep460, Dep461 dep461) {
      this.keeper += dep457.getKeeper();
      this.keeper += dep458.getKeeper();
      this.keeper += dep459.getKeeper();
      this.keeper += dep460.getKeeper();
      this.keeper += dep461.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep126 {
    private Integer keeper = 0;

    Dep126(Dep462 dep462, Dep463 dep463, Dep464 dep464) {
      this.keeper += dep462.getKeeper();
      this.keeper += dep463.getKeeper();
      this.keeper += dep464.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep127 {
    private Integer keeper = 0;

    @Inject
    Dep127(Dep465 dep465, Dep466 dep466, Dep467 dep467, Dep468 dep468, Dep469 dep469) {
      this.keeper += dep465.getKeeper();
      this.keeper += dep466.getKeeper();
      this.keeper += dep467.getKeeper();
      this.keeper += dep468.getKeeper();
      this.keeper += dep469.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep128 {
    private Integer keeper = 0;

    Dep128(Dep470 dep470, Dep471 dep471, Dep472 dep472) {
      this.keeper += dep470.getKeeper();
      this.keeper += dep471.getKeeper();
      this.keeper += dep472.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep129 {
    private Integer keeper = 0;

    Dep129(Dep473 dep473, Dep474 dep474, Dep475 dep475, Dep476 dep476, Dep477 dep477) {
      this.keeper += dep473.getKeeper();
      this.keeper += dep474.getKeeper();
      this.keeper += dep475.getKeeper();
      this.keeper += dep476.getKeeper();
      this.keeper += dep477.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep130 {
    private Integer keeper = 0;

    Dep130(Dep478 dep478) {
      this.keeper += dep478.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep131 {
    private Integer keeper = 0;

    @Inject
    Dep131(Dep479 dep479) {
      this.keeper += dep479.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep132 {
    private Integer keeper = 0;

    Dep132(
        Dep480 dep480, Dep481 dep481, Dep482 dep482, Dep483 dep483, Dep484 dep484, Dep485 dep485) {
      this.keeper += dep480.getKeeper();
      this.keeper += dep481.getKeeper();
      this.keeper += dep482.getKeeper();
      this.keeper += dep483.getKeeper();
      this.keeper += dep484.getKeeper();
      this.keeper += dep485.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep133 {
    private Integer keeper = 0;

    Dep133(Dep486 dep486, Dep487 dep487, Dep488 dep488, Dep489 dep489) {
      this.keeper += dep486.getKeeper();
      this.keeper += dep487.getKeeper();
      this.keeper += dep488.getKeeper();
      this.keeper += dep489.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep134 {
    private Integer keeper = 0;

    Dep134(
        Dep490 dep490, Dep491 dep491, Dep492 dep492, Dep493 dep493, Dep494 dep494, Dep495 dep495) {
      this.keeper += dep490.getKeeper();
      this.keeper += dep491.getKeeper();
      this.keeper += dep492.getKeeper();
      this.keeper += dep493.getKeeper();
      this.keeper += dep494.getKeeper();
      this.keeper += dep495.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep135 {
    private Integer keeper = 0;

    Dep135(Dep496 dep496, Dep497 dep497) {
      this.keeper += dep496.getKeeper();
      this.keeper += dep497.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep136 {
    private Integer keeper = 0;

    Dep136(Dep498 dep498, Dep499 dep499, Dep500 dep500, Dep501 dep501, Dep502 dep502) {
      this.keeper += dep498.getKeeper();
      this.keeper += dep499.getKeeper();
      this.keeper += dep500.getKeeper();
      this.keeper += dep501.getKeeper();
      this.keeper += dep502.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep137 {
    private Integer keeper = 0;

    @Inject
    Dep137(
        Dep503 dep503, Dep504 dep504, Dep505 dep505, Dep506 dep506, Dep507 dep507, Dep508 dep508) {
      this.keeper += dep503.getKeeper();
      this.keeper += dep504.getKeeper();
      this.keeper += dep505.getKeeper();
      this.keeper += dep506.getKeeper();
      this.keeper += dep507.getKeeper();
      this.keeper += dep508.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep138 {
    private Integer keeper = 0;

    Dep138(Dep509 dep509, Dep510 dep510, Dep511 dep511) {
      this.keeper += dep509.getKeeper();
      this.keeper += dep510.getKeeper();
      this.keeper += dep511.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep139 {
    private Integer keeper = 0;

    @Inject
    Dep139(Dep512 dep512, Dep513 dep513, Dep514 dep514, Dep515 dep515, Dep516 dep516) {
      this.keeper += dep512.getKeeper();
      this.keeper += dep513.getKeeper();
      this.keeper += dep514.getKeeper();
      this.keeper += dep515.getKeeper();
      this.keeper += dep516.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep140 {
    private Integer keeper = 0;

    @Inject
    Dep140(Dep517 dep517, Dep518 dep518, Dep519 dep519, Dep520 dep520) {
      this.keeper += dep517.getKeeper();
      this.keeper += dep518.getKeeper();
      this.keeper += dep519.getKeeper();
      this.keeper += dep520.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep141 {
    private Integer keeper = 0;

    Dep141(Dep521 dep521, Dep522 dep522) {
      this.keeper += dep521.getKeeper();
      this.keeper += dep522.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep142 {
    private Integer keeper = 0;

    Dep142(
        Dep523 dep523, Dep524 dep524, Dep525 dep525, Dep526 dep526, Dep527 dep527, Dep528 dep528) {
      this.keeper += dep523.getKeeper();
      this.keeper += dep524.getKeeper();
      this.keeper += dep525.getKeeper();
      this.keeper += dep526.getKeeper();
      this.keeper += dep527.getKeeper();
      this.keeper += dep528.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep143 {
    private Integer keeper = 0;

    @Inject
    Dep143(
        Dep529 dep529, Dep530 dep530, Dep531 dep531, Dep532 dep532, Dep533 dep533, Dep534 dep534) {
      this.keeper += dep529.getKeeper();
      this.keeper += dep530.getKeeper();
      this.keeper += dep531.getKeeper();
      this.keeper += dep532.getKeeper();
      this.keeper += dep533.getKeeper();
      this.keeper += dep534.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep144 {
    private Integer keeper = 0;

    Dep144(
        Dep535 dep535, Dep536 dep536, Dep537 dep537, Dep538 dep538, Dep539 dep539, Dep540 dep540) {
      this.keeper += dep535.getKeeper();
      this.keeper += dep536.getKeeper();
      this.keeper += dep537.getKeeper();
      this.keeper += dep538.getKeeper();
      this.keeper += dep539.getKeeper();
      this.keeper += dep540.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep145 {
    private Integer keeper = 0;

    @Inject
    Dep145(Dep541 dep541, Dep542 dep542) {
      this.keeper += dep541.getKeeper();
      this.keeper += dep542.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep146 {
    private Integer keeper = 0;

    @Inject
    Dep146(Dep543 dep543, Dep544 dep544, Dep545 dep545, Dep546 dep546, Dep547 dep547) {
      this.keeper += dep543.getKeeper();
      this.keeper += dep544.getKeeper();
      this.keeper += dep545.getKeeper();
      this.keeper += dep546.getKeeper();
      this.keeper += dep547.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep147 {
    private Integer keeper = 0;

    Dep147(Dep548 dep548) {
      this.keeper += dep548.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep148 {
    private Integer keeper = 0;

    @Inject
    Dep148(
        Dep549 dep549, Dep550 dep550, Dep551 dep551, Dep552 dep552, Dep553 dep553, Dep554 dep554) {
      this.keeper += dep549.getKeeper();
      this.keeper += dep550.getKeeper();
      this.keeper += dep551.getKeeper();
      this.keeper += dep552.getKeeper();
      this.keeper += dep553.getKeeper();
      this.keeper += dep554.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep149 {
    private Integer keeper = 0;

    Dep149(
        Dep555 dep555, Dep556 dep556, Dep557 dep557, Dep558 dep558, Dep559 dep559, Dep560 dep560) {
      this.keeper += dep555.getKeeper();
      this.keeper += dep556.getKeeper();
      this.keeper += dep557.getKeeper();
      this.keeper += dep558.getKeeper();
      this.keeper += dep559.getKeeper();
      this.keeper += dep560.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep150 {
    private Integer keeper = 0;

    Dep150(
        Dep561 dep561, Dep562 dep562, Dep563 dep563, Dep564 dep564, Dep565 dep565, Dep566 dep566) {
      this.keeper += dep561.getKeeper();
      this.keeper += dep562.getKeeper();
      this.keeper += dep563.getKeeper();
      this.keeper += dep564.getKeeper();
      this.keeper += dep565.getKeeper();
      this.keeper += dep566.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep151 {
    private Integer keeper = 0;

    Dep151(Dep567 dep567, Dep568 dep568, Dep569 dep569, Dep570 dep570, Dep571 dep571) {
      this.keeper += dep567.getKeeper();
      this.keeper += dep568.getKeeper();
      this.keeper += dep569.getKeeper();
      this.keeper += dep570.getKeeper();
      this.keeper += dep571.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep152 {
    private Integer keeper = 0;

    @Inject
    Dep152(Dep572 dep572, Dep573 dep573) {
      this.keeper += dep572.getKeeper();
      this.keeper += dep573.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep153 {
    private Integer keeper = 0;

    @Inject
    Dep153(
        Dep574 dep574, Dep575 dep575, Dep576 dep576, Dep577 dep577, Dep578 dep578, Dep579 dep579) {
      this.keeper += dep574.getKeeper();
      this.keeper += dep575.getKeeper();
      this.keeper += dep576.getKeeper();
      this.keeper += dep577.getKeeper();
      this.keeper += dep578.getKeeper();
      this.keeper += dep579.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep154 {
    private Integer keeper = 0;

    @Inject
    Dep154(
        Dep580 dep580, Dep581 dep581, Dep582 dep582, Dep583 dep583, Dep584 dep584, Dep585 dep585) {
      this.keeper += dep580.getKeeper();
      this.keeper += dep581.getKeeper();
      this.keeper += dep582.getKeeper();
      this.keeper += dep583.getKeeper();
      this.keeper += dep584.getKeeper();
      this.keeper += dep585.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep155 {
    private Integer keeper = 0;

    Dep155(Dep586 dep586, Dep587 dep587, Dep588 dep588) {
      this.keeper += dep586.getKeeper();
      this.keeper += dep587.getKeeper();
      this.keeper += dep588.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep156 {
    private Integer keeper = 0;

    @Inject
    Dep156(Dep589 dep589) {
      this.keeper += dep589.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep157 {
    private Integer keeper = 0;

    @Inject
    Dep157(Dep590 dep590, Dep591 dep591, Dep592 dep592, Dep593 dep593, Dep594 dep594) {
      this.keeper += dep590.getKeeper();
      this.keeper += dep591.getKeeper();
      this.keeper += dep592.getKeeper();
      this.keeper += dep593.getKeeper();
      this.keeper += dep594.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep158 {
    private Integer keeper = 0;

    @Inject
    Dep158(Dep595 dep595, Dep596 dep596, Dep597 dep597) {
      this.keeper += dep595.getKeeper();
      this.keeper += dep596.getKeeper();
      this.keeper += dep597.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep159 {
    private Integer keeper = 0;

    @Inject
    Dep159(Dep598 dep598, Dep599 dep599, Dep600 dep600) {
      this.keeper += dep598.getKeeper();
      this.keeper += dep599.getKeeper();
      this.keeper += dep600.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep160 {
    private Integer keeper = 0;

    Dep160(Dep601 dep601, Dep602 dep602, Dep603 dep603, Dep604 dep604) {
      this.keeper += dep601.getKeeper();
      this.keeper += dep602.getKeeper();
      this.keeper += dep603.getKeeper();
      this.keeper += dep604.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep161 {
    private Integer keeper = 0;

    @Inject
    Dep161(
        Dep605 dep605, Dep606 dep606, Dep607 dep607, Dep608 dep608, Dep609 dep609, Dep610 dep610) {
      this.keeper += dep605.getKeeper();
      this.keeper += dep606.getKeeper();
      this.keeper += dep607.getKeeper();
      this.keeper += dep608.getKeeper();
      this.keeper += dep609.getKeeper();
      this.keeper += dep610.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep162 {
    private Integer keeper = 0;

    @Inject
    Dep162(Dep611 dep611, Dep612 dep612, Dep613 dep613, Dep614 dep614) {
      this.keeper += dep611.getKeeper();
      this.keeper += dep612.getKeeper();
      this.keeper += dep613.getKeeper();
      this.keeper += dep614.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep163 {
    private Integer keeper = 0;

    Dep163(Dep615 dep615) {
      this.keeper += dep615.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep164 {
    private Integer keeper = 0;

    Dep164(
        Dep616 dep616, Dep617 dep617, Dep618 dep618, Dep619 dep619, Dep620 dep620, Dep621 dep621) {
      this.keeper += dep616.getKeeper();
      this.keeper += dep617.getKeeper();
      this.keeper += dep618.getKeeper();
      this.keeper += dep619.getKeeper();
      this.keeper += dep620.getKeeper();
      this.keeper += dep621.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep165 {
    private Integer keeper = 0;

    @Inject
    Dep165(
        Dep622 dep622, Dep623 dep623, Dep624 dep624, Dep625 dep625, Dep626 dep626, Dep627 dep627) {
      this.keeper += dep622.getKeeper();
      this.keeper += dep623.getKeeper();
      this.keeper += dep624.getKeeper();
      this.keeper += dep625.getKeeper();
      this.keeper += dep626.getKeeper();
      this.keeper += dep627.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep166 {
    private Integer keeper = 0;

    Dep166(
        Dep628 dep628, Dep629 dep629, Dep630 dep630, Dep631 dep631, Dep632 dep632, Dep633 dep633) {
      this.keeper += dep628.getKeeper();
      this.keeper += dep629.getKeeper();
      this.keeper += dep630.getKeeper();
      this.keeper += dep631.getKeeper();
      this.keeper += dep632.getKeeper();
      this.keeper += dep633.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep167 {
    private Integer keeper = 0;

    @Inject
    Dep167(
        Dep634 dep634, Dep635 dep635, Dep636 dep636, Dep637 dep637, Dep638 dep638, Dep639 dep639) {
      this.keeper += dep634.getKeeper();
      this.keeper += dep635.getKeeper();
      this.keeper += dep636.getKeeper();
      this.keeper += dep637.getKeeper();
      this.keeper += dep638.getKeeper();
      this.keeper += dep639.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep168 {
    private Integer keeper = 0;

    @Inject
    Dep168(Dep640 dep640, Dep641 dep641, Dep642 dep642, Dep643 dep643, Dep644 dep644) {
      this.keeper += dep640.getKeeper();
      this.keeper += dep641.getKeeper();
      this.keeper += dep642.getKeeper();
      this.keeper += dep643.getKeeper();
      this.keeper += dep644.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep169 {
    private Integer keeper = 0;

    Dep169(
        Dep645 dep645, Dep646 dep646, Dep647 dep647, Dep648 dep648, Dep649 dep649, Dep650 dep650) {
      this.keeper += dep645.getKeeper();
      this.keeper += dep646.getKeeper();
      this.keeper += dep647.getKeeper();
      this.keeper += dep648.getKeeper();
      this.keeper += dep649.getKeeper();
      this.keeper += dep650.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep170 {
    private Integer keeper = 0;

    @Inject
    Dep170(Dep651 dep651, Dep652 dep652, Dep653 dep653, Dep654 dep654, Dep655 dep655) {
      this.keeper += dep651.getKeeper();
      this.keeper += dep652.getKeeper();
      this.keeper += dep653.getKeeper();
      this.keeper += dep654.getKeeper();
      this.keeper += dep655.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep171 {
    private Integer keeper = 0;

    Dep171(Dep656 dep656) {
      this.keeper += dep656.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep172 {
    private Integer keeper = 0;

    Dep172(Dep657 dep657, Dep658 dep658, Dep659 dep659, Dep660 dep660, Dep661 dep661) {
      this.keeper += dep657.getKeeper();
      this.keeper += dep658.getKeeper();
      this.keeper += dep659.getKeeper();
      this.keeper += dep660.getKeeper();
      this.keeper += dep661.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep173 {
    private Integer keeper = 0;

    Dep173(Dep662 dep662, Dep663 dep663, Dep664 dep664) {
      this.keeper += dep662.getKeeper();
      this.keeper += dep663.getKeeper();
      this.keeper += dep664.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep174 {
    private Integer keeper = 0;

    @Inject
    Dep174(Dep665 dep665, Dep666 dep666, Dep667 dep667, Dep668 dep668) {
      this.keeper += dep665.getKeeper();
      this.keeper += dep666.getKeeper();
      this.keeper += dep667.getKeeper();
      this.keeper += dep668.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep175 {
    private Integer keeper = 0;

    Dep175(Dep669 dep669, Dep670 dep670) {
      this.keeper += dep669.getKeeper();
      this.keeper += dep670.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep176 {
    private Integer keeper = 0;

    Dep176(Dep671 dep671, Dep672 dep672) {
      this.keeper += dep671.getKeeper();
      this.keeper += dep672.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep177 {
    private Integer keeper = 0;

    @Inject
    Dep177(Dep673 dep673, Dep674 dep674, Dep675 dep675, Dep676 dep676) {
      this.keeper += dep673.getKeeper();
      this.keeper += dep674.getKeeper();
      this.keeper += dep675.getKeeper();
      this.keeper += dep676.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep178 {
    private Integer keeper = 0;

    Dep178(Dep677 dep677, Dep678 dep678) {
      this.keeper += dep677.getKeeper();
      this.keeper += dep678.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep179 {
    private Integer keeper = 0;

    @Inject
    Dep179(Dep679 dep679) {
      this.keeper += dep679.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep180 {
    private Integer keeper = 0;

    @Inject
    Dep180(Dep680 dep680, Dep681 dep681) {
      this.keeper += dep680.getKeeper();
      this.keeper += dep681.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep181 {
    private Integer keeper = 0;

    Dep181(
        Dep682 dep682, Dep683 dep683, Dep684 dep684, Dep685 dep685, Dep686 dep686, Dep687 dep687) {
      this.keeper += dep682.getKeeper();
      this.keeper += dep683.getKeeper();
      this.keeper += dep684.getKeeper();
      this.keeper += dep685.getKeeper();
      this.keeper += dep686.getKeeper();
      this.keeper += dep687.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep182 {
    private Integer keeper = 0;

    @Inject
    Dep182(Dep688 dep688, Dep689 dep689, Dep690 dep690, Dep691 dep691) {
      this.keeper += dep688.getKeeper();
      this.keeper += dep689.getKeeper();
      this.keeper += dep690.getKeeper();
      this.keeper += dep691.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep183 {
    private Integer keeper = 0;

    @Inject
    Dep183(Dep692 dep692, Dep693 dep693, Dep694 dep694, Dep695 dep695, Dep696 dep696) {
      this.keeper += dep692.getKeeper();
      this.keeper += dep693.getKeeper();
      this.keeper += dep694.getKeeper();
      this.keeper += dep695.getKeeper();
      this.keeper += dep696.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep184 {
    private Integer keeper = 0;

    @Inject
    Dep184(
        Dep697 dep697, Dep698 dep698, Dep699 dep699, Dep700 dep700, Dep701 dep701, Dep702 dep702) {
      this.keeper += dep697.getKeeper();
      this.keeper += dep698.getKeeper();
      this.keeper += dep699.getKeeper();
      this.keeper += dep700.getKeeper();
      this.keeper += dep701.getKeeper();
      this.keeper += dep702.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep185 {
    private Integer keeper = 0;

    @Inject
    Dep185(Dep703 dep703, Dep704 dep704, Dep705 dep705, Dep706 dep706, Dep707 dep707) {
      this.keeper += dep703.getKeeper();
      this.keeper += dep704.getKeeper();
      this.keeper += dep705.getKeeper();
      this.keeper += dep706.getKeeper();
      this.keeper += dep707.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep186 {
    private Integer keeper = 0;

    Dep186(
        Dep708 dep708, Dep709 dep709, Dep710 dep710, Dep711 dep711, Dep712 dep712, Dep713 dep713) {
      this.keeper += dep708.getKeeper();
      this.keeper += dep709.getKeeper();
      this.keeper += dep710.getKeeper();
      this.keeper += dep711.getKeeper();
      this.keeper += dep712.getKeeper();
      this.keeper += dep713.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep187 {
    private Integer keeper = 0;

    Dep187(Dep714 dep714, Dep715 dep715) {
      this.keeper += dep714.getKeeper();
      this.keeper += dep715.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep188 {
    private Integer keeper = 0;

    @Inject
    Dep188(Dep716 dep716, Dep717 dep717, Dep718 dep718) {
      this.keeper += dep716.getKeeper();
      this.keeper += dep717.getKeeper();
      this.keeper += dep718.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep189 {
    private Integer keeper = 0;

    Dep189(Dep719 dep719, Dep720 dep720, Dep721 dep721) {
      this.keeper += dep719.getKeeper();
      this.keeper += dep720.getKeeper();
      this.keeper += dep721.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep190 {
    private Integer keeper = 0;

    @Inject
    Dep190(Dep722 dep722, Dep723 dep723) {
      this.keeper += dep722.getKeeper();
      this.keeper += dep723.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep191 {
    private Integer keeper = 0;

    @Inject
    Dep191(Dep724 dep724) {
      this.keeper += dep724.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep192 {
    private Integer keeper = 0;

    @Inject
    Dep192(Dep725 dep725, Dep726 dep726) {
      this.keeper += dep725.getKeeper();
      this.keeper += dep726.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep193 {
    private Integer keeper = 0;

    Dep193(Dep727 dep727, Dep728 dep728) {
      this.keeper += dep727.getKeeper();
      this.keeper += dep728.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep194 {
    private Integer keeper = 0;

    @Inject
    Dep194(
        Dep729 dep729, Dep730 dep730, Dep731 dep731, Dep732 dep732, Dep733 dep733, Dep734 dep734) {
      this.keeper += dep729.getKeeper();
      this.keeper += dep730.getKeeper();
      this.keeper += dep731.getKeeper();
      this.keeper += dep732.getKeeper();
      this.keeper += dep733.getKeeper();
      this.keeper += dep734.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep195 {
    private Integer keeper = 0;

    Dep195(Dep735 dep735, Dep736 dep736) {
      this.keeper += dep735.getKeeper();
      this.keeper += dep736.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep196 {
    private Integer keeper = 0;

    Dep196(Dep737 dep737, Dep738 dep738, Dep739 dep739) {
      this.keeper += dep737.getKeeper();
      this.keeper += dep738.getKeeper();
      this.keeper += dep739.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep197 {
    private Integer keeper = 0;

    Dep197(Dep740 dep740, Dep741 dep741, Dep742 dep742) {
      this.keeper += dep740.getKeeper();
      this.keeper += dep741.getKeeper();
      this.keeper += dep742.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep198 {
    private Integer keeper = 0;

    @Inject
    Dep198(Dep743 dep743, Dep744 dep744, Dep745 dep745, Dep746 dep746, Dep747 dep747) {
      this.keeper += dep743.getKeeper();
      this.keeper += dep744.getKeeper();
      this.keeper += dep745.getKeeper();
      this.keeper += dep746.getKeeper();
      this.keeper += dep747.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep199 {
    private Integer keeper = 0;

    @Inject
    Dep199(Dep748 dep748) {
      this.keeper += dep748.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep200 {
    private Integer keeper = 0;

    @Inject
    Dep200(Dep749 dep749, Dep750 dep750, Dep751 dep751, Dep752 dep752, Dep753 dep753) {
      this.keeper += dep749.getKeeper();
      this.keeper += dep750.getKeeper();
      this.keeper += dep751.getKeeper();
      this.keeper += dep752.getKeeper();
      this.keeper += dep753.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep201 {
    private Integer keeper = 0;

    Dep201(Dep754 dep754, Dep755 dep755) {
      this.keeper += dep754.getKeeper();
      this.keeper += dep755.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep202 {
    private Integer keeper = 0;

    @Inject
    Dep202(Dep756 dep756, Dep757 dep757, Dep758 dep758) {
      this.keeper += dep756.getKeeper();
      this.keeper += dep757.getKeeper();
      this.keeper += dep758.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep203 {
    private Integer keeper = 0;

    @Inject
    Dep203(Dep759 dep759, Dep760 dep760, Dep761 dep761, Dep762 dep762) {
      this.keeper += dep759.getKeeper();
      this.keeper += dep760.getKeeper();
      this.keeper += dep761.getKeeper();
      this.keeper += dep762.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep204 {
    private Integer keeper = 0;

    Dep204(Dep763 dep763, Dep764 dep764, Dep765 dep765) {
      this.keeper += dep763.getKeeper();
      this.keeper += dep764.getKeeper();
      this.keeper += dep765.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep205 {
    private Integer keeper = 0;

    Dep205(Dep766 dep766) {
      this.keeper += dep766.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep206 {
    private Integer keeper = 0;

    Dep206(Dep767 dep767) {
      this.keeper += dep767.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep207 {
    private Integer keeper = 0;

    @Inject
    Dep207(Dep768 dep768, Dep769 dep769, Dep770 dep770) {
      this.keeper += dep768.getKeeper();
      this.keeper += dep769.getKeeper();
      this.keeper += dep770.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep208 {
    private Integer keeper = 0;

    @Inject
    Dep208(Dep771 dep771, Dep772 dep772, Dep773 dep773, Dep774 dep774, Dep775 dep775) {
      this.keeper += dep771.getKeeper();
      this.keeper += dep772.getKeeper();
      this.keeper += dep773.getKeeper();
      this.keeper += dep774.getKeeper();
      this.keeper += dep775.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep209 {
    private Integer keeper = 0;

    Dep209(
        Dep776 dep776, Dep777 dep777, Dep778 dep778, Dep779 dep779, Dep780 dep780, Dep781 dep781) {
      this.keeper += dep776.getKeeper();
      this.keeper += dep777.getKeeper();
      this.keeper += dep778.getKeeper();
      this.keeper += dep779.getKeeper();
      this.keeper += dep780.getKeeper();
      this.keeper += dep781.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep210 {
    private Integer keeper = 0;

    Dep210(Dep782 dep782, Dep783 dep783, Dep784 dep784, Dep785 dep785, Dep786 dep786) {
      this.keeper += dep782.getKeeper();
      this.keeper += dep783.getKeeper();
      this.keeper += dep784.getKeeper();
      this.keeper += dep785.getKeeper();
      this.keeper += dep786.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep211 {
    private Integer keeper = 0;

    @Inject
    Dep211(Dep787 dep787) {
      this.keeper += dep787.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep212 {
    private Integer keeper = 0;

    @Inject
    Dep212(Dep788 dep788, Dep789 dep789, Dep790 dep790) {
      this.keeper += dep788.getKeeper();
      this.keeper += dep789.getKeeper();
      this.keeper += dep790.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep213 {
    private Integer keeper = 0;

    @Inject
    Dep213(Dep791 dep791) {
      this.keeper += dep791.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep214 {
    private Integer keeper = 0;

    Dep214(Dep792 dep792) {
      this.keeper += dep792.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep215 {
    private Integer keeper = 0;

    Dep215(Dep793 dep793, Dep794 dep794, Dep795 dep795, Dep796 dep796) {
      this.keeper += dep793.getKeeper();
      this.keeper += dep794.getKeeper();
      this.keeper += dep795.getKeeper();
      this.keeper += dep796.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep216 {
    private Integer keeper = 0;

    @Inject
    Dep216(Dep797 dep797, Dep798 dep798, Dep799 dep799) {
      this.keeper += dep797.getKeeper();
      this.keeper += dep798.getKeeper();
      this.keeper += dep799.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep217 {
    private Integer keeper = 0;

    @Inject
    Dep217(Dep800 dep800, Dep801 dep801, Dep802 dep802, Dep803 dep803) {
      this.keeper += dep800.getKeeper();
      this.keeper += dep801.getKeeper();
      this.keeper += dep802.getKeeper();
      this.keeper += dep803.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep218 {
    private Integer keeper = 0;

    Dep218(Dep804 dep804, Dep805 dep805, Dep806 dep806, Dep807 dep807, Dep808 dep808) {
      this.keeper += dep804.getKeeper();
      this.keeper += dep805.getKeeper();
      this.keeper += dep806.getKeeper();
      this.keeper += dep807.getKeeper();
      this.keeper += dep808.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep219 {
    private Integer keeper = 0;

    Dep219(Dep809 dep809, Dep810 dep810) {
      this.keeper += dep809.getKeeper();
      this.keeper += dep810.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep220 {
    private Integer keeper = 0;

    Dep220(Dep811 dep811, Dep812 dep812, Dep813 dep813) {
      this.keeper += dep811.getKeeper();
      this.keeper += dep812.getKeeper();
      this.keeper += dep813.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep221 {
    private Integer keeper = 0;

    Dep221(Dep814 dep814, Dep815 dep815) {
      this.keeper += dep814.getKeeper();
      this.keeper += dep815.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep222 {
    private Integer keeper = 0;

    @Inject
    Dep222(Dep816 dep816, Dep817 dep817, Dep818 dep818) {
      this.keeper += dep816.getKeeper();
      this.keeper += dep817.getKeeper();
      this.keeper += dep818.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep223 {
    private Integer keeper = 0;

    @Inject
    Dep223(Dep819 dep819, Dep820 dep820) {
      this.keeper += dep819.getKeeper();
      this.keeper += dep820.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep224 {
    private Integer keeper = 0;

    Dep224(Dep821 dep821, Dep822 dep822, Dep823 dep823, Dep824 dep824, Dep825 dep825) {
      this.keeper += dep821.getKeeper();
      this.keeper += dep822.getKeeper();
      this.keeper += dep823.getKeeper();
      this.keeper += dep824.getKeeper();
      this.keeper += dep825.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep225 {
    private Integer keeper = 0;

    Dep225(Dep826 dep826, Dep827 dep827, Dep828 dep828) {
      this.keeper += dep826.getKeeper();
      this.keeper += dep827.getKeeper();
      this.keeper += dep828.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep226 {
    private Integer keeper = 0;

    @Inject
    Dep226(Dep829 dep829) {
      this.keeper += dep829.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep227 {
    private Integer keeper = 0;

    Dep227(Dep830 dep830, Dep831 dep831, Dep832 dep832, Dep833 dep833, Dep834 dep834) {
      this.keeper += dep830.getKeeper();
      this.keeper += dep831.getKeeper();
      this.keeper += dep832.getKeeper();
      this.keeper += dep833.getKeeper();
      this.keeper += dep834.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep228 {
    private Integer keeper = 0;

    Dep228(Dep835 dep835, Dep836 dep836, Dep837 dep837, Dep838 dep838) {
      this.keeper += dep835.getKeeper();
      this.keeper += dep836.getKeeper();
      this.keeper += dep837.getKeeper();
      this.keeper += dep838.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep229 {
    private Integer keeper = 0;

    Dep229(Dep839 dep839, Dep840 dep840, Dep841 dep841, Dep842 dep842, Dep843 dep843) {
      this.keeper += dep839.getKeeper();
      this.keeper += dep840.getKeeper();
      this.keeper += dep841.getKeeper();
      this.keeper += dep842.getKeeper();
      this.keeper += dep843.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep230 {
    private Integer keeper = 0;

    Dep230(Dep844 dep844, Dep845 dep845, Dep846 dep846) {
      this.keeper += dep844.getKeeper();
      this.keeper += dep845.getKeeper();
      this.keeper += dep846.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep231 {
    private Integer keeper = 0;

    @Inject
    Dep231(Dep847 dep847, Dep848 dep848, Dep849 dep849) {
      this.keeper += dep847.getKeeper();
      this.keeper += dep848.getKeeper();
      this.keeper += dep849.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep232 {
    private Integer keeper = 0;

    @Inject
    Dep232(Dep850 dep850, Dep851 dep851, Dep852 dep852, Dep853 dep853, Dep854 dep854) {
      this.keeper += dep850.getKeeper();
      this.keeper += dep851.getKeeper();
      this.keeper += dep852.getKeeper();
      this.keeper += dep853.getKeeper();
      this.keeper += dep854.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep233 {
    private Integer keeper = 0;

    @Inject
    Dep233(Dep855 dep855) {
      this.keeper += dep855.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep234 {
    private Integer keeper = 0;

    Dep234(Dep856 dep856, Dep857 dep857, Dep858 dep858, Dep859 dep859) {
      this.keeper += dep856.getKeeper();
      this.keeper += dep857.getKeeper();
      this.keeper += dep858.getKeeper();
      this.keeper += dep859.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep235 {
    private Integer keeper = 0;

    Dep235(Dep860 dep860, Dep861 dep861, Dep862 dep862, Dep863 dep863) {
      this.keeper += dep860.getKeeper();
      this.keeper += dep861.getKeeper();
      this.keeper += dep862.getKeeper();
      this.keeper += dep863.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep236 {
    private Integer keeper = 0;

    Dep236(
        Dep864 dep864, Dep865 dep865, Dep866 dep866, Dep867 dep867, Dep868 dep868, Dep869 dep869) {
      this.keeper += dep864.getKeeper();
      this.keeper += dep865.getKeeper();
      this.keeper += dep866.getKeeper();
      this.keeper += dep867.getKeeper();
      this.keeper += dep868.getKeeper();
      this.keeper += dep869.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep237 {
    private Integer keeper = 0;

    @Inject
    Dep237(Dep870 dep870, Dep871 dep871, Dep872 dep872, Dep873 dep873) {
      this.keeper += dep870.getKeeper();
      this.keeper += dep871.getKeeper();
      this.keeper += dep872.getKeeper();
      this.keeper += dep873.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep238 {
    private Integer keeper = 0;

    Dep238(Dep874 dep874) {
      this.keeper += dep874.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep239 {
    private Integer keeper = 0;

    Dep239(
        Dep875 dep875, Dep876 dep876, Dep877 dep877, Dep878 dep878, Dep879 dep879, Dep880 dep880) {
      this.keeper += dep875.getKeeper();
      this.keeper += dep876.getKeeper();
      this.keeper += dep877.getKeeper();
      this.keeper += dep878.getKeeper();
      this.keeper += dep879.getKeeper();
      this.keeper += dep880.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep240 {
    private Integer keeper = 0;

    @Inject
    Dep240(Dep881 dep881) {
      this.keeper += dep881.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep241 {
    private Integer keeper = 0;

    @Inject
    Dep241(Dep882 dep882, Dep883 dep883, Dep884 dep884, Dep885 dep885, Dep886 dep886) {
      this.keeper += dep882.getKeeper();
      this.keeper += dep883.getKeeper();
      this.keeper += dep884.getKeeper();
      this.keeper += dep885.getKeeper();
      this.keeper += dep886.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep242 {
    private Integer keeper = 0;

    Dep242(Dep887 dep887, Dep888 dep888, Dep889 dep889) {
      this.keeper += dep887.getKeeper();
      this.keeper += dep888.getKeeper();
      this.keeper += dep889.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep243 {
    private Integer keeper = 0;

    @Inject
    Dep243(
        Dep890 dep890, Dep891 dep891, Dep892 dep892, Dep893 dep893, Dep894 dep894, Dep895 dep895) {
      this.keeper += dep890.getKeeper();
      this.keeper += dep891.getKeeper();
      this.keeper += dep892.getKeeper();
      this.keeper += dep893.getKeeper();
      this.keeper += dep894.getKeeper();
      this.keeper += dep895.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep244 {
    private Integer keeper = 0;

    @Inject
    Dep244(Dep896 dep896, Dep897 dep897, Dep898 dep898) {
      this.keeper += dep896.getKeeper();
      this.keeper += dep897.getKeeper();
      this.keeper += dep898.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep245 {
    private Integer keeper = 0;

    @Inject
    Dep245(Dep899 dep899, Dep900 dep900, Dep901 dep901, Dep902 dep902) {
      this.keeper += dep899.getKeeper();
      this.keeper += dep900.getKeeper();
      this.keeper += dep901.getKeeper();
      this.keeper += dep902.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep246 {
    private Integer keeper = 0;

    @Inject
    Dep246(Dep903 dep903, Dep904 dep904, Dep905 dep905, Dep906 dep906) {
      this.keeper += dep903.getKeeper();
      this.keeper += dep904.getKeeper();
      this.keeper += dep905.getKeeper();
      this.keeper += dep906.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep247 {
    private Integer keeper = 0;

    @Inject
    Dep247(Dep907 dep907, Dep908 dep908, Dep909 dep909, Dep910 dep910, Dep911 dep911) {
      this.keeper += dep907.getKeeper();
      this.keeper += dep908.getKeeper();
      this.keeper += dep909.getKeeper();
      this.keeper += dep910.getKeeper();
      this.keeper += dep911.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep248 {
    private Integer keeper = 0;

    @Inject
    Dep248(
        Dep912 dep912, Dep913 dep913, Dep914 dep914, Dep915 dep915, Dep916 dep916, Dep917 dep917) {
      this.keeper += dep912.getKeeper();
      this.keeper += dep913.getKeeper();
      this.keeper += dep914.getKeeper();
      this.keeper += dep915.getKeeper();
      this.keeper += dep916.getKeeper();
      this.keeper += dep917.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep249 {
    private Integer keeper = 0;

    Dep249(Dep918 dep918, Dep919 dep919, Dep920 dep920) {
      this.keeper += dep918.getKeeper();
      this.keeper += dep919.getKeeper();
      this.keeper += dep920.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep250 {
    private Integer keeper = 0;

    @Inject
    Dep250(
        Dep921 dep921, Dep922 dep922, Dep923 dep923, Dep924 dep924, Dep925 dep925, Dep926 dep926) {
      this.keeper += dep921.getKeeper();
      this.keeper += dep922.getKeeper();
      this.keeper += dep923.getKeeper();
      this.keeper += dep924.getKeeper();
      this.keeper += dep925.getKeeper();
      this.keeper += dep926.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep251 {
    private Integer keeper = 0;

    @Inject
    Dep251(Dep927 dep927, Dep928 dep928, Dep929 dep929, Dep930 dep930, Dep931 dep931) {
      this.keeper += dep927.getKeeper();
      this.keeper += dep928.getKeeper();
      this.keeper += dep929.getKeeper();
      this.keeper += dep930.getKeeper();
      this.keeper += dep931.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep252 {
    private Integer keeper = 0;

    @Inject
    Dep252(Dep932 dep932) {
      this.keeper += dep932.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep253 {
    private Integer keeper = 0;

    Dep253(Dep933 dep933, Dep934 dep934, Dep935 dep935) {
      this.keeper += dep933.getKeeper();
      this.keeper += dep934.getKeeper();
      this.keeper += dep935.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep254 {
    private Integer keeper = 0;

    @Inject
    Dep254(Dep936 dep936, Dep937 dep937, Dep938 dep938) {
      this.keeper += dep936.getKeeper();
      this.keeper += dep937.getKeeper();
      this.keeper += dep938.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep255 {
    private Integer keeper = 0;

    @Inject
    Dep255(
        Dep939 dep939, Dep940 dep940, Dep941 dep941, Dep942 dep942, Dep943 dep943, Dep944 dep944) {
      this.keeper += dep939.getKeeper();
      this.keeper += dep940.getKeeper();
      this.keeper += dep941.getKeeper();
      this.keeper += dep942.getKeeper();
      this.keeper += dep943.getKeeper();
      this.keeper += dep944.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep256 {
    private Integer keeper = 0;

    Dep256(Dep945 dep945, Dep946 dep946, Dep947 dep947) {
      this.keeper += dep945.getKeeper();
      this.keeper += dep946.getKeeper();
      this.keeper += dep947.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep257 {
    private Integer keeper = 0;

    Dep257(Dep948 dep948, Dep949 dep949, Dep950 dep950, Dep951 dep951, Dep952 dep952) {
      this.keeper += dep948.getKeeper();
      this.keeper += dep949.getKeeper();
      this.keeper += dep950.getKeeper();
      this.keeper += dep951.getKeeper();
      this.keeper += dep952.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep258 {
    private Integer keeper = 0;

    @Inject
    Dep258(Dep953 dep953, Dep954 dep954) {
      this.keeper += dep953.getKeeper();
      this.keeper += dep954.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep259 {
    private Integer keeper = 0;

    Dep259(Dep955 dep955, Dep956 dep956, Dep957 dep957, Dep958 dep958, Dep959 dep959) {
      this.keeper += dep955.getKeeper();
      this.keeper += dep956.getKeeper();
      this.keeper += dep957.getKeeper();
      this.keeper += dep958.getKeeper();
      this.keeper += dep959.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep260 {
    private Integer keeper = 0;

    Dep260(Dep960 dep960) {
      this.keeper += dep960.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep261 {
    private Integer keeper = 0;

    Dep261(Dep961 dep961, Dep962 dep962, Dep963 dep963, Dep964 dep964) {
      this.keeper += dep961.getKeeper();
      this.keeper += dep962.getKeeper();
      this.keeper += dep963.getKeeper();
      this.keeper += dep964.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep262 {
    private Integer keeper = 0;

    @Inject
    Dep262(Dep965 dep965) {
      this.keeper += dep965.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep263 {
    private Integer keeper = 0;

    @Inject
    Dep263(Dep966 dep966, Dep967 dep967, Dep968 dep968, Dep969 dep969, Dep970 dep970) {
      this.keeper += dep966.getKeeper();
      this.keeper += dep967.getKeeper();
      this.keeper += dep968.getKeeper();
      this.keeper += dep969.getKeeper();
      this.keeper += dep970.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep264 {
    private Integer keeper = 0;

    Dep264(Dep971 dep971, Dep972 dep972, Dep973 dep973, Dep974 dep974) {
      this.keeper += dep971.getKeeper();
      this.keeper += dep972.getKeeper();
      this.keeper += dep973.getKeeper();
      this.keeper += dep974.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep265 {
    private Integer keeper = 0;

    @Inject
    Dep265(Dep975 dep975, Dep976 dep976, Dep977 dep977, Dep978 dep978) {
      this.keeper += dep975.getKeeper();
      this.keeper += dep976.getKeeper();
      this.keeper += dep977.getKeeper();
      this.keeper += dep978.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep266 {
    private Integer keeper = 0;

    @Inject
    Dep266(Dep979 dep979, Dep980 dep980) {
      this.keeper += dep979.getKeeper();
      this.keeper += dep980.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep267 {
    private Integer keeper = 0;

    Dep267(Dep981 dep981, Dep982 dep982) {
      this.keeper += dep981.getKeeper();
      this.keeper += dep982.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep268 {
    private Integer keeper = 0;

    @Inject
    Dep268(Dep983 dep983) {
      this.keeper += dep983.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep269 {
    private Integer keeper = 0;

    Dep269(Dep984 dep984) {
      this.keeper += dep984.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep270 {
    private Integer keeper = 0;

    @Inject
    Dep270(Dep985 dep985) {
      this.keeper += dep985.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep271 {
    private Integer keeper = 0;

    @Inject
    Dep271(Dep986 dep986, Dep987 dep987) {
      this.keeper += dep986.getKeeper();
      this.keeper += dep987.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep272 {
    private Integer keeper = 0;

    @Inject
    Dep272(Dep988 dep988, Dep989 dep989, Dep990 dep990) {
      this.keeper += dep988.getKeeper();
      this.keeper += dep989.getKeeper();
      this.keeper += dep990.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep273 {
    private Integer keeper = 0;

    @Inject
    Dep273(
        Dep991 dep991, Dep992 dep992, Dep993 dep993, Dep994 dep994, Dep995 dep995, Dep996 dep996) {
      this.keeper += dep991.getKeeper();
      this.keeper += dep992.getKeeper();
      this.keeper += dep993.getKeeper();
      this.keeper += dep994.getKeeper();
      this.keeper += dep995.getKeeper();
      this.keeper += dep996.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep274 {
    private Integer keeper = 0;

    @Inject
    Dep274(Dep997 dep997, Dep998 dep998, Dep999 dep999) {
      this.keeper += dep997.getKeeper();
      this.keeper += dep998.getKeeper();
      this.keeper += dep999.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep275 {
    private Integer keeper = 0;

    @Inject
    Dep275(Dep1000 dep1000, Dep1001 dep1001) {
      this.keeper += dep1000.getKeeper();
      this.keeper += dep1001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep276 {
    private Integer keeper = 0;

    Dep276(
        Dep1002 dep1002,
        Dep1003 dep1003,
        Dep1004 dep1004,
        Dep1005 dep1005,
        Dep1006 dep1006,
        Dep1007 dep1007) {
      this.keeper += dep1002.getKeeper();
      this.keeper += dep1003.getKeeper();
      this.keeper += dep1004.getKeeper();
      this.keeper += dep1005.getKeeper();
      this.keeper += dep1006.getKeeper();
      this.keeper += dep1007.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep277 {
    private Integer keeper = 0;

    Dep277(Dep1008 dep1008, Dep1009 dep1009, Dep1010 dep1010, Dep1011 dep1011, Dep1012 dep1012) {
      this.keeper += dep1008.getKeeper();
      this.keeper += dep1009.getKeeper();
      this.keeper += dep1010.getKeeper();
      this.keeper += dep1011.getKeeper();
      this.keeper += dep1012.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep278 {
    private Integer keeper = 0;

    @Inject
    Dep278(
        Dep1013 dep1013,
        Dep1014 dep1014,
        Dep1015 dep1015,
        Dep1016 dep1016,
        Dep1017 dep1017,
        Dep1018 dep1018) {
      this.keeper += dep1013.getKeeper();
      this.keeper += dep1014.getKeeper();
      this.keeper += dep1015.getKeeper();
      this.keeper += dep1016.getKeeper();
      this.keeper += dep1017.getKeeper();
      this.keeper += dep1018.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep279 {
    private Integer keeper = 0;

    Dep279(Dep1019 dep1019, Dep1020 dep1020, Dep1021 dep1021, Dep1022 dep1022) {
      this.keeper += dep1019.getKeeper();
      this.keeper += dep1020.getKeeper();
      this.keeper += dep1021.getKeeper();
      this.keeper += dep1022.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep280 {
    private Integer keeper = 0;

    @Inject
    Dep280(Dep1023 dep1023, Dep1024 dep1024, Dep1025 dep1025, Dep1026 dep1026, Dep1027 dep1027) {
      this.keeper += dep1023.getKeeper();
      this.keeper += dep1024.getKeeper();
      this.keeper += dep1025.getKeeper();
      this.keeper += dep1026.getKeeper();
      this.keeper += dep1027.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep281 {
    private Integer keeper = 0;

    @Inject
    Dep281(Dep1028 dep1028, Dep1029 dep1029, Dep1030 dep1030, Dep1031 dep1031) {
      this.keeper += dep1028.getKeeper();
      this.keeper += dep1029.getKeeper();
      this.keeper += dep1030.getKeeper();
      this.keeper += dep1031.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep282 {
    private Integer keeper = 0;

    Dep282(Dep1032 dep1032) {
      this.keeper += dep1032.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep283 {
    private Integer keeper = 0;

    Dep283(Dep1033 dep1033, Dep1034 dep1034, Dep1035 dep1035, Dep1036 dep1036, Dep1037 dep1037) {
      this.keeper += dep1033.getKeeper();
      this.keeper += dep1034.getKeeper();
      this.keeper += dep1035.getKeeper();
      this.keeper += dep1036.getKeeper();
      this.keeper += dep1037.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep284 {
    private Integer keeper = 0;

    @Inject
    Dep284(Dep1038 dep1038, Dep1039 dep1039, Dep1040 dep1040, Dep1041 dep1041, Dep1042 dep1042) {
      this.keeper += dep1038.getKeeper();
      this.keeper += dep1039.getKeeper();
      this.keeper += dep1040.getKeeper();
      this.keeper += dep1041.getKeeper();
      this.keeper += dep1042.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep285 {
    private Integer keeper = 0;

    @Inject
    Dep285(Dep1043 dep1043, Dep1044 dep1044, Dep1045 dep1045, Dep1046 dep1046) {
      this.keeper += dep1043.getKeeper();
      this.keeper += dep1044.getKeeper();
      this.keeper += dep1045.getKeeper();
      this.keeper += dep1046.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep286 {
    private Integer keeper = 0;

    Dep286(Dep1047 dep1047, Dep1048 dep1048, Dep1049 dep1049, Dep1050 dep1050, Dep1051 dep1051) {
      this.keeper += dep1047.getKeeper();
      this.keeper += dep1048.getKeeper();
      this.keeper += dep1049.getKeeper();
      this.keeper += dep1050.getKeeper();
      this.keeper += dep1051.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep287 {
    private Integer keeper = 0;

    @Inject
    Dep287(
        Dep1052 dep1052,
        Dep1053 dep1053,
        Dep1054 dep1054,
        Dep1055 dep1055,
        Dep1056 dep1056,
        Dep1057 dep1057) {
      this.keeper += dep1052.getKeeper();
      this.keeper += dep1053.getKeeper();
      this.keeper += dep1054.getKeeper();
      this.keeper += dep1055.getKeeper();
      this.keeper += dep1056.getKeeper();
      this.keeper += dep1057.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep288 {
    private Integer keeper = 0;

    Dep288(Dep1058 dep1058, Dep1059 dep1059, Dep1060 dep1060, Dep1061 dep1061, Dep1062 dep1062) {
      this.keeper += dep1058.getKeeper();
      this.keeper += dep1059.getKeeper();
      this.keeper += dep1060.getKeeper();
      this.keeper += dep1061.getKeeper();
      this.keeper += dep1062.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep289 {
    private Integer keeper = 0;

    Dep289(Dep1063 dep1063, Dep1064 dep1064, Dep1065 dep1065) {
      this.keeper += dep1063.getKeeper();
      this.keeper += dep1064.getKeeper();
      this.keeper += dep1065.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep290 {
    private Integer keeper = 0;

    @Inject
    Dep290(Dep1066 dep1066) {
      this.keeper += dep1066.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep291 {
    private Integer keeper = 0;

    Dep291(Dep1067 dep1067, Dep1068 dep1068, Dep1069 dep1069, Dep1070 dep1070) {
      this.keeper += dep1067.getKeeper();
      this.keeper += dep1068.getKeeper();
      this.keeper += dep1069.getKeeper();
      this.keeper += dep1070.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep292 {
    private Integer keeper = 0;

    Dep292(
        Dep1071 dep1071,
        Dep1072 dep1072,
        Dep1073 dep1073,
        Dep1074 dep1074,
        Dep1075 dep1075,
        Dep1076 dep1076) {
      this.keeper += dep1071.getKeeper();
      this.keeper += dep1072.getKeeper();
      this.keeper += dep1073.getKeeper();
      this.keeper += dep1074.getKeeper();
      this.keeper += dep1075.getKeeper();
      this.keeper += dep1076.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep293 {
    private Integer keeper = 0;

    Dep293(Dep1077 dep1077) {
      this.keeper += dep1077.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep294 {
    private Integer keeper = 0;

    @Inject
    Dep294(Dep1078 dep1078) {
      this.keeper += dep1078.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep295 {
    private Integer keeper = 0;

    @Inject
    Dep295(Dep1079 dep1079, Dep1080 dep1080) {
      this.keeper += dep1079.getKeeper();
      this.keeper += dep1080.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep296 {
    private Integer keeper = 0;

    @Inject
    Dep296(Dep1081 dep1081, Dep1082 dep1082, Dep1083 dep1083) {
      this.keeper += dep1081.getKeeper();
      this.keeper += dep1082.getKeeper();
      this.keeper += dep1083.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep297 {
    private Integer keeper = 0;

    @Inject
    Dep297(Dep1084 dep1084, Dep1085 dep1085, Dep1086 dep1086, Dep1087 dep1087) {
      this.keeper += dep1084.getKeeper();
      this.keeper += dep1085.getKeeper();
      this.keeper += dep1086.getKeeper();
      this.keeper += dep1087.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep298 {
    private Integer keeper = 0;

    @Inject
    Dep298(Dep1088 dep1088, Dep1089 dep1089, Dep1090 dep1090, Dep1091 dep1091, Dep1092 dep1092) {
      this.keeper += dep1088.getKeeper();
      this.keeper += dep1089.getKeeper();
      this.keeper += dep1090.getKeeper();
      this.keeper += dep1091.getKeeper();
      this.keeper += dep1092.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep299 {
    private Integer keeper = 0;

    @Inject
    Dep299(Dep1093 dep1093, Dep1094 dep1094) {
      this.keeper += dep1093.getKeeper();
      this.keeper += dep1094.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep300 {
    private Integer keeper = 0;

    @Inject
    Dep300(Dep1095 dep1095, Dep1096 dep1096, Dep1097 dep1097, Dep1098 dep1098, Dep1099 dep1099) {
      this.keeper += dep1095.getKeeper();
      this.keeper += dep1096.getKeeper();
      this.keeper += dep1097.getKeeper();
      this.keeper += dep1098.getKeeper();
      this.keeper += dep1099.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep301 {
    private Integer keeper = 0;

    @Inject
    Dep301(Dep1100 dep1100, Dep1101 dep1101) {
      this.keeper += dep1100.getKeeper();
      this.keeper += dep1101.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep302 {
    private Integer keeper = 0;

    Dep302(Dep1102 dep1102) {
      this.keeper += dep1102.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep303 {
    private Integer keeper = 0;

    Dep303(Dep1103 dep1103, Dep1104 dep1104, Dep1105 dep1105) {
      this.keeper += dep1103.getKeeper();
      this.keeper += dep1104.getKeeper();
      this.keeper += dep1105.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep304 {
    private Integer keeper = 0;

    @Inject
    Dep304(
        Dep1106 dep1106,
        Dep1107 dep1107,
        Dep1108 dep1108,
        Dep1109 dep1109,
        Dep1110 dep1110,
        Dep1111 dep1111) {
      this.keeper += dep1106.getKeeper();
      this.keeper += dep1107.getKeeper();
      this.keeper += dep1108.getKeeper();
      this.keeper += dep1109.getKeeper();
      this.keeper += dep1110.getKeeper();
      this.keeper += dep1111.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep305 {
    private Integer keeper = 0;

    Dep305(
        Dep1112 dep1112,
        Dep1113 dep1113,
        Dep1114 dep1114,
        Dep1115 dep1115,
        Dep1116 dep1116,
        Dep1117 dep1117) {
      this.keeper += dep1112.getKeeper();
      this.keeper += dep1113.getKeeper();
      this.keeper += dep1114.getKeeper();
      this.keeper += dep1115.getKeeper();
      this.keeper += dep1116.getKeeper();
      this.keeper += dep1117.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep306 {
    private Integer keeper = 0;

    @Inject
    Dep306(Dep1118 dep1118, Dep1119 dep1119, Dep1120 dep1120, Dep1121 dep1121, Dep1122 dep1122) {
      this.keeper += dep1118.getKeeper();
      this.keeper += dep1119.getKeeper();
      this.keeper += dep1120.getKeeper();
      this.keeper += dep1121.getKeeper();
      this.keeper += dep1122.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep307 {
    private Integer keeper = 0;

    Dep307(Dep1123 dep1123) {
      this.keeper += dep1123.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep308 {
    private Integer keeper = 0;

    @Inject
    Dep308(Dep1124 dep1124, Dep1125 dep1125) {
      this.keeper += dep1124.getKeeper();
      this.keeper += dep1125.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep309 {
    private Integer keeper = 0;

    Dep309(Dep1126 dep1126, Dep1127 dep1127, Dep1128 dep1128, Dep1129 dep1129) {
      this.keeper += dep1126.getKeeper();
      this.keeper += dep1127.getKeeper();
      this.keeper += dep1128.getKeeper();
      this.keeper += dep1129.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep310 {
    private Integer keeper = 0;

    @Inject
    Dep310(Dep1130 dep1130) {
      this.keeper += dep1130.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep311 {
    private Integer keeper = 0;

    @Inject
    Dep311(Dep1131 dep1131) {
      this.keeper += dep1131.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep312 {
    private Integer keeper = 0;

    Dep312(Dep1132 dep1132, Dep1133 dep1133, Dep1134 dep1134, Dep1135 dep1135, Dep1136 dep1136) {
      this.keeper += dep1132.getKeeper();
      this.keeper += dep1133.getKeeper();
      this.keeper += dep1134.getKeeper();
      this.keeper += dep1135.getKeeper();
      this.keeper += dep1136.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep313 {
    private Integer keeper = 0;

    @Inject
    Dep313(
        Dep1137 dep1137,
        Dep1138 dep1138,
        Dep1139 dep1139,
        Dep1140 dep1140,
        Dep1141 dep1141,
        Dep1142 dep1142) {
      this.keeper += dep1137.getKeeper();
      this.keeper += dep1138.getKeeper();
      this.keeper += dep1139.getKeeper();
      this.keeper += dep1140.getKeeper();
      this.keeper += dep1141.getKeeper();
      this.keeper += dep1142.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep314 {
    private Integer keeper = 0;

    @Inject
    Dep314(Dep1143 dep1143) {
      this.keeper += dep1143.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep315 {
    private Integer keeper = 0;

    @Inject
    Dep315(
        Dep1144 dep1144,
        Dep1145 dep1145,
        Dep1146 dep1146,
        Dep1147 dep1147,
        Dep1148 dep1148,
        Dep1149 dep1149) {
      this.keeper += dep1144.getKeeper();
      this.keeper += dep1145.getKeeper();
      this.keeper += dep1146.getKeeper();
      this.keeper += dep1147.getKeeper();
      this.keeper += dep1148.getKeeper();
      this.keeper += dep1149.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep316 {
    private Integer keeper = 0;

    Dep316(Dep1150 dep1150) {
      this.keeper += dep1150.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep317 {
    private Integer keeper = 0;

    @Inject
    Dep317(
        Dep1151 dep1151,
        Dep1152 dep1152,
        Dep1153 dep1153,
        Dep1154 dep1154,
        Dep1155 dep1155,
        Dep1156 dep1156) {
      this.keeper += dep1151.getKeeper();
      this.keeper += dep1152.getKeeper();
      this.keeper += dep1153.getKeeper();
      this.keeper += dep1154.getKeeper();
      this.keeper += dep1155.getKeeper();
      this.keeper += dep1156.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep318 {
    private Integer keeper = 0;

    Dep318(Dep1157 dep1157, Dep1158 dep1158, Dep1159 dep1159, Dep1160 dep1160) {
      this.keeper += dep1157.getKeeper();
      this.keeper += dep1158.getKeeper();
      this.keeper += dep1159.getKeeper();
      this.keeper += dep1160.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep319 {
    private Integer keeper = 0;

    Dep319(Dep1161 dep1161) {
      this.keeper += dep1161.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep320 {
    private Integer keeper = 0;

    Dep320(
        Dep1162 dep1162,
        Dep1163 dep1163,
        Dep1164 dep1164,
        Dep1165 dep1165,
        Dep1166 dep1166,
        Dep1167 dep1167) {
      this.keeper += dep1162.getKeeper();
      this.keeper += dep1163.getKeeper();
      this.keeper += dep1164.getKeeper();
      this.keeper += dep1165.getKeeper();
      this.keeper += dep1166.getKeeper();
      this.keeper += dep1167.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep321 {
    private Integer keeper = 0;

    @Inject
    Dep321(Dep1168 dep1168, Dep1169 dep1169) {
      this.keeper += dep1168.getKeeper();
      this.keeper += dep1169.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep322 {
    private Integer keeper = 0;

    @Inject
    Dep322(Dep1170 dep1170, Dep1171 dep1171) {
      this.keeper += dep1170.getKeeper();
      this.keeper += dep1171.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep323 {
    private Integer keeper = 0;

    @Inject
    Dep323(Dep1172 dep1172, Dep1173 dep1173) {
      this.keeper += dep1172.getKeeper();
      this.keeper += dep1173.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep324 {
    private Integer keeper = 0;

    @Inject
    Dep324(Dep1174 dep1174, Dep1175 dep1175, Dep1176 dep1176, Dep1177 dep1177, Dep1178 dep1178) {
      this.keeper += dep1174.getKeeper();
      this.keeper += dep1175.getKeeper();
      this.keeper += dep1176.getKeeper();
      this.keeper += dep1177.getKeeper();
      this.keeper += dep1178.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep325 {
    private Integer keeper = 0;

    Dep325(Dep1179 dep1179, Dep1180 dep1180, Dep1181 dep1181) {
      this.keeper += dep1179.getKeeper();
      this.keeper += dep1180.getKeeper();
      this.keeper += dep1181.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep326 {
    private Integer keeper = 0;

    Dep326(Dep1182 dep1182, Dep1183 dep1183, Dep1184 dep1184) {
      this.keeper += dep1182.getKeeper();
      this.keeper += dep1183.getKeeper();
      this.keeper += dep1184.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep327 {
    private Integer keeper = 0;

    Dep327(Dep1185 dep1185, Dep1186 dep1186, Dep1187 dep1187, Dep1188 dep1188) {
      this.keeper += dep1185.getKeeper();
      this.keeper += dep1186.getKeeper();
      this.keeper += dep1187.getKeeper();
      this.keeper += dep1188.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep328 {
    private Integer keeper = 0;

    Dep328(Dep1189 dep1189, Dep1190 dep1190) {
      this.keeper += dep1189.getKeeper();
      this.keeper += dep1190.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep329 {
    private Integer keeper = 0;

    @Inject
    Dep329(Dep1191 dep1191) {
      this.keeper += dep1191.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep330 {
    private Integer keeper = 0;

    @Inject
    Dep330(Dep1192 dep1192, Dep1193 dep1193) {
      this.keeper += dep1192.getKeeper();
      this.keeper += dep1193.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep331 {
    private Integer keeper = 0;

    Dep331(Dep1194 dep1194, Dep1195 dep1195, Dep1196 dep1196, Dep1197 dep1197, Dep1198 dep1198) {
      this.keeper += dep1194.getKeeper();
      this.keeper += dep1195.getKeeper();
      this.keeper += dep1196.getKeeper();
      this.keeper += dep1197.getKeeper();
      this.keeper += dep1198.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep332 {
    private Integer keeper = 0;

    @Inject
    Dep332(Dep1199 dep1199) {
      this.keeper += dep1199.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep333 {
    private Integer keeper = 0;

    @Inject
    Dep333(Dep1200 dep1200, Dep1201 dep1201, Dep1202 dep1202, Dep1203 dep1203) {
      this.keeper += dep1200.getKeeper();
      this.keeper += dep1201.getKeeper();
      this.keeper += dep1202.getKeeper();
      this.keeper += dep1203.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep334 {
    private Integer keeper = 0;

    Dep334(Dep1204 dep1204, Dep1205 dep1205, Dep1206 dep1206) {
      this.keeper += dep1204.getKeeper();
      this.keeper += dep1205.getKeeper();
      this.keeper += dep1206.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep335 {
    private Integer keeper = 0;

    Dep335(Dep1207 dep1207, Dep1208 dep1208, Dep1209 dep1209, Dep1210 dep1210) {
      this.keeper += dep1207.getKeeper();
      this.keeper += dep1208.getKeeper();
      this.keeper += dep1209.getKeeper();
      this.keeper += dep1210.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep336 {
    private Integer keeper = 0;

    @Inject
    Dep336(Dep1211 dep1211, Dep1212 dep1212, Dep1213 dep1213, Dep1214 dep1214) {
      this.keeper += dep1211.getKeeper();
      this.keeper += dep1212.getKeeper();
      this.keeper += dep1213.getKeeper();
      this.keeper += dep1214.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep337 {
    private Integer keeper = 0;

    @Inject
    Dep337(Dep1215 dep1215, Dep1216 dep1216, Dep1217 dep1217, Dep1218 dep1218) {
      this.keeper += dep1215.getKeeper();
      this.keeper += dep1216.getKeeper();
      this.keeper += dep1217.getKeeper();
      this.keeper += dep1218.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep338 {
    private Integer keeper = 0;

    @Inject
    Dep338(Dep1219 dep1219, Dep1220 dep1220, Dep1221 dep1221, Dep1222 dep1222, Dep1223 dep1223) {
      this.keeper += dep1219.getKeeper();
      this.keeper += dep1220.getKeeper();
      this.keeper += dep1221.getKeeper();
      this.keeper += dep1222.getKeeper();
      this.keeper += dep1223.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep339 {
    private Integer keeper = 0;

    @Inject
    Dep339(Dep1224 dep1224) {
      this.keeper += dep1224.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep340 {
    private Integer keeper = 0;

    Dep340(Dep1225 dep1225) {
      this.keeper += dep1225.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep341 {
    private Integer keeper = 0;

    Dep341(Dep1226 dep1226, Dep1227 dep1227, Dep1228 dep1228, Dep1229 dep1229, Dep1230 dep1230) {
      this.keeper += dep1226.getKeeper();
      this.keeper += dep1227.getKeeper();
      this.keeper += dep1228.getKeeper();
      this.keeper += dep1229.getKeeper();
      this.keeper += dep1230.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep342 {
    private Integer keeper = 0;

    @Inject
    Dep342(Dep1231 dep1231, Dep1232 dep1232) {
      this.keeper += dep1231.getKeeper();
      this.keeper += dep1232.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep343 {
    private Integer keeper = 0;

    @Inject
    Dep343(Dep1233 dep1233, Dep1234 dep1234) {
      this.keeper += dep1233.getKeeper();
      this.keeper += dep1234.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep344 {
    private Integer keeper = 0;

    Dep344(Dep1235 dep1235, Dep1236 dep1236, Dep1237 dep1237) {
      this.keeper += dep1235.getKeeper();
      this.keeper += dep1236.getKeeper();
      this.keeper += dep1237.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep345 {
    private Integer keeper = 0;

    @Inject
    Dep345(
        Dep1238 dep1238,
        Dep1239 dep1239,
        Dep1240 dep1240,
        Dep1241 dep1241,
        Dep1242 dep1242,
        Dep1243 dep1243) {
      this.keeper += dep1238.getKeeper();
      this.keeper += dep1239.getKeeper();
      this.keeper += dep1240.getKeeper();
      this.keeper += dep1241.getKeeper();
      this.keeper += dep1242.getKeeper();
      this.keeper += dep1243.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep346 {
    private Integer keeper = 0;

    @Inject
    Dep346(Dep1244 dep1244, Dep1245 dep1245, Dep1246 dep1246, Dep1247 dep1247) {
      this.keeper += dep1244.getKeeper();
      this.keeper += dep1245.getKeeper();
      this.keeper += dep1246.getKeeper();
      this.keeper += dep1247.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep347 {
    private Integer keeper = 0;

    Dep347(Dep1248 dep1248) {
      this.keeper += dep1248.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep348 {
    private Integer keeper = 0;

    @Inject
    Dep348(Dep1249 dep1249) {
      this.keeper += dep1249.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep349 {
    private Integer keeper = 0;

    Dep349(Dep1250 dep1250) {
      this.keeper += dep1250.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep350 {
    private Integer keeper = 0;

    @Inject
    Dep350(
        Dep1251 dep1251,
        Dep1252 dep1252,
        Dep1253 dep1253,
        Dep1254 dep1254,
        Dep1255 dep1255,
        Dep1256 dep1256) {
      this.keeper += dep1251.getKeeper();
      this.keeper += dep1252.getKeeper();
      this.keeper += dep1253.getKeeper();
      this.keeper += dep1254.getKeeper();
      this.keeper += dep1255.getKeeper();
      this.keeper += dep1256.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep351 {
    private Integer keeper = 0;

    Dep351(Dep1257 dep1257, Dep1258 dep1258, Dep1259 dep1259) {
      this.keeper += dep1257.getKeeper();
      this.keeper += dep1258.getKeeper();
      this.keeper += dep1259.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep352 {
    private Integer keeper = 0;

    Dep352(Dep1260 dep1260, Dep1261 dep1261, Dep1262 dep1262, Dep1263 dep1263, Dep1264 dep1264) {
      this.keeper += dep1260.getKeeper();
      this.keeper += dep1261.getKeeper();
      this.keeper += dep1262.getKeeper();
      this.keeper += dep1263.getKeeper();
      this.keeper += dep1264.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep353 {
    private Integer keeper = 0;

    @Inject
    Dep353(Dep1265 dep1265) {
      this.keeper += dep1265.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep354 {
    private Integer keeper = 0;

    @Inject
    Dep354(Dep1266 dep1266, Dep1267 dep1267, Dep1268 dep1268, Dep1269 dep1269) {
      this.keeper += dep1266.getKeeper();
      this.keeper += dep1267.getKeeper();
      this.keeper += dep1268.getKeeper();
      this.keeper += dep1269.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep355 {
    private Integer keeper = 0;

    Dep355(Dep1270 dep1270, Dep1271 dep1271, Dep1272 dep1272, Dep1273 dep1273) {
      this.keeper += dep1270.getKeeper();
      this.keeper += dep1271.getKeeper();
      this.keeper += dep1272.getKeeper();
      this.keeper += dep1273.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep356 {
    private Integer keeper = 0;

    @Inject
    Dep356(Dep1274 dep1274) {
      this.keeper += dep1274.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep357 {
    private Integer keeper = 0;

    @Inject
    Dep357(Dep1275 dep1275, Dep1276 dep1276) {
      this.keeper += dep1275.getKeeper();
      this.keeper += dep1276.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep358 {
    private Integer keeper = 0;

    @Inject
    Dep358(Dep1277 dep1277, Dep1278 dep1278, Dep1279 dep1279, Dep1280 dep1280, Dep1281 dep1281) {
      this.keeper += dep1277.getKeeper();
      this.keeper += dep1278.getKeeper();
      this.keeper += dep1279.getKeeper();
      this.keeper += dep1280.getKeeper();
      this.keeper += dep1281.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep359 {
    private Integer keeper = 0;

    Dep359(Dep1282 dep1282, Dep1283 dep1283, Dep1284 dep1284) {
      this.keeper += dep1282.getKeeper();
      this.keeper += dep1283.getKeeper();
      this.keeper += dep1284.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep360 {
    private Integer keeper = 0;

    @Inject
    Dep360(Dep1285 dep1285, Dep1286 dep1286) {
      this.keeper += dep1285.getKeeper();
      this.keeper += dep1286.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep361 {
    private Integer keeper = 0;

    Dep361(Dep1287 dep1287, Dep1288 dep1288, Dep1289 dep1289, Dep1290 dep1290) {
      this.keeper += dep1287.getKeeper();
      this.keeper += dep1288.getKeeper();
      this.keeper += dep1289.getKeeper();
      this.keeper += dep1290.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep362 {
    private Integer keeper = 0;

    @Inject
    Dep362(Dep1291 dep1291) {
      this.keeper += dep1291.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep363 {
    private Integer keeper = 0;

    Dep363(Dep1292 dep1292, Dep1293 dep1293, Dep1294 dep1294, Dep1295 dep1295, Dep1296 dep1296) {
      this.keeper += dep1292.getKeeper();
      this.keeper += dep1293.getKeeper();
      this.keeper += dep1294.getKeeper();
      this.keeper += dep1295.getKeeper();
      this.keeper += dep1296.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep364 {
    private Integer keeper = 0;

    Dep364(Dep1297 dep1297, Dep1298 dep1298, Dep1299 dep1299, Dep1300 dep1300) {
      this.keeper += dep1297.getKeeper();
      this.keeper += dep1298.getKeeper();
      this.keeper += dep1299.getKeeper();
      this.keeper += dep1300.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep365 {
    private Integer keeper = 0;

    Dep365(Dep1301 dep1301, Dep1302 dep1302, Dep1303 dep1303, Dep1304 dep1304, Dep1305 dep1305) {
      this.keeper += dep1301.getKeeper();
      this.keeper += dep1302.getKeeper();
      this.keeper += dep1303.getKeeper();
      this.keeper += dep1304.getKeeper();
      this.keeper += dep1305.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep366 {
    private Integer keeper = 0;

    Dep366(Dep1306 dep1306, Dep1307 dep1307, Dep1308 dep1308, Dep1309 dep1309, Dep1310 dep1310) {
      this.keeper += dep1306.getKeeper();
      this.keeper += dep1307.getKeeper();
      this.keeper += dep1308.getKeeper();
      this.keeper += dep1309.getKeeper();
      this.keeper += dep1310.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep367 {
    private Integer keeper = 0;

    @Inject
    Dep367(Dep1311 dep1311) {
      this.keeper += dep1311.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep368 {
    private Integer keeper = 0;

    @Inject
    Dep368(Dep1312 dep1312, Dep1313 dep1313, Dep1314 dep1314, Dep1315 dep1315) {
      this.keeper += dep1312.getKeeper();
      this.keeper += dep1313.getKeeper();
      this.keeper += dep1314.getKeeper();
      this.keeper += dep1315.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep369 {
    private Integer keeper = 0;

    @Inject
    Dep369(Dep1316 dep1316, Dep1317 dep1317, Dep1318 dep1318, Dep1319 dep1319, Dep1320 dep1320) {
      this.keeper += dep1316.getKeeper();
      this.keeper += dep1317.getKeeper();
      this.keeper += dep1318.getKeeper();
      this.keeper += dep1319.getKeeper();
      this.keeper += dep1320.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep370 {
    private Integer keeper = 0;

    @Inject
    Dep370(
        Dep1321 dep1321,
        Dep1322 dep1322,
        Dep1323 dep1323,
        Dep1324 dep1324,
        Dep1325 dep1325,
        Dep1326 dep1326) {
      this.keeper += dep1321.getKeeper();
      this.keeper += dep1322.getKeeper();
      this.keeper += dep1323.getKeeper();
      this.keeper += dep1324.getKeeper();
      this.keeper += dep1325.getKeeper();
      this.keeper += dep1326.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep371 {
    private Integer keeper = 0;

    Dep371(Dep1327 dep1327) {
      this.keeper += dep1327.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep372 {
    private Integer keeper = 0;

    Dep372(Dep1328 dep1328, Dep1329 dep1329) {
      this.keeper += dep1328.getKeeper();
      this.keeper += dep1329.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep373 {
    private Integer keeper = 0;

    Dep373(Dep1330 dep1330) {
      this.keeper += dep1330.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep374 {
    private Integer keeper = 0;

    Dep374(Dep1331 dep1331) {
      this.keeper += dep1331.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep375 {
    private Integer keeper = 0;

    Dep375(Dep1332 dep1332, Dep1333 dep1333, Dep1334 dep1334, Dep1335 dep1335, Dep1336 dep1336) {
      this.keeper += dep1332.getKeeper();
      this.keeper += dep1333.getKeeper();
      this.keeper += dep1334.getKeeper();
      this.keeper += dep1335.getKeeper();
      this.keeper += dep1336.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep376 {
    private Integer keeper = 0;

    Dep376(Dep1337 dep1337, Dep1338 dep1338, Dep1339 dep1339, Dep1340 dep1340) {
      this.keeper += dep1337.getKeeper();
      this.keeper += dep1338.getKeeper();
      this.keeper += dep1339.getKeeper();
      this.keeper += dep1340.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep377 {
    private Integer keeper = 0;

    @Inject
    Dep377(Dep1341 dep1341, Dep1342 dep1342, Dep1343 dep1343) {
      this.keeper += dep1341.getKeeper();
      this.keeper += dep1342.getKeeper();
      this.keeper += dep1343.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep378 {
    private Integer keeper = 0;

    @Inject
    Dep378(Dep1344 dep1344, Dep1345 dep1345, Dep1346 dep1346, Dep1347 dep1347, Dep1348 dep1348) {
      this.keeper += dep1344.getKeeper();
      this.keeper += dep1345.getKeeper();
      this.keeper += dep1346.getKeeper();
      this.keeper += dep1347.getKeeper();
      this.keeper += dep1348.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep379 {
    private Integer keeper = 0;

    @Inject
    Dep379(Dep1349 dep1349, Dep1350 dep1350, Dep1351 dep1351) {
      this.keeper += dep1349.getKeeper();
      this.keeper += dep1350.getKeeper();
      this.keeper += dep1351.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep380 {
    private Integer keeper = 0;

    Dep380(Dep1352 dep1352, Dep1353 dep1353, Dep1354 dep1354) {
      this.keeper += dep1352.getKeeper();
      this.keeper += dep1353.getKeeper();
      this.keeper += dep1354.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep381 {
    private Integer keeper = 0;

    Dep381(Dep1355 dep1355) {
      this.keeper += dep1355.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep382 {
    private Integer keeper = 0;

    @Inject
    Dep382(Dep1356 dep1356, Dep1357 dep1357, Dep1358 dep1358, Dep1359 dep1359) {
      this.keeper += dep1356.getKeeper();
      this.keeper += dep1357.getKeeper();
      this.keeper += dep1358.getKeeper();
      this.keeper += dep1359.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep383 {
    private Integer keeper = 0;

    Dep383(Dep1360 dep1360) {
      this.keeper += dep1360.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep384 {
    private Integer keeper = 0;

    @Inject
    Dep384(Dep1361 dep1361, Dep1362 dep1362, Dep1363 dep1363, Dep1364 dep1364, Dep1365 dep1365) {
      this.keeper += dep1361.getKeeper();
      this.keeper += dep1362.getKeeper();
      this.keeper += dep1363.getKeeper();
      this.keeper += dep1364.getKeeper();
      this.keeper += dep1365.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep385 {
    private Integer keeper = 0;

    @Inject
    Dep385(Dep1366 dep1366, Dep1367 dep1367, Dep1368 dep1368, Dep1369 dep1369) {
      this.keeper += dep1366.getKeeper();
      this.keeper += dep1367.getKeeper();
      this.keeper += dep1368.getKeeper();
      this.keeper += dep1369.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep386 {
    private Integer keeper = 0;

    Dep386(
        Dep1370 dep1370,
        Dep1371 dep1371,
        Dep1372 dep1372,
        Dep1373 dep1373,
        Dep1374 dep1374,
        Dep1375 dep1375) {
      this.keeper += dep1370.getKeeper();
      this.keeper += dep1371.getKeeper();
      this.keeper += dep1372.getKeeper();
      this.keeper += dep1373.getKeeper();
      this.keeper += dep1374.getKeeper();
      this.keeper += dep1375.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep387 {
    private Integer keeper = 0;

    Dep387(Dep1376 dep1376, Dep1377 dep1377, Dep1378 dep1378, Dep1379 dep1379) {
      this.keeper += dep1376.getKeeper();
      this.keeper += dep1377.getKeeper();
      this.keeper += dep1378.getKeeper();
      this.keeper += dep1379.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep388 {
    private Integer keeper = 0;

    @Inject
    Dep388(Dep1380 dep1380, Dep1381 dep1381, Dep1382 dep1382, Dep1383 dep1383, Dep1384 dep1384) {
      this.keeper += dep1380.getKeeper();
      this.keeper += dep1381.getKeeper();
      this.keeper += dep1382.getKeeper();
      this.keeper += dep1383.getKeeper();
      this.keeper += dep1384.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep389 {
    private Integer keeper = 0;

    @Inject
    Dep389(Dep1385 dep1385) {
      this.keeper += dep1385.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep390 {
    private Integer keeper = 0;

    Dep390(Dep1386 dep1386, Dep1387 dep1387, Dep1388 dep1388, Dep1389 dep1389, Dep1390 dep1390) {
      this.keeper += dep1386.getKeeper();
      this.keeper += dep1387.getKeeper();
      this.keeper += dep1388.getKeeper();
      this.keeper += dep1389.getKeeper();
      this.keeper += dep1390.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep391 {
    private Integer keeper = 0;

    Dep391(Dep1391 dep1391, Dep1392 dep1392, Dep1393 dep1393, Dep1394 dep1394) {
      this.keeper += dep1391.getKeeper();
      this.keeper += dep1392.getKeeper();
      this.keeper += dep1393.getKeeper();
      this.keeper += dep1394.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep392 {
    private Integer keeper = 0;

    Dep392(Dep1395 dep1395, Dep1396 dep1396) {
      this.keeper += dep1395.getKeeper();
      this.keeper += dep1396.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep393 {
    private Integer keeper = 0;

    @Inject
    Dep393(Dep1397 dep1397) {
      this.keeper += dep1397.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep394 {
    private Integer keeper = 0;

    @Inject
    Dep394(Dep1398 dep1398, Dep1399 dep1399, Dep1400 dep1400, Dep1401 dep1401, Dep1402 dep1402) {
      this.keeper += dep1398.getKeeper();
      this.keeper += dep1399.getKeeper();
      this.keeper += dep1400.getKeeper();
      this.keeper += dep1401.getKeeper();
      this.keeper += dep1402.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep395 {
    private Integer keeper = 0;

    Dep395(
        Dep1403 dep1403,
        Dep1404 dep1404,
        Dep1405 dep1405,
        Dep1406 dep1406,
        Dep1407 dep1407,
        Dep1408 dep1408) {
      this.keeper += dep1403.getKeeper();
      this.keeper += dep1404.getKeeper();
      this.keeper += dep1405.getKeeper();
      this.keeper += dep1406.getKeeper();
      this.keeper += dep1407.getKeeper();
      this.keeper += dep1408.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep396 {
    private Integer keeper = 0;

    @Inject
    Dep396(
        Dep1409 dep1409,
        Dep1410 dep1410,
        Dep1411 dep1411,
        Dep1412 dep1412,
        Dep1413 dep1413,
        Dep1414 dep1414) {
      this.keeper += dep1409.getKeeper();
      this.keeper += dep1410.getKeeper();
      this.keeper += dep1411.getKeeper();
      this.keeper += dep1412.getKeeper();
      this.keeper += dep1413.getKeeper();
      this.keeper += dep1414.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep397 {
    private Integer keeper = 0;

    Dep397(Dep1415 dep1415) {
      this.keeper += dep1415.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep398 {
    private Integer keeper = 0;

    @Inject
    Dep398(Dep1416 dep1416, Dep1417 dep1417, Dep1418 dep1418, Dep1419 dep1419) {
      this.keeper += dep1416.getKeeper();
      this.keeper += dep1417.getKeeper();
      this.keeper += dep1418.getKeeper();
      this.keeper += dep1419.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep399 {
    private Integer keeper = 0;

    Dep399(Dep1420 dep1420, Dep1421 dep1421, Dep1422 dep1422, Dep1423 dep1423, Dep1424 dep1424) {
      this.keeper += dep1420.getKeeper();
      this.keeper += dep1421.getKeeper();
      this.keeper += dep1422.getKeeper();
      this.keeper += dep1423.getKeeper();
      this.keeper += dep1424.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep400 {
    private Integer keeper = 0;

    @Inject
    Dep400(Dep1425 dep1425, Dep1426 dep1426, Dep1427 dep1427) {
      this.keeper += dep1425.getKeeper();
      this.keeper += dep1426.getKeeper();
      this.keeper += dep1427.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep401 {
    private Integer keeper = 0;

    Dep401(Dep1428 dep1428, Dep1429 dep1429) {
      this.keeper += dep1428.getKeeper();
      this.keeper += dep1429.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep402 {
    private Integer keeper = 0;

    Dep402(Dep1430 dep1430) {
      this.keeper += dep1430.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep403 {
    private Integer keeper = 0;

    Dep403(Dep1431 dep1431, Dep1432 dep1432) {
      this.keeper += dep1431.getKeeper();
      this.keeper += dep1432.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep404 {
    private Integer keeper = 0;

    Dep404(Dep1433 dep1433, Dep1434 dep1434) {
      this.keeper += dep1433.getKeeper();
      this.keeper += dep1434.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep405 {
    private Integer keeper = 0;

    @Inject
    Dep405(Dep1435 dep1435, Dep1436 dep1436) {
      this.keeper += dep1435.getKeeper();
      this.keeper += dep1436.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep406 {
    private Integer keeper = 0;

    Dep406(Dep1437 dep1437, Dep1438 dep1438, Dep1439 dep1439, Dep1440 dep1440) {
      this.keeper += dep1437.getKeeper();
      this.keeper += dep1438.getKeeper();
      this.keeper += dep1439.getKeeper();
      this.keeper += dep1440.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep407 {
    private Integer keeper = 0;

    @Inject
    Dep407(
        Dep1441 dep1441,
        Dep1442 dep1442,
        Dep1443 dep1443,
        Dep1444 dep1444,
        Dep1445 dep1445,
        Dep1446 dep1446) {
      this.keeper += dep1441.getKeeper();
      this.keeper += dep1442.getKeeper();
      this.keeper += dep1443.getKeeper();
      this.keeper += dep1444.getKeeper();
      this.keeper += dep1445.getKeeper();
      this.keeper += dep1446.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep408 {
    private Integer keeper = 0;

    Dep408(
        Dep1447 dep1447,
        Dep1448 dep1448,
        Dep1449 dep1449,
        Dep1450 dep1450,
        Dep1451 dep1451,
        Dep1452 dep1452) {
      this.keeper += dep1447.getKeeper();
      this.keeper += dep1448.getKeeper();
      this.keeper += dep1449.getKeeper();
      this.keeper += dep1450.getKeeper();
      this.keeper += dep1451.getKeeper();
      this.keeper += dep1452.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep409 {
    private Integer keeper = 0;

    Dep409(Dep1453 dep1453, Dep1454 dep1454, Dep1455 dep1455, Dep1456 dep1456) {
      this.keeper += dep1453.getKeeper();
      this.keeper += dep1454.getKeeper();
      this.keeper += dep1455.getKeeper();
      this.keeper += dep1456.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep410 {
    private Integer keeper = 0;

    @Inject
    Dep410(Dep1457 dep1457) {
      this.keeper += dep1457.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep411 {
    private Integer keeper = 0;

    @Inject
    Dep411(Dep1458 dep1458) {
      this.keeper += dep1458.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep412 {
    private Integer keeper = 0;

    Dep412(Dep1459 dep1459, Dep1460 dep1460) {
      this.keeper += dep1459.getKeeper();
      this.keeper += dep1460.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep413 {
    private Integer keeper = 0;

    Dep413(Dep1461 dep1461, Dep1462 dep1462) {
      this.keeper += dep1461.getKeeper();
      this.keeper += dep1462.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep414 {
    private Integer keeper = 0;

    @Inject
    Dep414(Dep1463 dep1463, Dep1464 dep1464, Dep1465 dep1465, Dep1466 dep1466, Dep1467 dep1467) {
      this.keeper += dep1463.getKeeper();
      this.keeper += dep1464.getKeeper();
      this.keeper += dep1465.getKeeper();
      this.keeper += dep1466.getKeeper();
      this.keeper += dep1467.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep415 {
    private Integer keeper = 0;

    Dep415(Dep1468 dep1468) {
      this.keeper += dep1468.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep416 {
    private Integer keeper = 0;

    @Inject
    Dep416(Dep1469 dep1469, Dep1470 dep1470, Dep1471 dep1471, Dep1472 dep1472) {
      this.keeper += dep1469.getKeeper();
      this.keeper += dep1470.getKeeper();
      this.keeper += dep1471.getKeeper();
      this.keeper += dep1472.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep417 {
    private Integer keeper = 0;

    @Inject
    Dep417(Dep1473 dep1473, Dep1474 dep1474) {
      this.keeper += dep1473.getKeeper();
      this.keeper += dep1474.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep418 {
    private Integer keeper = 0;

    @Inject
    Dep418(Dep1475 dep1475, Dep1476 dep1476, Dep1477 dep1477, Dep1478 dep1478) {
      this.keeper += dep1475.getKeeper();
      this.keeper += dep1476.getKeeper();
      this.keeper += dep1477.getKeeper();
      this.keeper += dep1478.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep419 {
    private Integer keeper = 0;

    Dep419(
        Dep1479 dep1479,
        Dep1480 dep1480,
        Dep1481 dep1481,
        Dep1482 dep1482,
        Dep1483 dep1483,
        Dep1484 dep1484) {
      this.keeper += dep1479.getKeeper();
      this.keeper += dep1480.getKeeper();
      this.keeper += dep1481.getKeeper();
      this.keeper += dep1482.getKeeper();
      this.keeper += dep1483.getKeeper();
      this.keeper += dep1484.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep420 {
    private Integer keeper = 0;

    Dep420(
        Dep1485 dep1485,
        Dep1486 dep1486,
        Dep1487 dep1487,
        Dep1488 dep1488,
        Dep1489 dep1489,
        Dep1490 dep1490) {
      this.keeper += dep1485.getKeeper();
      this.keeper += dep1486.getKeeper();
      this.keeper += dep1487.getKeeper();
      this.keeper += dep1488.getKeeper();
      this.keeper += dep1489.getKeeper();
      this.keeper += dep1490.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep421 {
    private Integer keeper = 0;

    @Inject
    Dep421(
        Dep1491 dep1491,
        Dep1492 dep1492,
        Dep1493 dep1493,
        Dep1494 dep1494,
        Dep1495 dep1495,
        Dep1496 dep1496) {
      this.keeper += dep1491.getKeeper();
      this.keeper += dep1492.getKeeper();
      this.keeper += dep1493.getKeeper();
      this.keeper += dep1494.getKeeper();
      this.keeper += dep1495.getKeeper();
      this.keeper += dep1496.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep422 {
    private Integer keeper = 0;

    Dep422(Dep1497 dep1497, Dep1498 dep1498, Dep1499 dep1499, Dep1500 dep1500) {
      this.keeper += dep1497.getKeeper();
      this.keeper += dep1498.getKeeper();
      this.keeper += dep1499.getKeeper();
      this.keeper += dep1500.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep423 {
    private Integer keeper = 0;

    @Inject
    Dep423(Dep1501 dep1501, Dep1502 dep1502, Dep1503 dep1503, Dep1504 dep1504) {
      this.keeper += dep1501.getKeeper();
      this.keeper += dep1502.getKeeper();
      this.keeper += dep1503.getKeeper();
      this.keeper += dep1504.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep424 {
    private Integer keeper = 0;

    Dep424(Dep1505 dep1505, Dep1506 dep1506, Dep1507 dep1507, Dep1508 dep1508) {
      this.keeper += dep1505.getKeeper();
      this.keeper += dep1506.getKeeper();
      this.keeper += dep1507.getKeeper();
      this.keeper += dep1508.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep425 {
    private Integer keeper = 0;

    @Inject
    Dep425(Dep1509 dep1509, Dep1510 dep1510, Dep1511 dep1511, Dep1512 dep1512, Dep1513 dep1513) {
      this.keeper += dep1509.getKeeper();
      this.keeper += dep1510.getKeeper();
      this.keeper += dep1511.getKeeper();
      this.keeper += dep1512.getKeeper();
      this.keeper += dep1513.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep426 {
    private Integer keeper = 0;

    @Inject
    Dep426(
        Dep1514 dep1514,
        Dep1515 dep1515,
        Dep1516 dep1516,
        Dep1517 dep1517,
        Dep1518 dep1518,
        Dep1519 dep1519) {
      this.keeper += dep1514.getKeeper();
      this.keeper += dep1515.getKeeper();
      this.keeper += dep1516.getKeeper();
      this.keeper += dep1517.getKeeper();
      this.keeper += dep1518.getKeeper();
      this.keeper += dep1519.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep427 {
    private Integer keeper = 0;

    Dep427(Dep1520 dep1520) {
      this.keeper += dep1520.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep428 {
    private Integer keeper = 0;

    Dep428(Dep1521 dep1521, Dep1522 dep1522, Dep1523 dep1523) {
      this.keeper += dep1521.getKeeper();
      this.keeper += dep1522.getKeeper();
      this.keeper += dep1523.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep429 {
    private Integer keeper = 0;

    Dep429(Dep1524 dep1524, Dep1525 dep1525, Dep1526 dep1526, Dep1527 dep1527) {
      this.keeper += dep1524.getKeeper();
      this.keeper += dep1525.getKeeper();
      this.keeper += dep1526.getKeeper();
      this.keeper += dep1527.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep430 {
    private Integer keeper = 0;

    @Inject
    Dep430(Dep1528 dep1528, Dep1529 dep1529, Dep1530 dep1530, Dep1531 dep1531) {
      this.keeper += dep1528.getKeeper();
      this.keeper += dep1529.getKeeper();
      this.keeper += dep1530.getKeeper();
      this.keeper += dep1531.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep431 {
    private Integer keeper = 0;

    Dep431(Dep1532 dep1532, Dep1533 dep1533, Dep1534 dep1534, Dep1535 dep1535, Dep1536 dep1536) {
      this.keeper += dep1532.getKeeper();
      this.keeper += dep1533.getKeeper();
      this.keeper += dep1534.getKeeper();
      this.keeper += dep1535.getKeeper();
      this.keeper += dep1536.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep432 {
    private Integer keeper = 0;

    Dep432(Dep1537 dep1537, Dep1538 dep1538, Dep1539 dep1539) {
      this.keeper += dep1537.getKeeper();
      this.keeper += dep1538.getKeeper();
      this.keeper += dep1539.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep433 {
    private Integer keeper = 0;

    @Inject
    Dep433(Dep1540 dep1540, Dep1541 dep1541) {
      this.keeper += dep1540.getKeeper();
      this.keeper += dep1541.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep434 {
    private Integer keeper = 0;

    @Inject
    Dep434(Dep1542 dep1542, Dep1543 dep1543, Dep1544 dep1544, Dep1545 dep1545) {
      this.keeper += dep1542.getKeeper();
      this.keeper += dep1543.getKeeper();
      this.keeper += dep1544.getKeeper();
      this.keeper += dep1545.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep435 {
    private Integer keeper = 0;

    Dep435(
        Dep1546 dep1546,
        Dep1547 dep1547,
        Dep1548 dep1548,
        Dep1549 dep1549,
        Dep1550 dep1550,
        Dep1551 dep1551) {
      this.keeper += dep1546.getKeeper();
      this.keeper += dep1547.getKeeper();
      this.keeper += dep1548.getKeeper();
      this.keeper += dep1549.getKeeper();
      this.keeper += dep1550.getKeeper();
      this.keeper += dep1551.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep436 {
    private Integer keeper = 0;

    @Inject
    Dep436(Dep1552 dep1552, Dep1553 dep1553) {
      this.keeper += dep1552.getKeeper();
      this.keeper += dep1553.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep437 {
    private Integer keeper = 0;

    @Inject
    Dep437(Dep1554 dep1554) {
      this.keeper += dep1554.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep438 {
    private Integer keeper = 0;

    Dep438(Dep1555 dep1555, Dep1556 dep1556, Dep1557 dep1557) {
      this.keeper += dep1555.getKeeper();
      this.keeper += dep1556.getKeeper();
      this.keeper += dep1557.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep439 {
    private Integer keeper = 0;

    @Inject
    Dep439(Dep1558 dep1558, Dep1559 dep1559, Dep1560 dep1560, Dep1561 dep1561) {
      this.keeper += dep1558.getKeeper();
      this.keeper += dep1559.getKeeper();
      this.keeper += dep1560.getKeeper();
      this.keeper += dep1561.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep440 {
    private Integer keeper = 0;

    @Inject
    Dep440(Dep1562 dep1562) {
      this.keeper += dep1562.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep441 {
    private Integer keeper = 0;

    @Inject
    Dep441(Dep1563 dep1563, Dep1564 dep1564, Dep1565 dep1565, Dep1566 dep1566, Dep1567 dep1567) {
      this.keeper += dep1563.getKeeper();
      this.keeper += dep1564.getKeeper();
      this.keeper += dep1565.getKeeper();
      this.keeper += dep1566.getKeeper();
      this.keeper += dep1567.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep442 {
    private Integer keeper = 0;

    @Inject
    Dep442(
        Dep1568 dep1568,
        Dep1569 dep1569,
        Dep1570 dep1570,
        Dep1571 dep1571,
        Dep1572 dep1572,
        Dep1573 dep1573) {
      this.keeper += dep1568.getKeeper();
      this.keeper += dep1569.getKeeper();
      this.keeper += dep1570.getKeeper();
      this.keeper += dep1571.getKeeper();
      this.keeper += dep1572.getKeeper();
      this.keeper += dep1573.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep443 {
    private Integer keeper = 0;

    @Inject
    Dep443(
        Dep1574 dep1574,
        Dep1575 dep1575,
        Dep1576 dep1576,
        Dep1577 dep1577,
        Dep1578 dep1578,
        Dep1579 dep1579) {
      this.keeper += dep1574.getKeeper();
      this.keeper += dep1575.getKeeper();
      this.keeper += dep1576.getKeeper();
      this.keeper += dep1577.getKeeper();
      this.keeper += dep1578.getKeeper();
      this.keeper += dep1579.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep444 {
    private Integer keeper = 0;

    @Inject
    Dep444(Dep1580 dep1580, Dep1581 dep1581, Dep1582 dep1582, Dep1583 dep1583, Dep1584 dep1584) {
      this.keeper += dep1580.getKeeper();
      this.keeper += dep1581.getKeeper();
      this.keeper += dep1582.getKeeper();
      this.keeper += dep1583.getKeeper();
      this.keeper += dep1584.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep445 {
    private Integer keeper = 0;

    @Inject
    Dep445(Dep1585 dep1585, Dep1586 dep1586) {
      this.keeper += dep1585.getKeeper();
      this.keeper += dep1586.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep446 {
    private Integer keeper = 0;

    Dep446(Dep1587 dep1587, Dep1588 dep1588, Dep1589 dep1589, Dep1590 dep1590, Dep1591 dep1591) {
      this.keeper += dep1587.getKeeper();
      this.keeper += dep1588.getKeeper();
      this.keeper += dep1589.getKeeper();
      this.keeper += dep1590.getKeeper();
      this.keeper += dep1591.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep447 {
    private Integer keeper = 0;

    @Inject
    Dep447(Dep1592 dep1592) {
      this.keeper += dep1592.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep448 {
    private Integer keeper = 0;

    Dep448(Dep1593 dep1593, Dep1594 dep1594) {
      this.keeper += dep1593.getKeeper();
      this.keeper += dep1594.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep449 {
    private Integer keeper = 0;

    Dep449(
        Dep1595 dep1595,
        Dep1596 dep1596,
        Dep1597 dep1597,
        Dep1598 dep1598,
        Dep1599 dep1599,
        Dep1600 dep1600) {
      this.keeper += dep1595.getKeeper();
      this.keeper += dep1596.getKeeper();
      this.keeper += dep1597.getKeeper();
      this.keeper += dep1598.getKeeper();
      this.keeper += dep1599.getKeeper();
      this.keeper += dep1600.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep450 {
    private Integer keeper = 0;

    Dep450(Dep1601 dep1601) {
      this.keeper += dep1601.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep451 {
    private Integer keeper = 0;

    Dep451(Dep1602 dep1602, Dep1603 dep1603, Dep1604 dep1604, Dep1605 dep1605, Dep1606 dep1606) {
      this.keeper += dep1602.getKeeper();
      this.keeper += dep1603.getKeeper();
      this.keeper += dep1604.getKeeper();
      this.keeper += dep1605.getKeeper();
      this.keeper += dep1606.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep452 {
    private Integer keeper = 0;

    @Inject
    Dep452(
        Dep1607 dep1607,
        Dep1608 dep1608,
        Dep1609 dep1609,
        Dep1610 dep1610,
        Dep1611 dep1611,
        Dep1612 dep1612) {
      this.keeper += dep1607.getKeeper();
      this.keeper += dep1608.getKeeper();
      this.keeper += dep1609.getKeeper();
      this.keeper += dep1610.getKeeper();
      this.keeper += dep1611.getKeeper();
      this.keeper += dep1612.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep453 {
    private Integer keeper = 0;

    @Inject
    Dep453(Dep1613 dep1613) {
      this.keeper += dep1613.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep454 {
    private Integer keeper = 0;

    @Inject
    Dep454(Dep1614 dep1614, Dep1615 dep1615) {
      this.keeper += dep1614.getKeeper();
      this.keeper += dep1615.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep455 {
    private Integer keeper = 0;

    Dep455(Dep1616 dep1616, Dep1617 dep1617, Dep1618 dep1618, Dep1619 dep1619, Dep1620 dep1620) {
      this.keeper += dep1616.getKeeper();
      this.keeper += dep1617.getKeeper();
      this.keeper += dep1618.getKeeper();
      this.keeper += dep1619.getKeeper();
      this.keeper += dep1620.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep456 {
    private Integer keeper = 0;

    @Inject
    Dep456(Dep1621 dep1621, Dep1622 dep1622, Dep1623 dep1623, Dep1624 dep1624, Dep1625 dep1625) {
      this.keeper += dep1621.getKeeper();
      this.keeper += dep1622.getKeeper();
      this.keeper += dep1623.getKeeper();
      this.keeper += dep1624.getKeeper();
      this.keeper += dep1625.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep457 {
    private Integer keeper = 0;

    Dep457(Dep1626 dep1626, Dep1627 dep1627) {
      this.keeper += dep1626.getKeeper();
      this.keeper += dep1627.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep458 {
    private Integer keeper = 0;

    @Inject
    Dep458(Dep1628 dep1628, Dep1629 dep1629, Dep1630 dep1630, Dep1631 dep1631) {
      this.keeper += dep1628.getKeeper();
      this.keeper += dep1629.getKeeper();
      this.keeper += dep1630.getKeeper();
      this.keeper += dep1631.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep459 {
    private Integer keeper = 0;

    @Inject
    Dep459(Dep1632 dep1632, Dep1633 dep1633, Dep1634 dep1634) {
      this.keeper += dep1632.getKeeper();
      this.keeper += dep1633.getKeeper();
      this.keeper += dep1634.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep460 {
    private Integer keeper = 0;

    Dep460(Dep1635 dep1635, Dep1636 dep1636, Dep1637 dep1637, Dep1638 dep1638, Dep1639 dep1639) {
      this.keeper += dep1635.getKeeper();
      this.keeper += dep1636.getKeeper();
      this.keeper += dep1637.getKeeper();
      this.keeper += dep1638.getKeeper();
      this.keeper += dep1639.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep461 {
    private Integer keeper = 0;

    @Inject
    Dep461(
        Dep1640 dep1640,
        Dep1641 dep1641,
        Dep1642 dep1642,
        Dep1643 dep1643,
        Dep1644 dep1644,
        Dep1645 dep1645) {
      this.keeper += dep1640.getKeeper();
      this.keeper += dep1641.getKeeper();
      this.keeper += dep1642.getKeeper();
      this.keeper += dep1643.getKeeper();
      this.keeper += dep1644.getKeeper();
      this.keeper += dep1645.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep462 {
    private Integer keeper = 0;

    Dep462(Dep1646 dep1646, Dep1647 dep1647, Dep1648 dep1648) {
      this.keeper += dep1646.getKeeper();
      this.keeper += dep1647.getKeeper();
      this.keeper += dep1648.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep463 {
    private Integer keeper = 0;

    @Inject
    Dep463(Dep1649 dep1649) {
      this.keeper += dep1649.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep464 {
    private Integer keeper = 0;

    @Inject
    Dep464(Dep1650 dep1650, Dep1651 dep1651, Dep1652 dep1652, Dep1653 dep1653, Dep1654 dep1654) {
      this.keeper += dep1650.getKeeper();
      this.keeper += dep1651.getKeeper();
      this.keeper += dep1652.getKeeper();
      this.keeper += dep1653.getKeeper();
      this.keeper += dep1654.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep465 {
    private Integer keeper = 0;

    Dep465(Dep1655 dep1655, Dep1656 dep1656, Dep1657 dep1657, Dep1658 dep1658) {
      this.keeper += dep1655.getKeeper();
      this.keeper += dep1656.getKeeper();
      this.keeper += dep1657.getKeeper();
      this.keeper += dep1658.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep466 {
    private Integer keeper = 0;

    @Inject
    Dep466(
        Dep1659 dep1659,
        Dep1660 dep1660,
        Dep1661 dep1661,
        Dep1662 dep1662,
        Dep1663 dep1663,
        Dep1664 dep1664) {
      this.keeper += dep1659.getKeeper();
      this.keeper += dep1660.getKeeper();
      this.keeper += dep1661.getKeeper();
      this.keeper += dep1662.getKeeper();
      this.keeper += dep1663.getKeeper();
      this.keeper += dep1664.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep467 {
    private Integer keeper = 0;

    @Inject
    Dep467(Dep1665 dep1665, Dep1666 dep1666, Dep1667 dep1667) {
      this.keeper += dep1665.getKeeper();
      this.keeper += dep1666.getKeeper();
      this.keeper += dep1667.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep468 {
    private Integer keeper = 0;

    Dep468(Dep1668 dep1668, Dep1669 dep1669) {
      this.keeper += dep1668.getKeeper();
      this.keeper += dep1669.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep469 {
    private Integer keeper = 0;

    Dep469(Dep1670 dep1670, Dep1671 dep1671, Dep1672 dep1672, Dep1673 dep1673, Dep1674 dep1674) {
      this.keeper += dep1670.getKeeper();
      this.keeper += dep1671.getKeeper();
      this.keeper += dep1672.getKeeper();
      this.keeper += dep1673.getKeeper();
      this.keeper += dep1674.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep470 {
    private Integer keeper = 0;

    Dep470(
        Dep1675 dep1675,
        Dep1676 dep1676,
        Dep1677 dep1677,
        Dep1678 dep1678,
        Dep1679 dep1679,
        Dep1680 dep1680) {
      this.keeper += dep1675.getKeeper();
      this.keeper += dep1676.getKeeper();
      this.keeper += dep1677.getKeeper();
      this.keeper += dep1678.getKeeper();
      this.keeper += dep1679.getKeeper();
      this.keeper += dep1680.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep471 {
    private Integer keeper = 0;

    @Inject
    Dep471(Dep1681 dep1681) {
      this.keeper += dep1681.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep472 {
    private Integer keeper = 0;

    @Inject
    Dep472(Dep1682 dep1682) {
      this.keeper += dep1682.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep473 {
    private Integer keeper = 0;

    Dep473(Dep1683 dep1683, Dep1684 dep1684, Dep1685 dep1685, Dep1686 dep1686) {
      this.keeper += dep1683.getKeeper();
      this.keeper += dep1684.getKeeper();
      this.keeper += dep1685.getKeeper();
      this.keeper += dep1686.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep474 {
    private Integer keeper = 0;

    Dep474(Dep1687 dep1687, Dep1688 dep1688, Dep1689 dep1689, Dep1690 dep1690) {
      this.keeper += dep1687.getKeeper();
      this.keeper += dep1688.getKeeper();
      this.keeper += dep1689.getKeeper();
      this.keeper += dep1690.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep475 {
    private Integer keeper = 0;

    @Inject
    Dep475(Dep1691 dep1691, Dep1692 dep1692, Dep1693 dep1693) {
      this.keeper += dep1691.getKeeper();
      this.keeper += dep1692.getKeeper();
      this.keeper += dep1693.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep476 {
    private Integer keeper = 0;

    Dep476(Dep1694 dep1694, Dep1695 dep1695, Dep1696 dep1696, Dep1697 dep1697) {
      this.keeper += dep1694.getKeeper();
      this.keeper += dep1695.getKeeper();
      this.keeper += dep1696.getKeeper();
      this.keeper += dep1697.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep477 {
    private Integer keeper = 0;

    @Inject
    Dep477(Dep1698 dep1698) {
      this.keeper += dep1698.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep478 {
    private Integer keeper = 0;

    Dep478(Dep1699 dep1699, Dep1700 dep1700) {
      this.keeper += dep1699.getKeeper();
      this.keeper += dep1700.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep479 {
    private Integer keeper = 0;

    @Inject
    Dep479(Dep1701 dep1701, Dep1702 dep1702, Dep1703 dep1703, Dep1704 dep1704) {
      this.keeper += dep1701.getKeeper();
      this.keeper += dep1702.getKeeper();
      this.keeper += dep1703.getKeeper();
      this.keeper += dep1704.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep480 {
    private Integer keeper = 0;

    Dep480(Dep1705 dep1705, Dep1706 dep1706, Dep1707 dep1707, Dep1708 dep1708) {
      this.keeper += dep1705.getKeeper();
      this.keeper += dep1706.getKeeper();
      this.keeper += dep1707.getKeeper();
      this.keeper += dep1708.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep481 {
    private Integer keeper = 0;

    Dep481(Dep1709 dep1709, Dep1710 dep1710, Dep1711 dep1711) {
      this.keeper += dep1709.getKeeper();
      this.keeper += dep1710.getKeeper();
      this.keeper += dep1711.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep482 {
    private Integer keeper = 0;

    @Inject
    Dep482(Dep1712 dep1712) {
      this.keeper += dep1712.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep483 {
    private Integer keeper = 0;

    Dep483(Dep1713 dep1713, Dep1714 dep1714) {
      this.keeper += dep1713.getKeeper();
      this.keeper += dep1714.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep484 {
    private Integer keeper = 0;

    Dep484(Dep1715 dep1715) {
      this.keeper += dep1715.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep485 {
    private Integer keeper = 0;

    Dep485(Dep1716 dep1716) {
      this.keeper += dep1716.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep486 {
    private Integer keeper = 0;

    @Inject
    Dep486(Dep1717 dep1717, Dep1718 dep1718, Dep1719 dep1719, Dep1720 dep1720) {
      this.keeper += dep1717.getKeeper();
      this.keeper += dep1718.getKeeper();
      this.keeper += dep1719.getKeeper();
      this.keeper += dep1720.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep487 {
    private Integer keeper = 0;

    Dep487(Dep1721 dep1721, Dep1722 dep1722, Dep1723 dep1723) {
      this.keeper += dep1721.getKeeper();
      this.keeper += dep1722.getKeeper();
      this.keeper += dep1723.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep488 {
    private Integer keeper = 0;

    @Inject
    Dep488(Dep1724 dep1724, Dep1725 dep1725, Dep1726 dep1726, Dep1727 dep1727) {
      this.keeper += dep1724.getKeeper();
      this.keeper += dep1725.getKeeper();
      this.keeper += dep1726.getKeeper();
      this.keeper += dep1727.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep489 {
    private Integer keeper = 0;

    @Inject
    Dep489(Dep1728 dep1728, Dep1729 dep1729, Dep1730 dep1730) {
      this.keeper += dep1728.getKeeper();
      this.keeper += dep1729.getKeeper();
      this.keeper += dep1730.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep490 {
    private Integer keeper = 0;

    @Inject
    Dep490(Dep1731 dep1731, Dep1732 dep1732, Dep1733 dep1733, Dep1734 dep1734, Dep1735 dep1735) {
      this.keeper += dep1731.getKeeper();
      this.keeper += dep1732.getKeeper();
      this.keeper += dep1733.getKeeper();
      this.keeper += dep1734.getKeeper();
      this.keeper += dep1735.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep491 {
    private Integer keeper = 0;

    @Inject
    Dep491(Dep1736 dep1736, Dep1737 dep1737, Dep1738 dep1738, Dep1739 dep1739) {
      this.keeper += dep1736.getKeeper();
      this.keeper += dep1737.getKeeper();
      this.keeper += dep1738.getKeeper();
      this.keeper += dep1739.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep492 {
    private Integer keeper = 0;

    Dep492(Dep1740 dep1740, Dep1741 dep1741, Dep1742 dep1742, Dep1743 dep1743) {
      this.keeper += dep1740.getKeeper();
      this.keeper += dep1741.getKeeper();
      this.keeper += dep1742.getKeeper();
      this.keeper += dep1743.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep493 {
    private Integer keeper = 0;

    @Inject
    Dep493(Dep1744 dep1744, Dep1745 dep1745, Dep1746 dep1746) {
      this.keeper += dep1744.getKeeper();
      this.keeper += dep1745.getKeeper();
      this.keeper += dep1746.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep494 {
    private Integer keeper = 0;

    Dep494(Dep1747 dep1747, Dep1748 dep1748, Dep1749 dep1749, Dep1750 dep1750) {
      this.keeper += dep1747.getKeeper();
      this.keeper += dep1748.getKeeper();
      this.keeper += dep1749.getKeeper();
      this.keeper += dep1750.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep495 {
    private Integer keeper = 0;

    @Inject
    Dep495(Dep1751 dep1751, Dep1752 dep1752, Dep1753 dep1753, Dep1754 dep1754, Dep1755 dep1755) {
      this.keeper += dep1751.getKeeper();
      this.keeper += dep1752.getKeeper();
      this.keeper += dep1753.getKeeper();
      this.keeper += dep1754.getKeeper();
      this.keeper += dep1755.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep496 {
    private Integer keeper = 0;

    Dep496(Dep1756 dep1756, Dep1757 dep1757, Dep1758 dep1758, Dep1759 dep1759) {
      this.keeper += dep1756.getKeeper();
      this.keeper += dep1757.getKeeper();
      this.keeper += dep1758.getKeeper();
      this.keeper += dep1759.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep497 {
    private Integer keeper = 0;

    @Inject
    Dep497(Dep1760 dep1760) {
      this.keeper += dep1760.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep498 {
    private Integer keeper = 0;

    @Inject
    Dep498(Dep1761 dep1761, Dep1762 dep1762, Dep1763 dep1763) {
      this.keeper += dep1761.getKeeper();
      this.keeper += dep1762.getKeeper();
      this.keeper += dep1763.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep499 {
    private Integer keeper = 0;

    @Inject
    Dep499(Dep1764 dep1764, Dep1765 dep1765, Dep1766 dep1766, Dep1767 dep1767, Dep1768 dep1768) {
      this.keeper += dep1764.getKeeper();
      this.keeper += dep1765.getKeeper();
      this.keeper += dep1766.getKeeper();
      this.keeper += dep1767.getKeeper();
      this.keeper += dep1768.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep500 {
    private Integer keeper = 0;

    Dep500(
        Dep1769 dep1769,
        Dep1770 dep1770,
        Dep1771 dep1771,
        Dep1772 dep1772,
        Dep1773 dep1773,
        Dep1774 dep1774) {
      this.keeper += dep1769.getKeeper();
      this.keeper += dep1770.getKeeper();
      this.keeper += dep1771.getKeeper();
      this.keeper += dep1772.getKeeper();
      this.keeper += dep1773.getKeeper();
      this.keeper += dep1774.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep501 {
    private Integer keeper = 0;

    @Inject
    Dep501(Dep1775 dep1775, Dep1776 dep1776) {
      this.keeper += dep1775.getKeeper();
      this.keeper += dep1776.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep502 {
    private Integer keeper = 0;

    @Inject
    Dep502(
        Dep1777 dep1777,
        Dep1778 dep1778,
        Dep1779 dep1779,
        Dep1780 dep1780,
        Dep1781 dep1781,
        Dep1782 dep1782) {
      this.keeper += dep1777.getKeeper();
      this.keeper += dep1778.getKeeper();
      this.keeper += dep1779.getKeeper();
      this.keeper += dep1780.getKeeper();
      this.keeper += dep1781.getKeeper();
      this.keeper += dep1782.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep503 {
    private Integer keeper = 0;

    Dep503(
        Dep1783 dep1783,
        Dep1784 dep1784,
        Dep1785 dep1785,
        Dep1786 dep1786,
        Dep1787 dep1787,
        Dep1788 dep1788) {
      this.keeper += dep1783.getKeeper();
      this.keeper += dep1784.getKeeper();
      this.keeper += dep1785.getKeeper();
      this.keeper += dep1786.getKeeper();
      this.keeper += dep1787.getKeeper();
      this.keeper += dep1788.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep504 {
    private Integer keeper = 0;

    @Inject
    Dep504(Dep1789 dep1789, Dep1790 dep1790, Dep1791 dep1791, Dep1792 dep1792, Dep1793 dep1793) {
      this.keeper += dep1789.getKeeper();
      this.keeper += dep1790.getKeeper();
      this.keeper += dep1791.getKeeper();
      this.keeper += dep1792.getKeeper();
      this.keeper += dep1793.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep505 {
    private Integer keeper = 0;

    Dep505(Dep1794 dep1794, Dep1795 dep1795) {
      this.keeper += dep1794.getKeeper();
      this.keeper += dep1795.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep506 {
    private Integer keeper = 0;

    Dep506(Dep1796 dep1796, Dep1797 dep1797) {
      this.keeper += dep1796.getKeeper();
      this.keeper += dep1797.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep507 {
    private Integer keeper = 0;

    Dep507(Dep1798 dep1798, Dep1799 dep1799) {
      this.keeper += dep1798.getKeeper();
      this.keeper += dep1799.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep508 {
    private Integer keeper = 0;

    @Inject
    Dep508(Dep1800 dep1800) {
      this.keeper += dep1800.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep509 {
    private Integer keeper = 0;

    Dep509(Dep1801 dep1801) {
      this.keeper += dep1801.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep510 {
    private Integer keeper = 0;

    Dep510(Dep1802 dep1802, Dep1803 dep1803, Dep1804 dep1804, Dep1805 dep1805, Dep1806 dep1806) {
      this.keeper += dep1802.getKeeper();
      this.keeper += dep1803.getKeeper();
      this.keeper += dep1804.getKeeper();
      this.keeper += dep1805.getKeeper();
      this.keeper += dep1806.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep511 {
    private Integer keeper = 0;

    Dep511(Dep1807 dep1807, Dep1808 dep1808, Dep1809 dep1809) {
      this.keeper += dep1807.getKeeper();
      this.keeper += dep1808.getKeeper();
      this.keeper += dep1809.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep512 {
    private Integer keeper = 0;

    Dep512(Dep1810 dep1810, Dep1811 dep1811, Dep1812 dep1812, Dep1813 dep1813, Dep1814 dep1814) {
      this.keeper += dep1810.getKeeper();
      this.keeper += dep1811.getKeeper();
      this.keeper += dep1812.getKeeper();
      this.keeper += dep1813.getKeeper();
      this.keeper += dep1814.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep513 {
    private Integer keeper = 0;

    Dep513(
        Dep1815 dep1815,
        Dep1816 dep1816,
        Dep1817 dep1817,
        Dep1818 dep1818,
        Dep1819 dep1819,
        Dep1820 dep1820) {
      this.keeper += dep1815.getKeeper();
      this.keeper += dep1816.getKeeper();
      this.keeper += dep1817.getKeeper();
      this.keeper += dep1818.getKeeper();
      this.keeper += dep1819.getKeeper();
      this.keeper += dep1820.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep514 {
    private Integer keeper = 0;

    Dep514(
        Dep1821 dep1821,
        Dep1822 dep1822,
        Dep1823 dep1823,
        Dep1824 dep1824,
        Dep1825 dep1825,
        Dep1826 dep1826) {
      this.keeper += dep1821.getKeeper();
      this.keeper += dep1822.getKeeper();
      this.keeper += dep1823.getKeeper();
      this.keeper += dep1824.getKeeper();
      this.keeper += dep1825.getKeeper();
      this.keeper += dep1826.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep515 {
    private Integer keeper = 0;

    Dep515(Dep1827 dep1827) {
      this.keeper += dep1827.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep516 {
    private Integer keeper = 0;

    @Inject
    Dep516(Dep1828 dep1828, Dep1829 dep1829, Dep1830 dep1830) {
      this.keeper += dep1828.getKeeper();
      this.keeper += dep1829.getKeeper();
      this.keeper += dep1830.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep517 {
    private Integer keeper = 0;

    @Inject
    Dep517(
        Dep1831 dep1831,
        Dep1832 dep1832,
        Dep1833 dep1833,
        Dep1834 dep1834,
        Dep1835 dep1835,
        Dep1836 dep1836) {
      this.keeper += dep1831.getKeeper();
      this.keeper += dep1832.getKeeper();
      this.keeper += dep1833.getKeeper();
      this.keeper += dep1834.getKeeper();
      this.keeper += dep1835.getKeeper();
      this.keeper += dep1836.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep518 {
    private Integer keeper = 0;

    Dep518(Dep1837 dep1837, Dep1838 dep1838, Dep1839 dep1839) {
      this.keeper += dep1837.getKeeper();
      this.keeper += dep1838.getKeeper();
      this.keeper += dep1839.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep519 {
    private Integer keeper = 0;

    @Inject
    Dep519(Dep1840 dep1840, Dep1841 dep1841, Dep1842 dep1842) {
      this.keeper += dep1840.getKeeper();
      this.keeper += dep1841.getKeeper();
      this.keeper += dep1842.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep520 {
    private Integer keeper = 0;

    @Inject
    Dep520(Dep1843 dep1843, Dep1844 dep1844) {
      this.keeper += dep1843.getKeeper();
      this.keeper += dep1844.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep521 {
    private Integer keeper = 0;

    @Inject
    Dep521(Dep1845 dep1845, Dep1846 dep1846, Dep1847 dep1847, Dep1848 dep1848, Dep1849 dep1849) {
      this.keeper += dep1845.getKeeper();
      this.keeper += dep1846.getKeeper();
      this.keeper += dep1847.getKeeper();
      this.keeper += dep1848.getKeeper();
      this.keeper += dep1849.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep522 {
    private Integer keeper = 0;

    @Inject
    Dep522(Dep1850 dep1850, Dep1851 dep1851, Dep1852 dep1852, Dep1853 dep1853) {
      this.keeper += dep1850.getKeeper();
      this.keeper += dep1851.getKeeper();
      this.keeper += dep1852.getKeeper();
      this.keeper += dep1853.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep523 {
    private Integer keeper = 0;

    Dep523(Dep1854 dep1854, Dep1855 dep1855, Dep1856 dep1856, Dep1857 dep1857) {
      this.keeper += dep1854.getKeeper();
      this.keeper += dep1855.getKeeper();
      this.keeper += dep1856.getKeeper();
      this.keeper += dep1857.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep524 {
    private Integer keeper = 0;

    @Inject
    Dep524(Dep1858 dep1858, Dep1859 dep1859, Dep1860 dep1860, Dep1861 dep1861) {
      this.keeper += dep1858.getKeeper();
      this.keeper += dep1859.getKeeper();
      this.keeper += dep1860.getKeeper();
      this.keeper += dep1861.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep525 {
    private Integer keeper = 0;

    Dep525(Dep1862 dep1862, Dep1863 dep1863, Dep1864 dep1864) {
      this.keeper += dep1862.getKeeper();
      this.keeper += dep1863.getKeeper();
      this.keeper += dep1864.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep526 {
    private Integer keeper = 0;

    Dep526(Dep1865 dep1865, Dep1866 dep1866) {
      this.keeper += dep1865.getKeeper();
      this.keeper += dep1866.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep527 {
    private Integer keeper = 0;

    @Inject
    Dep527(Dep1867 dep1867, Dep1868 dep1868) {
      this.keeper += dep1867.getKeeper();
      this.keeper += dep1868.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep528 {
    private Integer keeper = 0;

    @Inject
    Dep528(Dep1869 dep1869, Dep1870 dep1870, Dep1871 dep1871, Dep1872 dep1872) {
      this.keeper += dep1869.getKeeper();
      this.keeper += dep1870.getKeeper();
      this.keeper += dep1871.getKeeper();
      this.keeper += dep1872.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep529 {
    private Integer keeper = 0;

    @Inject
    Dep529(Dep1873 dep1873, Dep1874 dep1874, Dep1875 dep1875, Dep1876 dep1876) {
      this.keeper += dep1873.getKeeper();
      this.keeper += dep1874.getKeeper();
      this.keeper += dep1875.getKeeper();
      this.keeper += dep1876.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep530 {
    private Integer keeper = 0;

    @Inject
    Dep530(Dep1877 dep1877, Dep1878 dep1878) {
      this.keeper += dep1877.getKeeper();
      this.keeper += dep1878.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep531 {
    private Integer keeper = 0;

    Dep531(Dep1879 dep1879) {
      this.keeper += dep1879.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep532 {
    private Integer keeper = 0;

    Dep532(Dep1880 dep1880, Dep1881 dep1881) {
      this.keeper += dep1880.getKeeper();
      this.keeper += dep1881.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep533 {
    private Integer keeper = 0;

    Dep533(Dep1882 dep1882, Dep1883 dep1883, Dep1884 dep1884, Dep1885 dep1885, Dep1886 dep1886) {
      this.keeper += dep1882.getKeeper();
      this.keeper += dep1883.getKeeper();
      this.keeper += dep1884.getKeeper();
      this.keeper += dep1885.getKeeper();
      this.keeper += dep1886.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep534 {
    private Integer keeper = 0;

    Dep534(Dep1887 dep1887, Dep1888 dep1888, Dep1889 dep1889, Dep1890 dep1890, Dep1891 dep1891) {
      this.keeper += dep1887.getKeeper();
      this.keeper += dep1888.getKeeper();
      this.keeper += dep1889.getKeeper();
      this.keeper += dep1890.getKeeper();
      this.keeper += dep1891.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep535 {
    private Integer keeper = 0;

    Dep535(Dep1892 dep1892, Dep1893 dep1893, Dep1894 dep1894, Dep1895 dep1895) {
      this.keeper += dep1892.getKeeper();
      this.keeper += dep1893.getKeeper();
      this.keeper += dep1894.getKeeper();
      this.keeper += dep1895.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep536 {
    private Integer keeper = 0;

    @Inject
    Dep536(Dep1896 dep1896, Dep1897 dep1897, Dep1898 dep1898, Dep1899 dep1899, Dep1900 dep1900) {
      this.keeper += dep1896.getKeeper();
      this.keeper += dep1897.getKeeper();
      this.keeper += dep1898.getKeeper();
      this.keeper += dep1899.getKeeper();
      this.keeper += dep1900.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep537 {
    private Integer keeper = 0;

    Dep537(Dep1901 dep1901, Dep1902 dep1902, Dep1903 dep1903, Dep1904 dep1904) {
      this.keeper += dep1901.getKeeper();
      this.keeper += dep1902.getKeeper();
      this.keeper += dep1903.getKeeper();
      this.keeper += dep1904.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep538 {
    private Integer keeper = 0;

    @Inject
    Dep538(
        Dep1905 dep1905,
        Dep1906 dep1906,
        Dep1907 dep1907,
        Dep1908 dep1908,
        Dep1909 dep1909,
        Dep1910 dep1910) {
      this.keeper += dep1905.getKeeper();
      this.keeper += dep1906.getKeeper();
      this.keeper += dep1907.getKeeper();
      this.keeper += dep1908.getKeeper();
      this.keeper += dep1909.getKeeper();
      this.keeper += dep1910.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep539 {
    private Integer keeper = 0;

    Dep539(
        Dep1911 dep1911,
        Dep1912 dep1912,
        Dep1913 dep1913,
        Dep1914 dep1914,
        Dep1915 dep1915,
        Dep1916 dep1916) {
      this.keeper += dep1911.getKeeper();
      this.keeper += dep1912.getKeeper();
      this.keeper += dep1913.getKeeper();
      this.keeper += dep1914.getKeeper();
      this.keeper += dep1915.getKeeper();
      this.keeper += dep1916.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep540 {
    private Integer keeper = 0;

    @Inject
    Dep540(Dep1917 dep1917, Dep1918 dep1918, Dep1919 dep1919, Dep1920 dep1920) {
      this.keeper += dep1917.getKeeper();
      this.keeper += dep1918.getKeeper();
      this.keeper += dep1919.getKeeper();
      this.keeper += dep1920.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep541 {
    private Integer keeper = 0;

    @Inject
    Dep541(Dep1921 dep1921, Dep1922 dep1922) {
      this.keeper += dep1921.getKeeper();
      this.keeper += dep1922.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep542 {
    private Integer keeper = 0;

    @Inject
    Dep542(Dep1923 dep1923, Dep1924 dep1924, Dep1925 dep1925, Dep1926 dep1926) {
      this.keeper += dep1923.getKeeper();
      this.keeper += dep1924.getKeeper();
      this.keeper += dep1925.getKeeper();
      this.keeper += dep1926.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep543 {
    private Integer keeper = 0;

    @Inject
    Dep543(Dep1927 dep1927, Dep1928 dep1928, Dep1929 dep1929, Dep1930 dep1930, Dep1931 dep1931) {
      this.keeper += dep1927.getKeeper();
      this.keeper += dep1928.getKeeper();
      this.keeper += dep1929.getKeeper();
      this.keeper += dep1930.getKeeper();
      this.keeper += dep1931.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep544 {
    private Integer keeper = 0;

    @Inject
    Dep544(Dep1932 dep1932, Dep1933 dep1933, Dep1934 dep1934, Dep1935 dep1935) {
      this.keeper += dep1932.getKeeper();
      this.keeper += dep1933.getKeeper();
      this.keeper += dep1934.getKeeper();
      this.keeper += dep1935.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep545 {
    private Integer keeper = 0;

    @Inject
    Dep545(
        Dep1936 dep1936,
        Dep1937 dep1937,
        Dep1938 dep1938,
        Dep1939 dep1939,
        Dep1940 dep1940,
        Dep1941 dep1941) {
      this.keeper += dep1936.getKeeper();
      this.keeper += dep1937.getKeeper();
      this.keeper += dep1938.getKeeper();
      this.keeper += dep1939.getKeeper();
      this.keeper += dep1940.getKeeper();
      this.keeper += dep1941.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep546 {
    private Integer keeper = 0;

    @Inject
    Dep546(Dep1942 dep1942) {
      this.keeper += dep1942.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep547 {
    private Integer keeper = 0;

    @Inject
    Dep547(
        Dep1943 dep1943,
        Dep1944 dep1944,
        Dep1945 dep1945,
        Dep1946 dep1946,
        Dep1947 dep1947,
        Dep1948 dep1948) {
      this.keeper += dep1943.getKeeper();
      this.keeper += dep1944.getKeeper();
      this.keeper += dep1945.getKeeper();
      this.keeper += dep1946.getKeeper();
      this.keeper += dep1947.getKeeper();
      this.keeper += dep1948.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep548 {
    private Integer keeper = 0;

    Dep548(Dep1949 dep1949) {
      this.keeper += dep1949.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep549 {
    private Integer keeper = 0;

    @Inject
    Dep549(Dep1950 dep1950, Dep1951 dep1951, Dep1952 dep1952, Dep1953 dep1953, Dep1954 dep1954) {
      this.keeper += dep1950.getKeeper();
      this.keeper += dep1951.getKeeper();
      this.keeper += dep1952.getKeeper();
      this.keeper += dep1953.getKeeper();
      this.keeper += dep1954.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep550 {
    private Integer keeper = 0;

    @Inject
    Dep550(Dep1955 dep1955, Dep1956 dep1956, Dep1957 dep1957, Dep1958 dep1958, Dep1959 dep1959) {
      this.keeper += dep1955.getKeeper();
      this.keeper += dep1956.getKeeper();
      this.keeper += dep1957.getKeeper();
      this.keeper += dep1958.getKeeper();
      this.keeper += dep1959.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep551 {
    private Integer keeper = 0;

    Dep551(Dep1960 dep1960, Dep1961 dep1961, Dep1962 dep1962, Dep1963 dep1963) {
      this.keeper += dep1960.getKeeper();
      this.keeper += dep1961.getKeeper();
      this.keeper += dep1962.getKeeper();
      this.keeper += dep1963.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep552 {
    private Integer keeper = 0;

    @Inject
    Dep552(Dep1964 dep1964, Dep1965 dep1965, Dep1966 dep1966) {
      this.keeper += dep1964.getKeeper();
      this.keeper += dep1965.getKeeper();
      this.keeper += dep1966.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep553 {
    private Integer keeper = 0;

    Dep553(Dep1967 dep1967) {
      this.keeper += dep1967.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep554 {
    private Integer keeper = 0;

    @Inject
    Dep554(Dep1968 dep1968, Dep1969 dep1969, Dep1970 dep1970, Dep1971 dep1971, Dep1972 dep1972) {
      this.keeper += dep1968.getKeeper();
      this.keeper += dep1969.getKeeper();
      this.keeper += dep1970.getKeeper();
      this.keeper += dep1971.getKeeper();
      this.keeper += dep1972.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep555 {
    private Integer keeper = 0;

    Dep555(Dep1973 dep1973, Dep1974 dep1974) {
      this.keeper += dep1973.getKeeper();
      this.keeper += dep1974.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep556 {
    private Integer keeper = 0;

    Dep556(Dep1975 dep1975) {
      this.keeper += dep1975.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep557 {
    private Integer keeper = 0;

    @Inject
    Dep557(Dep1976 dep1976, Dep1977 dep1977) {
      this.keeper += dep1976.getKeeper();
      this.keeper += dep1977.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep558 {
    private Integer keeper = 0;

    @Inject
    Dep558(Dep1978 dep1978) {
      this.keeper += dep1978.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep559 {
    private Integer keeper = 0;

    Dep559(Dep1979 dep1979, Dep1980 dep1980, Dep1981 dep1981) {
      this.keeper += dep1979.getKeeper();
      this.keeper += dep1980.getKeeper();
      this.keeper += dep1981.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep560 {
    private Integer keeper = 0;

    @Inject
    Dep560(Dep1982 dep1982, Dep1983 dep1983, Dep1984 dep1984, Dep1985 dep1985) {
      this.keeper += dep1982.getKeeper();
      this.keeper += dep1983.getKeeper();
      this.keeper += dep1984.getKeeper();
      this.keeper += dep1985.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep561 {
    private Integer keeper = 0;

    @Inject
    Dep561(Dep1986 dep1986, Dep1987 dep1987, Dep1988 dep1988) {
      this.keeper += dep1986.getKeeper();
      this.keeper += dep1987.getKeeper();
      this.keeper += dep1988.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep562 {
    private Integer keeper = 0;

    @Inject
    Dep562(Dep1989 dep1989, Dep1990 dep1990, Dep1991 dep1991, Dep1992 dep1992, Dep1993 dep1993) {
      this.keeper += dep1989.getKeeper();
      this.keeper += dep1990.getKeeper();
      this.keeper += dep1991.getKeeper();
      this.keeper += dep1992.getKeeper();
      this.keeper += dep1993.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep563 {
    private Integer keeper = 0;

    Dep563(
        Dep1994 dep1994,
        Dep1995 dep1995,
        Dep1996 dep1996,
        Dep1997 dep1997,
        Dep1998 dep1998,
        Dep1999 dep1999) {
      this.keeper += dep1994.getKeeper();
      this.keeper += dep1995.getKeeper();
      this.keeper += dep1996.getKeeper();
      this.keeper += dep1997.getKeeper();
      this.keeper += dep1998.getKeeper();
      this.keeper += dep1999.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep564 {
    private Integer keeper = 0;

    @Inject
    Dep564(Dep2000 dep2000) {
      this.keeper += dep2000.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep565 {
    private Integer keeper = 0;

    Dep565(Dep2001 dep2001) {
      this.keeper += dep2001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep566 {
    private Integer keeper = 0;

    Dep566(Dep2002 dep2002, Dep2003 dep2003, Dep2004 dep2004, Dep2005 dep2005) {
      this.keeper += dep2002.getKeeper();
      this.keeper += dep2003.getKeeper();
      this.keeper += dep2004.getKeeper();
      this.keeper += dep2005.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep567 {
    private Integer keeper = 0;

    Dep567(Dep2006 dep2006, Dep2007 dep2007, Dep2008 dep2008, Dep2009 dep2009, Dep2010 dep2010) {
      this.keeper += dep2006.getKeeper();
      this.keeper += dep2007.getKeeper();
      this.keeper += dep2008.getKeeper();
      this.keeper += dep2009.getKeeper();
      this.keeper += dep2010.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep568 {
    private Integer keeper = 0;

    @Inject
    Dep568(Dep2011 dep2011) {
      this.keeper += dep2011.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep569 {
    private Integer keeper = 0;

    @Inject
    Dep569(Dep2012 dep2012) {
      this.keeper += dep2012.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep570 {
    private Integer keeper = 0;

    @Inject
    Dep570(Dep2013 dep2013) {
      this.keeper += dep2013.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep571 {
    private Integer keeper = 0;

    @Inject
    Dep571(Dep2014 dep2014) {
      this.keeper += dep2014.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep572 {
    private Integer keeper = 0;

    Dep572(
        Dep2015 dep2015,
        Dep2016 dep2016,
        Dep2017 dep2017,
        Dep2018 dep2018,
        Dep2019 dep2019,
        Dep2020 dep2020) {
      this.keeper += dep2015.getKeeper();
      this.keeper += dep2016.getKeeper();
      this.keeper += dep2017.getKeeper();
      this.keeper += dep2018.getKeeper();
      this.keeper += dep2019.getKeeper();
      this.keeper += dep2020.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep573 {
    private Integer keeper = 0;

    Dep573(Dep2021 dep2021, Dep2022 dep2022, Dep2023 dep2023, Dep2024 dep2024) {
      this.keeper += dep2021.getKeeper();
      this.keeper += dep2022.getKeeper();
      this.keeper += dep2023.getKeeper();
      this.keeper += dep2024.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep574 {
    private Integer keeper = 0;

    Dep574(Dep2025 dep2025, Dep2026 dep2026, Dep2027 dep2027, Dep2028 dep2028) {
      this.keeper += dep2025.getKeeper();
      this.keeper += dep2026.getKeeper();
      this.keeper += dep2027.getKeeper();
      this.keeper += dep2028.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep575 {
    private Integer keeper = 0;

    Dep575(
        Dep2029 dep2029,
        Dep2030 dep2030,
        Dep2031 dep2031,
        Dep2032 dep2032,
        Dep2033 dep2033,
        Dep2034 dep2034) {
      this.keeper += dep2029.getKeeper();
      this.keeper += dep2030.getKeeper();
      this.keeper += dep2031.getKeeper();
      this.keeper += dep2032.getKeeper();
      this.keeper += dep2033.getKeeper();
      this.keeper += dep2034.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep576 {
    private Integer keeper = 0;

    Dep576(Dep2035 dep2035, Dep2036 dep2036) {
      this.keeper += dep2035.getKeeper();
      this.keeper += dep2036.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep577 {
    private Integer keeper = 0;

    Dep577(Dep2037 dep2037) {
      this.keeper += dep2037.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep578 {
    private Integer keeper = 0;

    @Inject
    Dep578(
        Dep2038 dep2038,
        Dep2039 dep2039,
        Dep2040 dep2040,
        Dep2041 dep2041,
        Dep2042 dep2042,
        Dep2043 dep2043) {
      this.keeper += dep2038.getKeeper();
      this.keeper += dep2039.getKeeper();
      this.keeper += dep2040.getKeeper();
      this.keeper += dep2041.getKeeper();
      this.keeper += dep2042.getKeeper();
      this.keeper += dep2043.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep579 {
    private Integer keeper = 0;

    Dep579(
        Dep2044 dep2044,
        Dep2045 dep2045,
        Dep2046 dep2046,
        Dep2047 dep2047,
        Dep2048 dep2048,
        Dep2049 dep2049) {
      this.keeper += dep2044.getKeeper();
      this.keeper += dep2045.getKeeper();
      this.keeper += dep2046.getKeeper();
      this.keeper += dep2047.getKeeper();
      this.keeper += dep2048.getKeeper();
      this.keeper += dep2049.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep580 {
    private Integer keeper = 0;

    Dep580(Dep2050 dep2050, Dep2051 dep2051, Dep2052 dep2052) {
      this.keeper += dep2050.getKeeper();
      this.keeper += dep2051.getKeeper();
      this.keeper += dep2052.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep581 {
    private Integer keeper = 0;

    Dep581(Dep2053 dep2053, Dep2054 dep2054, Dep2055 dep2055, Dep2056 dep2056) {
      this.keeper += dep2053.getKeeper();
      this.keeper += dep2054.getKeeper();
      this.keeper += dep2055.getKeeper();
      this.keeper += dep2056.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep582 {
    private Integer keeper = 0;

    @Inject
    Dep582(Dep2057 dep2057, Dep2058 dep2058, Dep2059 dep2059, Dep2060 dep2060, Dep2061 dep2061) {
      this.keeper += dep2057.getKeeper();
      this.keeper += dep2058.getKeeper();
      this.keeper += dep2059.getKeeper();
      this.keeper += dep2060.getKeeper();
      this.keeper += dep2061.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep583 {
    private Integer keeper = 0;

    @Inject
    Dep583(Dep2062 dep2062, Dep2063 dep2063, Dep2064 dep2064) {
      this.keeper += dep2062.getKeeper();
      this.keeper += dep2063.getKeeper();
      this.keeper += dep2064.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep584 {
    private Integer keeper = 0;

    @Inject
    Dep584(
        Dep2065 dep2065,
        Dep2066 dep2066,
        Dep2067 dep2067,
        Dep2068 dep2068,
        Dep2069 dep2069,
        Dep2070 dep2070) {
      this.keeper += dep2065.getKeeper();
      this.keeper += dep2066.getKeeper();
      this.keeper += dep2067.getKeeper();
      this.keeper += dep2068.getKeeper();
      this.keeper += dep2069.getKeeper();
      this.keeper += dep2070.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep585 {
    private Integer keeper = 0;

    Dep585(Dep2071 dep2071, Dep2072 dep2072, Dep2073 dep2073, Dep2074 dep2074) {
      this.keeper += dep2071.getKeeper();
      this.keeper += dep2072.getKeeper();
      this.keeper += dep2073.getKeeper();
      this.keeper += dep2074.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep586 {
    private Integer keeper = 0;

    @Inject
    Dep586(Dep2075 dep2075, Dep2076 dep2076, Dep2077 dep2077, Dep2078 dep2078, Dep2079 dep2079) {
      this.keeper += dep2075.getKeeper();
      this.keeper += dep2076.getKeeper();
      this.keeper += dep2077.getKeeper();
      this.keeper += dep2078.getKeeper();
      this.keeper += dep2079.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep587 {
    private Integer keeper = 0;

    Dep587(
        Dep2080 dep2080,
        Dep2081 dep2081,
        Dep2082 dep2082,
        Dep2083 dep2083,
        Dep2084 dep2084,
        Dep2085 dep2085) {
      this.keeper += dep2080.getKeeper();
      this.keeper += dep2081.getKeeper();
      this.keeper += dep2082.getKeeper();
      this.keeper += dep2083.getKeeper();
      this.keeper += dep2084.getKeeper();
      this.keeper += dep2085.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep588 {
    private Integer keeper = 0;

    @Inject
    Dep588(Dep2086 dep2086, Dep2087 dep2087) {
      this.keeper += dep2086.getKeeper();
      this.keeper += dep2087.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep589 {
    private Integer keeper = 0;

    @Inject
    Dep589(
        Dep2088 dep2088,
        Dep2089 dep2089,
        Dep2090 dep2090,
        Dep2091 dep2091,
        Dep2092 dep2092,
        Dep2093 dep2093) {
      this.keeper += dep2088.getKeeper();
      this.keeper += dep2089.getKeeper();
      this.keeper += dep2090.getKeeper();
      this.keeper += dep2091.getKeeper();
      this.keeper += dep2092.getKeeper();
      this.keeper += dep2093.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep590 {
    private Integer keeper = 0;

    Dep590(Dep2094 dep2094) {
      this.keeper += dep2094.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep591 {
    private Integer keeper = 0;

    Dep591(Dep2095 dep2095, Dep2096 dep2096, Dep2097 dep2097, Dep2098 dep2098) {
      this.keeper += dep2095.getKeeper();
      this.keeper += dep2096.getKeeper();
      this.keeper += dep2097.getKeeper();
      this.keeper += dep2098.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep592 {
    private Integer keeper = 0;

    Dep592(Dep2099 dep2099) {
      this.keeper += dep2099.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep593 {
    private Integer keeper = 0;

    @Inject
    Dep593(Dep2100 dep2100, Dep2101 dep2101, Dep2102 dep2102) {
      this.keeper += dep2100.getKeeper();
      this.keeper += dep2101.getKeeper();
      this.keeper += dep2102.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep594 {
    private Integer keeper = 0;

    @Inject
    Dep594(Dep2103 dep2103, Dep2104 dep2104, Dep2105 dep2105) {
      this.keeper += dep2103.getKeeper();
      this.keeper += dep2104.getKeeper();
      this.keeper += dep2105.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep595 {
    private Integer keeper = 0;

    @Inject
    Dep595(Dep2106 dep2106, Dep2107 dep2107, Dep2108 dep2108, Dep2109 dep2109) {
      this.keeper += dep2106.getKeeper();
      this.keeper += dep2107.getKeeper();
      this.keeper += dep2108.getKeeper();
      this.keeper += dep2109.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep596 {
    private Integer keeper = 0;

    @Inject
    Dep596(
        Dep2110 dep2110,
        Dep2111 dep2111,
        Dep2112 dep2112,
        Dep2113 dep2113,
        Dep2114 dep2114,
        Dep2115 dep2115) {
      this.keeper += dep2110.getKeeper();
      this.keeper += dep2111.getKeeper();
      this.keeper += dep2112.getKeeper();
      this.keeper += dep2113.getKeeper();
      this.keeper += dep2114.getKeeper();
      this.keeper += dep2115.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep597 {
    private Integer keeper = 0;

    Dep597(Dep2116 dep2116, Dep2117 dep2117, Dep2118 dep2118, Dep2119 dep2119) {
      this.keeper += dep2116.getKeeper();
      this.keeper += dep2117.getKeeper();
      this.keeper += dep2118.getKeeper();
      this.keeper += dep2119.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep598 {
    private Integer keeper = 0;

    Dep598(
        Dep2120 dep2120,
        Dep2121 dep2121,
        Dep2122 dep2122,
        Dep2123 dep2123,
        Dep2124 dep2124,
        Dep2125 dep2125) {
      this.keeper += dep2120.getKeeper();
      this.keeper += dep2121.getKeeper();
      this.keeper += dep2122.getKeeper();
      this.keeper += dep2123.getKeeper();
      this.keeper += dep2124.getKeeper();
      this.keeper += dep2125.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep599 {
    private Integer keeper = 0;

    Dep599(Dep2126 dep2126, Dep2127 dep2127, Dep2128 dep2128, Dep2129 dep2129) {
      this.keeper += dep2126.getKeeper();
      this.keeper += dep2127.getKeeper();
      this.keeper += dep2128.getKeeper();
      this.keeper += dep2129.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep600 {
    private Integer keeper = 0;

    @Inject
    Dep600(
        Dep2130 dep2130,
        Dep2131 dep2131,
        Dep2132 dep2132,
        Dep2133 dep2133,
        Dep2134 dep2134,
        Dep2135 dep2135) {
      this.keeper += dep2130.getKeeper();
      this.keeper += dep2131.getKeeper();
      this.keeper += dep2132.getKeeper();
      this.keeper += dep2133.getKeeper();
      this.keeper += dep2134.getKeeper();
      this.keeper += dep2135.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep601 {
    private Integer keeper = 0;

    @Inject
    Dep601(Dep2136 dep2136, Dep2137 dep2137, Dep2138 dep2138) {
      this.keeper += dep2136.getKeeper();
      this.keeper += dep2137.getKeeper();
      this.keeper += dep2138.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep602 {
    private Integer keeper = 0;

    @Inject
    Dep602(Dep2139 dep2139) {
      this.keeper += dep2139.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep603 {
    private Integer keeper = 0;

    @Inject
    Dep603(Dep2140 dep2140, Dep2141 dep2141, Dep2142 dep2142, Dep2143 dep2143, Dep2144 dep2144) {
      this.keeper += dep2140.getKeeper();
      this.keeper += dep2141.getKeeper();
      this.keeper += dep2142.getKeeper();
      this.keeper += dep2143.getKeeper();
      this.keeper += dep2144.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep604 {
    private Integer keeper = 0;

    Dep604(Dep2145 dep2145, Dep2146 dep2146, Dep2147 dep2147) {
      this.keeper += dep2145.getKeeper();
      this.keeper += dep2146.getKeeper();
      this.keeper += dep2147.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep605 {
    private Integer keeper = 0;

    @Inject
    Dep605(Dep2148 dep2148, Dep2149 dep2149, Dep2150 dep2150, Dep2151 dep2151, Dep2152 dep2152) {
      this.keeper += dep2148.getKeeper();
      this.keeper += dep2149.getKeeper();
      this.keeper += dep2150.getKeeper();
      this.keeper += dep2151.getKeeper();
      this.keeper += dep2152.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep606 {
    private Integer keeper = 0;

    Dep606(
        Dep2153 dep2153,
        Dep2154 dep2154,
        Dep2155 dep2155,
        Dep2156 dep2156,
        Dep2157 dep2157,
        Dep2158 dep2158) {
      this.keeper += dep2153.getKeeper();
      this.keeper += dep2154.getKeeper();
      this.keeper += dep2155.getKeeper();
      this.keeper += dep2156.getKeeper();
      this.keeper += dep2157.getKeeper();
      this.keeper += dep2158.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep607 {
    private Integer keeper = 0;

    Dep607(Dep2159 dep2159, Dep2160 dep2160, Dep2161 dep2161, Dep2162 dep2162) {
      this.keeper += dep2159.getKeeper();
      this.keeper += dep2160.getKeeper();
      this.keeper += dep2161.getKeeper();
      this.keeper += dep2162.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep608 {
    private Integer keeper = 0;

    @Inject
    Dep608(Dep2163 dep2163, Dep2164 dep2164, Dep2165 dep2165) {
      this.keeper += dep2163.getKeeper();
      this.keeper += dep2164.getKeeper();
      this.keeper += dep2165.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep609 {
    private Integer keeper = 0;

    @Inject
    Dep609(Dep2166 dep2166, Dep2167 dep2167, Dep2168 dep2168, Dep2169 dep2169, Dep2170 dep2170) {
      this.keeper += dep2166.getKeeper();
      this.keeper += dep2167.getKeeper();
      this.keeper += dep2168.getKeeper();
      this.keeper += dep2169.getKeeper();
      this.keeper += dep2170.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep610 {
    private Integer keeper = 0;

    @Inject
    Dep610(
        Dep2171 dep2171,
        Dep2172 dep2172,
        Dep2173 dep2173,
        Dep2174 dep2174,
        Dep2175 dep2175,
        Dep2176 dep2176) {
      this.keeper += dep2171.getKeeper();
      this.keeper += dep2172.getKeeper();
      this.keeper += dep2173.getKeeper();
      this.keeper += dep2174.getKeeper();
      this.keeper += dep2175.getKeeper();
      this.keeper += dep2176.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep611 {
    private Integer keeper = 0;

    Dep611(Dep2177 dep2177, Dep2178 dep2178) {
      this.keeper += dep2177.getKeeper();
      this.keeper += dep2178.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep612 {
    private Integer keeper = 0;

    @Inject
    Dep612(Dep2179 dep2179, Dep2180 dep2180, Dep2181 dep2181) {
      this.keeper += dep2179.getKeeper();
      this.keeper += dep2180.getKeeper();
      this.keeper += dep2181.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep613 {
    private Integer keeper = 0;

    @Inject
    Dep613(Dep2182 dep2182) {
      this.keeper += dep2182.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep614 {
    private Integer keeper = 0;

    Dep614(Dep2183 dep2183, Dep2184 dep2184, Dep2185 dep2185, Dep2186 dep2186, Dep2187 dep2187) {
      this.keeper += dep2183.getKeeper();
      this.keeper += dep2184.getKeeper();
      this.keeper += dep2185.getKeeper();
      this.keeper += dep2186.getKeeper();
      this.keeper += dep2187.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep615 {
    private Integer keeper = 0;

    Dep615(
        Dep2188 dep2188,
        Dep2189 dep2189,
        Dep2190 dep2190,
        Dep2191 dep2191,
        Dep2192 dep2192,
        Dep2193 dep2193) {
      this.keeper += dep2188.getKeeper();
      this.keeper += dep2189.getKeeper();
      this.keeper += dep2190.getKeeper();
      this.keeper += dep2191.getKeeper();
      this.keeper += dep2192.getKeeper();
      this.keeper += dep2193.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep616 {
    private Integer keeper = 0;

    @Inject
    Dep616(Dep2194 dep2194, Dep2195 dep2195, Dep2196 dep2196, Dep2197 dep2197) {
      this.keeper += dep2194.getKeeper();
      this.keeper += dep2195.getKeeper();
      this.keeper += dep2196.getKeeper();
      this.keeper += dep2197.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep617 {
    private Integer keeper = 0;

    Dep617(Dep2198 dep2198, Dep2199 dep2199, Dep2200 dep2200, Dep2201 dep2201, Dep2202 dep2202) {
      this.keeper += dep2198.getKeeper();
      this.keeper += dep2199.getKeeper();
      this.keeper += dep2200.getKeeper();
      this.keeper += dep2201.getKeeper();
      this.keeper += dep2202.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep618 {
    private Integer keeper = 0;

    @Inject
    Dep618(Dep2203 dep2203, Dep2204 dep2204, Dep2205 dep2205, Dep2206 dep2206, Dep2207 dep2207) {
      this.keeper += dep2203.getKeeper();
      this.keeper += dep2204.getKeeper();
      this.keeper += dep2205.getKeeper();
      this.keeper += dep2206.getKeeper();
      this.keeper += dep2207.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep619 {
    private Integer keeper = 0;

    @Inject
    Dep619(Dep2208 dep2208) {
      this.keeper += dep2208.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep620 {
    private Integer keeper = 0;

    Dep620(Dep2209 dep2209, Dep2210 dep2210, Dep2211 dep2211) {
      this.keeper += dep2209.getKeeper();
      this.keeper += dep2210.getKeeper();
      this.keeper += dep2211.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep621 {
    private Integer keeper = 0;

    @Inject
    Dep621(Dep2212 dep2212, Dep2213 dep2213, Dep2214 dep2214, Dep2215 dep2215, Dep2216 dep2216) {
      this.keeper += dep2212.getKeeper();
      this.keeper += dep2213.getKeeper();
      this.keeper += dep2214.getKeeper();
      this.keeper += dep2215.getKeeper();
      this.keeper += dep2216.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep622 {
    private Integer keeper = 0;

    @Inject
    Dep622(Dep2217 dep2217, Dep2218 dep2218) {
      this.keeper += dep2217.getKeeper();
      this.keeper += dep2218.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep623 {
    private Integer keeper = 0;

    @Inject
    Dep623(Dep2219 dep2219, Dep2220 dep2220, Dep2221 dep2221, Dep2222 dep2222) {
      this.keeper += dep2219.getKeeper();
      this.keeper += dep2220.getKeeper();
      this.keeper += dep2221.getKeeper();
      this.keeper += dep2222.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep624 {
    private Integer keeper = 0;

    @Inject
    Dep624(Dep2223 dep2223, Dep2224 dep2224) {
      this.keeper += dep2223.getKeeper();
      this.keeper += dep2224.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep625 {
    private Integer keeper = 0;

    Dep625(Dep2225 dep2225, Dep2226 dep2226, Dep2227 dep2227, Dep2228 dep2228) {
      this.keeper += dep2225.getKeeper();
      this.keeper += dep2226.getKeeper();
      this.keeper += dep2227.getKeeper();
      this.keeper += dep2228.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep626 {
    private Integer keeper = 0;

    @Inject
    Dep626(Dep2229 dep2229, Dep2230 dep2230, Dep2231 dep2231) {
      this.keeper += dep2229.getKeeper();
      this.keeper += dep2230.getKeeper();
      this.keeper += dep2231.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep627 {
    private Integer keeper = 0;

    Dep627(
        Dep2232 dep2232,
        Dep2233 dep2233,
        Dep2234 dep2234,
        Dep2235 dep2235,
        Dep2236 dep2236,
        Dep2237 dep2237) {
      this.keeper += dep2232.getKeeper();
      this.keeper += dep2233.getKeeper();
      this.keeper += dep2234.getKeeper();
      this.keeper += dep2235.getKeeper();
      this.keeper += dep2236.getKeeper();
      this.keeper += dep2237.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep628 {
    private Integer keeper = 0;

    @Inject
    Dep628(Dep2238 dep2238, Dep2239 dep2239, Dep2240 dep2240, Dep2241 dep2241) {
      this.keeper += dep2238.getKeeper();
      this.keeper += dep2239.getKeeper();
      this.keeper += dep2240.getKeeper();
      this.keeper += dep2241.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep629 {
    private Integer keeper = 0;

    Dep629(Dep2242 dep2242, Dep2243 dep2243) {
      this.keeper += dep2242.getKeeper();
      this.keeper += dep2243.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep630 {
    private Integer keeper = 0;

    Dep630(Dep2244 dep2244, Dep2245 dep2245) {
      this.keeper += dep2244.getKeeper();
      this.keeper += dep2245.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep631 {
    private Integer keeper = 0;

    @Inject
    Dep631(Dep2246 dep2246, Dep2247 dep2247, Dep2248 dep2248) {
      this.keeper += dep2246.getKeeper();
      this.keeper += dep2247.getKeeper();
      this.keeper += dep2248.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep632 {
    private Integer keeper = 0;

    Dep632(Dep2249 dep2249) {
      this.keeper += dep2249.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep633 {
    private Integer keeper = 0;

    @Inject
    Dep633(Dep2250 dep2250) {
      this.keeper += dep2250.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep634 {
    private Integer keeper = 0;

    Dep634(
        Dep2251 dep2251,
        Dep2252 dep2252,
        Dep2253 dep2253,
        Dep2254 dep2254,
        Dep2255 dep2255,
        Dep2256 dep2256) {
      this.keeper += dep2251.getKeeper();
      this.keeper += dep2252.getKeeper();
      this.keeper += dep2253.getKeeper();
      this.keeper += dep2254.getKeeper();
      this.keeper += dep2255.getKeeper();
      this.keeper += dep2256.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep635 {
    private Integer keeper = 0;

    Dep635(Dep2257 dep2257, Dep2258 dep2258, Dep2259 dep2259, Dep2260 dep2260, Dep2261 dep2261) {
      this.keeper += dep2257.getKeeper();
      this.keeper += dep2258.getKeeper();
      this.keeper += dep2259.getKeeper();
      this.keeper += dep2260.getKeeper();
      this.keeper += dep2261.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep636 {
    private Integer keeper = 0;

    @Inject
    Dep636(Dep2262 dep2262, Dep2263 dep2263, Dep2264 dep2264) {
      this.keeper += dep2262.getKeeper();
      this.keeper += dep2263.getKeeper();
      this.keeper += dep2264.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep637 {
    private Integer keeper = 0;

    Dep637(Dep2265 dep2265, Dep2266 dep2266, Dep2267 dep2267, Dep2268 dep2268, Dep2269 dep2269) {
      this.keeper += dep2265.getKeeper();
      this.keeper += dep2266.getKeeper();
      this.keeper += dep2267.getKeeper();
      this.keeper += dep2268.getKeeper();
      this.keeper += dep2269.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep638 {
    private Integer keeper = 0;

    Dep638(
        Dep2270 dep2270,
        Dep2271 dep2271,
        Dep2272 dep2272,
        Dep2273 dep2273,
        Dep2274 dep2274,
        Dep2275 dep2275) {
      this.keeper += dep2270.getKeeper();
      this.keeper += dep2271.getKeeper();
      this.keeper += dep2272.getKeeper();
      this.keeper += dep2273.getKeeper();
      this.keeper += dep2274.getKeeper();
      this.keeper += dep2275.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep639 {
    private Integer keeper = 0;

    @Inject
    Dep639(
        Dep2276 dep2276,
        Dep2277 dep2277,
        Dep2278 dep2278,
        Dep2279 dep2279,
        Dep2280 dep2280,
        Dep2281 dep2281) {
      this.keeper += dep2276.getKeeper();
      this.keeper += dep2277.getKeeper();
      this.keeper += dep2278.getKeeper();
      this.keeper += dep2279.getKeeper();
      this.keeper += dep2280.getKeeper();
      this.keeper += dep2281.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep640 {
    private Integer keeper = 0;

    Dep640(Dep2282 dep2282, Dep2283 dep2283, Dep2284 dep2284, Dep2285 dep2285) {
      this.keeper += dep2282.getKeeper();
      this.keeper += dep2283.getKeeper();
      this.keeper += dep2284.getKeeper();
      this.keeper += dep2285.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep641 {
    private Integer keeper = 0;

    @Inject
    Dep641(Dep2286 dep2286, Dep2287 dep2287) {
      this.keeper += dep2286.getKeeper();
      this.keeper += dep2287.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep642 {
    private Integer keeper = 0;

    Dep642(Dep2288 dep2288, Dep2289 dep2289, Dep2290 dep2290, Dep2291 dep2291) {
      this.keeper += dep2288.getKeeper();
      this.keeper += dep2289.getKeeper();
      this.keeper += dep2290.getKeeper();
      this.keeper += dep2291.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep643 {
    private Integer keeper = 0;

    Dep643(Dep2292 dep2292, Dep2293 dep2293) {
      this.keeper += dep2292.getKeeper();
      this.keeper += dep2293.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep644 {
    private Integer keeper = 0;

    @Inject
    Dep644(Dep2294 dep2294, Dep2295 dep2295, Dep2296 dep2296, Dep2297 dep2297) {
      this.keeper += dep2294.getKeeper();
      this.keeper += dep2295.getKeeper();
      this.keeper += dep2296.getKeeper();
      this.keeper += dep2297.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep645 {
    private Integer keeper = 0;

    Dep645(Dep2298 dep2298, Dep2299 dep2299) {
      this.keeper += dep2298.getKeeper();
      this.keeper += dep2299.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep646 {
    private Integer keeper = 0;

    @Inject
    Dep646(Dep2300 dep2300, Dep2301 dep2301, Dep2302 dep2302, Dep2303 dep2303, Dep2304 dep2304) {
      this.keeper += dep2300.getKeeper();
      this.keeper += dep2301.getKeeper();
      this.keeper += dep2302.getKeeper();
      this.keeper += dep2303.getKeeper();
      this.keeper += dep2304.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep647 {
    private Integer keeper = 0;

    Dep647(Dep2305 dep2305, Dep2306 dep2306, Dep2307 dep2307, Dep2308 dep2308, Dep2309 dep2309) {
      this.keeper += dep2305.getKeeper();
      this.keeper += dep2306.getKeeper();
      this.keeper += dep2307.getKeeper();
      this.keeper += dep2308.getKeeper();
      this.keeper += dep2309.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep648 {
    private Integer keeper = 0;

    Dep648(Dep2310 dep2310, Dep2311 dep2311, Dep2312 dep2312) {
      this.keeper += dep2310.getKeeper();
      this.keeper += dep2311.getKeeper();
      this.keeper += dep2312.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep649 {
    private Integer keeper = 0;

    @Inject
    Dep649(Dep2313 dep2313, Dep2314 dep2314, Dep2315 dep2315) {
      this.keeper += dep2313.getKeeper();
      this.keeper += dep2314.getKeeper();
      this.keeper += dep2315.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep650 {
    private Integer keeper = 0;

    @Inject
    Dep650(Dep2316 dep2316, Dep2317 dep2317, Dep2318 dep2318, Dep2319 dep2319) {
      this.keeper += dep2316.getKeeper();
      this.keeper += dep2317.getKeeper();
      this.keeper += dep2318.getKeeper();
      this.keeper += dep2319.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep651 {
    private Integer keeper = 0;

    Dep651(Dep2320 dep2320) {
      this.keeper += dep2320.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep652 {
    private Integer keeper = 0;

    Dep652(
        Dep2321 dep2321,
        Dep2322 dep2322,
        Dep2323 dep2323,
        Dep2324 dep2324,
        Dep2325 dep2325,
        Dep2326 dep2326) {
      this.keeper += dep2321.getKeeper();
      this.keeper += dep2322.getKeeper();
      this.keeper += dep2323.getKeeper();
      this.keeper += dep2324.getKeeper();
      this.keeper += dep2325.getKeeper();
      this.keeper += dep2326.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep653 {
    private Integer keeper = 0;

    @Inject
    Dep653(Dep2327 dep2327) {
      this.keeper += dep2327.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep654 {
    private Integer keeper = 0;

    @Inject
    Dep654(Dep2328 dep2328, Dep2329 dep2329, Dep2330 dep2330) {
      this.keeper += dep2328.getKeeper();
      this.keeper += dep2329.getKeeper();
      this.keeper += dep2330.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep655 {
    private Integer keeper = 0;

    Dep655(Dep2331 dep2331, Dep2332 dep2332) {
      this.keeper += dep2331.getKeeper();
      this.keeper += dep2332.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep656 {
    private Integer keeper = 0;

    @Inject
    Dep656(Dep2333 dep2333, Dep2334 dep2334, Dep2335 dep2335) {
      this.keeper += dep2333.getKeeper();
      this.keeper += dep2334.getKeeper();
      this.keeper += dep2335.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep657 {
    private Integer keeper = 0;

    @Inject
    Dep657(Dep2336 dep2336) {
      this.keeper += dep2336.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep658 {
    private Integer keeper = 0;

    Dep658(Dep2337 dep2337) {
      this.keeper += dep2337.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep659 {
    private Integer keeper = 0;

    Dep659(Dep2338 dep2338, Dep2339 dep2339, Dep2340 dep2340, Dep2341 dep2341) {
      this.keeper += dep2338.getKeeper();
      this.keeper += dep2339.getKeeper();
      this.keeper += dep2340.getKeeper();
      this.keeper += dep2341.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep660 {
    private Integer keeper = 0;

    @Inject
    Dep660(Dep2342 dep2342, Dep2343 dep2343, Dep2344 dep2344, Dep2345 dep2345, Dep2346 dep2346) {
      this.keeper += dep2342.getKeeper();
      this.keeper += dep2343.getKeeper();
      this.keeper += dep2344.getKeeper();
      this.keeper += dep2345.getKeeper();
      this.keeper += dep2346.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep661 {
    private Integer keeper = 0;

    @Inject
    Dep661(Dep2347 dep2347, Dep2348 dep2348, Dep2349 dep2349, Dep2350 dep2350, Dep2351 dep2351) {
      this.keeper += dep2347.getKeeper();
      this.keeper += dep2348.getKeeper();
      this.keeper += dep2349.getKeeper();
      this.keeper += dep2350.getKeeper();
      this.keeper += dep2351.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep662 {
    private Integer keeper = 0;

    @Inject
    Dep662(Dep2352 dep2352) {
      this.keeper += dep2352.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep663 {
    private Integer keeper = 0;

    @Inject
    Dep663(Dep2353 dep2353, Dep2354 dep2354, Dep2355 dep2355, Dep2356 dep2356) {
      this.keeper += dep2353.getKeeper();
      this.keeper += dep2354.getKeeper();
      this.keeper += dep2355.getKeeper();
      this.keeper += dep2356.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep664 {
    private Integer keeper = 0;

    @Inject
    Dep664(Dep2357 dep2357) {
      this.keeper += dep2357.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep665 {
    private Integer keeper = 0;

    @Inject
    Dep665(Dep2358 dep2358, Dep2359 dep2359, Dep2360 dep2360, Dep2361 dep2361, Dep2362 dep2362) {
      this.keeper += dep2358.getKeeper();
      this.keeper += dep2359.getKeeper();
      this.keeper += dep2360.getKeeper();
      this.keeper += dep2361.getKeeper();
      this.keeper += dep2362.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep666 {
    private Integer keeper = 0;

    @Inject
    Dep666(
        Dep2363 dep2363,
        Dep2364 dep2364,
        Dep2365 dep2365,
        Dep2366 dep2366,
        Dep2367 dep2367,
        Dep2368 dep2368) {
      this.keeper += dep2363.getKeeper();
      this.keeper += dep2364.getKeeper();
      this.keeper += dep2365.getKeeper();
      this.keeper += dep2366.getKeeper();
      this.keeper += dep2367.getKeeper();
      this.keeper += dep2368.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep667 {
    private Integer keeper = 0;

    Dep667(Dep2369 dep2369) {
      this.keeper += dep2369.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep668 {
    private Integer keeper = 0;

    Dep668(Dep2370 dep2370) {
      this.keeper += dep2370.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep669 {
    private Integer keeper = 0;

    Dep669(
        Dep2371 dep2371,
        Dep2372 dep2372,
        Dep2373 dep2373,
        Dep2374 dep2374,
        Dep2375 dep2375,
        Dep2376 dep2376) {
      this.keeper += dep2371.getKeeper();
      this.keeper += dep2372.getKeeper();
      this.keeper += dep2373.getKeeper();
      this.keeper += dep2374.getKeeper();
      this.keeper += dep2375.getKeeper();
      this.keeper += dep2376.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep670 {
    private Integer keeper = 0;

    @Inject
    Dep670(Dep2377 dep2377, Dep2378 dep2378, Dep2379 dep2379, Dep2380 dep2380, Dep2381 dep2381) {
      this.keeper += dep2377.getKeeper();
      this.keeper += dep2378.getKeeper();
      this.keeper += dep2379.getKeeper();
      this.keeper += dep2380.getKeeper();
      this.keeper += dep2381.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep671 {
    private Integer keeper = 0;

    @Inject
    Dep671(Dep2382 dep2382, Dep2383 dep2383, Dep2384 dep2384) {
      this.keeper += dep2382.getKeeper();
      this.keeper += dep2383.getKeeper();
      this.keeper += dep2384.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep672 {
    private Integer keeper = 0;

    @Inject
    Dep672(Dep2385 dep2385, Dep2386 dep2386) {
      this.keeper += dep2385.getKeeper();
      this.keeper += dep2386.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep673 {
    private Integer keeper = 0;

    @Inject
    Dep673(
        Dep2387 dep2387,
        Dep2388 dep2388,
        Dep2389 dep2389,
        Dep2390 dep2390,
        Dep2391 dep2391,
        Dep2392 dep2392) {
      this.keeper += dep2387.getKeeper();
      this.keeper += dep2388.getKeeper();
      this.keeper += dep2389.getKeeper();
      this.keeper += dep2390.getKeeper();
      this.keeper += dep2391.getKeeper();
      this.keeper += dep2392.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep674 {
    private Integer keeper = 0;

    Dep674(Dep2393 dep2393, Dep2394 dep2394) {
      this.keeper += dep2393.getKeeper();
      this.keeper += dep2394.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep675 {
    private Integer keeper = 0;

    Dep675(Dep2395 dep2395, Dep2396 dep2396) {
      this.keeper += dep2395.getKeeper();
      this.keeper += dep2396.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep676 {
    private Integer keeper = 0;

    @Inject
    Dep676(Dep2397 dep2397, Dep2398 dep2398) {
      this.keeper += dep2397.getKeeper();
      this.keeper += dep2398.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep677 {
    private Integer keeper = 0;

    @Inject
    Dep677(Dep2399 dep2399, Dep2400 dep2400, Dep2401 dep2401, Dep2402 dep2402, Dep2403 dep2403) {
      this.keeper += dep2399.getKeeper();
      this.keeper += dep2400.getKeeper();
      this.keeper += dep2401.getKeeper();
      this.keeper += dep2402.getKeeper();
      this.keeper += dep2403.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep678 {
    private Integer keeper = 0;

    Dep678(Dep2404 dep2404, Dep2405 dep2405, Dep2406 dep2406, Dep2407 dep2407) {
      this.keeper += dep2404.getKeeper();
      this.keeper += dep2405.getKeeper();
      this.keeper += dep2406.getKeeper();
      this.keeper += dep2407.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep679 {
    private Integer keeper = 0;

    Dep679(Dep2408 dep2408, Dep2409 dep2409, Dep2410 dep2410) {
      this.keeper += dep2408.getKeeper();
      this.keeper += dep2409.getKeeper();
      this.keeper += dep2410.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep680 {
    private Integer keeper = 0;

    Dep680(
        Dep2411 dep2411,
        Dep2412 dep2412,
        Dep2413 dep2413,
        Dep2414 dep2414,
        Dep2415 dep2415,
        Dep2416 dep2416) {
      this.keeper += dep2411.getKeeper();
      this.keeper += dep2412.getKeeper();
      this.keeper += dep2413.getKeeper();
      this.keeper += dep2414.getKeeper();
      this.keeper += dep2415.getKeeper();
      this.keeper += dep2416.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep681 {
    private Integer keeper = 0;

    Dep681(Dep2417 dep2417) {
      this.keeper += dep2417.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep682 {
    private Integer keeper = 0;

    @Inject
    Dep682(Dep2418 dep2418, Dep2419 dep2419, Dep2420 dep2420, Dep2421 dep2421) {
      this.keeper += dep2418.getKeeper();
      this.keeper += dep2419.getKeeper();
      this.keeper += dep2420.getKeeper();
      this.keeper += dep2421.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep683 {
    private Integer keeper = 0;

    Dep683(
        Dep2422 dep2422,
        Dep2423 dep2423,
        Dep2424 dep2424,
        Dep2425 dep2425,
        Dep2426 dep2426,
        Dep2427 dep2427) {
      this.keeper += dep2422.getKeeper();
      this.keeper += dep2423.getKeeper();
      this.keeper += dep2424.getKeeper();
      this.keeper += dep2425.getKeeper();
      this.keeper += dep2426.getKeeper();
      this.keeper += dep2427.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep684 {
    private Integer keeper = 0;

    Dep684(Dep2428 dep2428, Dep2429 dep2429) {
      this.keeper += dep2428.getKeeper();
      this.keeper += dep2429.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep685 {
    private Integer keeper = 0;

    Dep685(Dep2430 dep2430, Dep2431 dep2431, Dep2432 dep2432, Dep2433 dep2433) {
      this.keeper += dep2430.getKeeper();
      this.keeper += dep2431.getKeeper();
      this.keeper += dep2432.getKeeper();
      this.keeper += dep2433.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep686 {
    private Integer keeper = 0;

    @Inject
    Dep686(Dep2434 dep2434, Dep2435 dep2435, Dep2436 dep2436, Dep2437 dep2437, Dep2438 dep2438) {
      this.keeper += dep2434.getKeeper();
      this.keeper += dep2435.getKeeper();
      this.keeper += dep2436.getKeeper();
      this.keeper += dep2437.getKeeper();
      this.keeper += dep2438.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep687 {
    private Integer keeper = 0;

    Dep687(Dep2439 dep2439, Dep2440 dep2440) {
      this.keeper += dep2439.getKeeper();
      this.keeper += dep2440.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep688 {
    private Integer keeper = 0;

    @Inject
    Dep688(Dep2441 dep2441, Dep2442 dep2442, Dep2443 dep2443) {
      this.keeper += dep2441.getKeeper();
      this.keeper += dep2442.getKeeper();
      this.keeper += dep2443.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep689 {
    private Integer keeper = 0;

    @Inject
    Dep689(Dep2444 dep2444, Dep2445 dep2445, Dep2446 dep2446, Dep2447 dep2447) {
      this.keeper += dep2444.getKeeper();
      this.keeper += dep2445.getKeeper();
      this.keeper += dep2446.getKeeper();
      this.keeper += dep2447.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep690 {
    private Integer keeper = 0;

    Dep690(Dep2448 dep2448) {
      this.keeper += dep2448.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep691 {
    private Integer keeper = 0;

    @Inject
    Dep691(Dep2449 dep2449, Dep2450 dep2450) {
      this.keeper += dep2449.getKeeper();
      this.keeper += dep2450.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep692 {
    private Integer keeper = 0;

    @Inject
    Dep692(Dep2451 dep2451) {
      this.keeper += dep2451.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep693 {
    private Integer keeper = 0;

    @Inject
    Dep693(Dep2452 dep2452, Dep2453 dep2453, Dep2454 dep2454, Dep2455 dep2455, Dep2456 dep2456) {
      this.keeper += dep2452.getKeeper();
      this.keeper += dep2453.getKeeper();
      this.keeper += dep2454.getKeeper();
      this.keeper += dep2455.getKeeper();
      this.keeper += dep2456.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep694 {
    private Integer keeper = 0;

    @Inject
    Dep694(Dep2457 dep2457, Dep2458 dep2458, Dep2459 dep2459) {
      this.keeper += dep2457.getKeeper();
      this.keeper += dep2458.getKeeper();
      this.keeper += dep2459.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep695 {
    private Integer keeper = 0;

    @Inject
    Dep695(Dep2460 dep2460, Dep2461 dep2461, Dep2462 dep2462, Dep2463 dep2463, Dep2464 dep2464) {
      this.keeper += dep2460.getKeeper();
      this.keeper += dep2461.getKeeper();
      this.keeper += dep2462.getKeeper();
      this.keeper += dep2463.getKeeper();
      this.keeper += dep2464.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep696 {
    private Integer keeper = 0;

    @Inject
    Dep696(Dep2465 dep2465, Dep2466 dep2466, Dep2467 dep2467, Dep2468 dep2468) {
      this.keeper += dep2465.getKeeper();
      this.keeper += dep2466.getKeeper();
      this.keeper += dep2467.getKeeper();
      this.keeper += dep2468.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep697 {
    private Integer keeper = 0;

    Dep697(Dep2469 dep2469, Dep2470 dep2470, Dep2471 dep2471, Dep2472 dep2472, Dep2473 dep2473) {
      this.keeper += dep2469.getKeeper();
      this.keeper += dep2470.getKeeper();
      this.keeper += dep2471.getKeeper();
      this.keeper += dep2472.getKeeper();
      this.keeper += dep2473.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep698 {
    private Integer keeper = 0;

    Dep698(
        Dep2474 dep2474,
        Dep2475 dep2475,
        Dep2476 dep2476,
        Dep2477 dep2477,
        Dep2478 dep2478,
        Dep2479 dep2479) {
      this.keeper += dep2474.getKeeper();
      this.keeper += dep2475.getKeeper();
      this.keeper += dep2476.getKeeper();
      this.keeper += dep2477.getKeeper();
      this.keeper += dep2478.getKeeper();
      this.keeper += dep2479.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep699 {
    private Integer keeper = 0;

    @Inject
    Dep699(
        Dep2480 dep2480,
        Dep2481 dep2481,
        Dep2482 dep2482,
        Dep2483 dep2483,
        Dep2484 dep2484,
        Dep2485 dep2485) {
      this.keeper += dep2480.getKeeper();
      this.keeper += dep2481.getKeeper();
      this.keeper += dep2482.getKeeper();
      this.keeper += dep2483.getKeeper();
      this.keeper += dep2484.getKeeper();
      this.keeper += dep2485.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep700 {
    private Integer keeper = 0;

    Dep700(Dep2486 dep2486) {
      this.keeper += dep2486.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep701 {
    private Integer keeper = 0;

    @Inject
    Dep701(Dep2487 dep2487, Dep2488 dep2488) {
      this.keeper += dep2487.getKeeper();
      this.keeper += dep2488.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep702 {
    private Integer keeper = 0;

    @Inject
    Dep702(Dep2489 dep2489) {
      this.keeper += dep2489.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep703 {
    private Integer keeper = 0;

    Dep703(Dep2490 dep2490, Dep2491 dep2491) {
      this.keeper += dep2490.getKeeper();
      this.keeper += dep2491.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep704 {
    private Integer keeper = 0;

    Dep704(Dep2492 dep2492) {
      this.keeper += dep2492.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep705 {
    private Integer keeper = 0;

    @Inject
    Dep705(
        Dep2493 dep2493,
        Dep2494 dep2494,
        Dep2495 dep2495,
        Dep2496 dep2496,
        Dep2497 dep2497,
        Dep2498 dep2498) {
      this.keeper += dep2493.getKeeper();
      this.keeper += dep2494.getKeeper();
      this.keeper += dep2495.getKeeper();
      this.keeper += dep2496.getKeeper();
      this.keeper += dep2497.getKeeper();
      this.keeper += dep2498.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep706 {
    private Integer keeper = 0;

    @Inject
    Dep706(Dep2499 dep2499, Dep2500 dep2500, Dep2501 dep2501, Dep2502 dep2502) {
      this.keeper += dep2499.getKeeper();
      this.keeper += dep2500.getKeeper();
      this.keeper += dep2501.getKeeper();
      this.keeper += dep2502.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep707 {
    private Integer keeper = 0;

    @Inject
    Dep707(Dep2503 dep2503, Dep2504 dep2504, Dep2505 dep2505) {
      this.keeper += dep2503.getKeeper();
      this.keeper += dep2504.getKeeper();
      this.keeper += dep2505.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep708 {
    private Integer keeper = 0;

    Dep708(Dep2506 dep2506) {
      this.keeper += dep2506.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep709 {
    private Integer keeper = 0;

    Dep709(
        Dep2507 dep2507,
        Dep2508 dep2508,
        Dep2509 dep2509,
        Dep2510 dep2510,
        Dep2511 dep2511,
        Dep2512 dep2512) {
      this.keeper += dep2507.getKeeper();
      this.keeper += dep2508.getKeeper();
      this.keeper += dep2509.getKeeper();
      this.keeper += dep2510.getKeeper();
      this.keeper += dep2511.getKeeper();
      this.keeper += dep2512.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep710 {
    private Integer keeper = 0;

    Dep710(Dep2513 dep2513) {
      this.keeper += dep2513.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep711 {
    private Integer keeper = 0;

    Dep711(Dep2514 dep2514, Dep2515 dep2515, Dep2516 dep2516) {
      this.keeper += dep2514.getKeeper();
      this.keeper += dep2515.getKeeper();
      this.keeper += dep2516.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep712 {
    private Integer keeper = 0;

    @Inject
    Dep712(
        Dep2517 dep2517,
        Dep2518 dep2518,
        Dep2519 dep2519,
        Dep2520 dep2520,
        Dep2521 dep2521,
        Dep2522 dep2522) {
      this.keeper += dep2517.getKeeper();
      this.keeper += dep2518.getKeeper();
      this.keeper += dep2519.getKeeper();
      this.keeper += dep2520.getKeeper();
      this.keeper += dep2521.getKeeper();
      this.keeper += dep2522.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep713 {
    private Integer keeper = 0;

    @Inject
    Dep713(
        Dep2523 dep2523,
        Dep2524 dep2524,
        Dep2525 dep2525,
        Dep2526 dep2526,
        Dep2527 dep2527,
        Dep2528 dep2528) {
      this.keeper += dep2523.getKeeper();
      this.keeper += dep2524.getKeeper();
      this.keeper += dep2525.getKeeper();
      this.keeper += dep2526.getKeeper();
      this.keeper += dep2527.getKeeper();
      this.keeper += dep2528.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep714 {
    private Integer keeper = 0;

    @Inject
    Dep714(Dep2529 dep2529, Dep2530 dep2530, Dep2531 dep2531, Dep2532 dep2532) {
      this.keeper += dep2529.getKeeper();
      this.keeper += dep2530.getKeeper();
      this.keeper += dep2531.getKeeper();
      this.keeper += dep2532.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep715 {
    private Integer keeper = 0;

    @Inject
    Dep715(Dep2533 dep2533) {
      this.keeper += dep2533.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep716 {
    private Integer keeper = 0;

    Dep716(Dep2534 dep2534, Dep2535 dep2535) {
      this.keeper += dep2534.getKeeper();
      this.keeper += dep2535.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep717 {
    private Integer keeper = 0;

    Dep717(Dep2536 dep2536) {
      this.keeper += dep2536.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep718 {
    private Integer keeper = 0;

    @Inject
    Dep718(Dep2537 dep2537, Dep2538 dep2538, Dep2539 dep2539, Dep2540 dep2540) {
      this.keeper += dep2537.getKeeper();
      this.keeper += dep2538.getKeeper();
      this.keeper += dep2539.getKeeper();
      this.keeper += dep2540.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep719 {
    private Integer keeper = 0;

    @Inject
    Dep719(
        Dep2541 dep2541,
        Dep2542 dep2542,
        Dep2543 dep2543,
        Dep2544 dep2544,
        Dep2545 dep2545,
        Dep2546 dep2546) {
      this.keeper += dep2541.getKeeper();
      this.keeper += dep2542.getKeeper();
      this.keeper += dep2543.getKeeper();
      this.keeper += dep2544.getKeeper();
      this.keeper += dep2545.getKeeper();
      this.keeper += dep2546.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep720 {
    private Integer keeper = 0;

    @Inject
    Dep720(Dep2547 dep2547, Dep2548 dep2548, Dep2549 dep2549) {
      this.keeper += dep2547.getKeeper();
      this.keeper += dep2548.getKeeper();
      this.keeper += dep2549.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep721 {
    private Integer keeper = 0;

    Dep721(Dep2550 dep2550, Dep2551 dep2551, Dep2552 dep2552, Dep2553 dep2553) {
      this.keeper += dep2550.getKeeper();
      this.keeper += dep2551.getKeeper();
      this.keeper += dep2552.getKeeper();
      this.keeper += dep2553.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep722 {
    private Integer keeper = 0;

    @Inject
    Dep722(
        Dep2554 dep2554,
        Dep2555 dep2555,
        Dep2556 dep2556,
        Dep2557 dep2557,
        Dep2558 dep2558,
        Dep2559 dep2559) {
      this.keeper += dep2554.getKeeper();
      this.keeper += dep2555.getKeeper();
      this.keeper += dep2556.getKeeper();
      this.keeper += dep2557.getKeeper();
      this.keeper += dep2558.getKeeper();
      this.keeper += dep2559.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep723 {
    private Integer keeper = 0;

    @Inject
    Dep723(Dep2560 dep2560, Dep2561 dep2561, Dep2562 dep2562, Dep2563 dep2563, Dep2564 dep2564) {
      this.keeper += dep2560.getKeeper();
      this.keeper += dep2561.getKeeper();
      this.keeper += dep2562.getKeeper();
      this.keeper += dep2563.getKeeper();
      this.keeper += dep2564.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep724 {
    private Integer keeper = 0;

    Dep724(Dep2565 dep2565, Dep2566 dep2566) {
      this.keeper += dep2565.getKeeper();
      this.keeper += dep2566.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep725 {
    private Integer keeper = 0;

    Dep725(Dep2567 dep2567, Dep2568 dep2568, Dep2569 dep2569, Dep2570 dep2570) {
      this.keeper += dep2567.getKeeper();
      this.keeper += dep2568.getKeeper();
      this.keeper += dep2569.getKeeper();
      this.keeper += dep2570.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep726 {
    private Integer keeper = 0;

    Dep726(Dep2571 dep2571, Dep2572 dep2572, Dep2573 dep2573) {
      this.keeper += dep2571.getKeeper();
      this.keeper += dep2572.getKeeper();
      this.keeper += dep2573.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep727 {
    private Integer keeper = 0;

    @Inject
    Dep727(
        Dep2574 dep2574,
        Dep2575 dep2575,
        Dep2576 dep2576,
        Dep2577 dep2577,
        Dep2578 dep2578,
        Dep2579 dep2579) {
      this.keeper += dep2574.getKeeper();
      this.keeper += dep2575.getKeeper();
      this.keeper += dep2576.getKeeper();
      this.keeper += dep2577.getKeeper();
      this.keeper += dep2578.getKeeper();
      this.keeper += dep2579.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep728 {
    private Integer keeper = 0;

    @Inject
    Dep728(Dep2580 dep2580) {
      this.keeper += dep2580.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep729 {
    private Integer keeper = 0;

    Dep729(Dep2581 dep2581, Dep2582 dep2582, Dep2583 dep2583, Dep2584 dep2584) {
      this.keeper += dep2581.getKeeper();
      this.keeper += dep2582.getKeeper();
      this.keeper += dep2583.getKeeper();
      this.keeper += dep2584.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep730 {
    private Integer keeper = 0;

    Dep730(Dep2585 dep2585, Dep2586 dep2586, Dep2587 dep2587, Dep2588 dep2588, Dep2589 dep2589) {
      this.keeper += dep2585.getKeeper();
      this.keeper += dep2586.getKeeper();
      this.keeper += dep2587.getKeeper();
      this.keeper += dep2588.getKeeper();
      this.keeper += dep2589.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep731 {
    private Integer keeper = 0;

    Dep731(Dep2590 dep2590, Dep2591 dep2591, Dep2592 dep2592) {
      this.keeper += dep2590.getKeeper();
      this.keeper += dep2591.getKeeper();
      this.keeper += dep2592.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep732 {
    private Integer keeper = 0;

    @Inject
    Dep732(Dep2593 dep2593, Dep2594 dep2594, Dep2595 dep2595) {
      this.keeper += dep2593.getKeeper();
      this.keeper += dep2594.getKeeper();
      this.keeper += dep2595.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep733 {
    private Integer keeper = 0;

    Dep733(Dep2596 dep2596, Dep2597 dep2597) {
      this.keeper += dep2596.getKeeper();
      this.keeper += dep2597.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep734 {
    private Integer keeper = 0;

    Dep734(
        Dep2598 dep2598,
        Dep2599 dep2599,
        Dep2600 dep2600,
        Dep2601 dep2601,
        Dep2602 dep2602,
        Dep2603 dep2603) {
      this.keeper += dep2598.getKeeper();
      this.keeper += dep2599.getKeeper();
      this.keeper += dep2600.getKeeper();
      this.keeper += dep2601.getKeeper();
      this.keeper += dep2602.getKeeper();
      this.keeper += dep2603.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep735 {
    private Integer keeper = 0;

    @Inject
    Dep735(Dep2604 dep2604, Dep2605 dep2605, Dep2606 dep2606, Dep2607 dep2607, Dep2608 dep2608) {
      this.keeper += dep2604.getKeeper();
      this.keeper += dep2605.getKeeper();
      this.keeper += dep2606.getKeeper();
      this.keeper += dep2607.getKeeper();
      this.keeper += dep2608.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep736 {
    private Integer keeper = 0;

    @Inject
    Dep736(Dep2609 dep2609, Dep2610 dep2610, Dep2611 dep2611, Dep2612 dep2612) {
      this.keeper += dep2609.getKeeper();
      this.keeper += dep2610.getKeeper();
      this.keeper += dep2611.getKeeper();
      this.keeper += dep2612.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep737 {
    private Integer keeper = 0;

    Dep737(Dep2613 dep2613) {
      this.keeper += dep2613.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep738 {
    private Integer keeper = 0;

    Dep738(Dep2614 dep2614) {
      this.keeper += dep2614.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep739 {
    private Integer keeper = 0;

    Dep739(Dep2615 dep2615) {
      this.keeper += dep2615.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep740 {
    private Integer keeper = 0;

    Dep740(Dep2616 dep2616, Dep2617 dep2617, Dep2618 dep2618) {
      this.keeper += dep2616.getKeeper();
      this.keeper += dep2617.getKeeper();
      this.keeper += dep2618.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep741 {
    private Integer keeper = 0;

    Dep741(Dep2619 dep2619, Dep2620 dep2620, Dep2621 dep2621, Dep2622 dep2622) {
      this.keeper += dep2619.getKeeper();
      this.keeper += dep2620.getKeeper();
      this.keeper += dep2621.getKeeper();
      this.keeper += dep2622.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep742 {
    private Integer keeper = 0;

    @Inject
    Dep742(
        Dep2623 dep2623,
        Dep2624 dep2624,
        Dep2625 dep2625,
        Dep2626 dep2626,
        Dep2627 dep2627,
        Dep2628 dep2628) {
      this.keeper += dep2623.getKeeper();
      this.keeper += dep2624.getKeeper();
      this.keeper += dep2625.getKeeper();
      this.keeper += dep2626.getKeeper();
      this.keeper += dep2627.getKeeper();
      this.keeper += dep2628.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep743 {
    private Integer keeper = 0;

    @Inject
    Dep743(Dep2629 dep2629, Dep2630 dep2630, Dep2631 dep2631, Dep2632 dep2632) {
      this.keeper += dep2629.getKeeper();
      this.keeper += dep2630.getKeeper();
      this.keeper += dep2631.getKeeper();
      this.keeper += dep2632.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep744 {
    private Integer keeper = 0;

    @Inject
    Dep744(Dep2633 dep2633) {
      this.keeper += dep2633.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep745 {
    private Integer keeper = 0;

    @Inject
    Dep745(Dep2634 dep2634) {
      this.keeper += dep2634.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep746 {
    private Integer keeper = 0;

    Dep746(Dep2635 dep2635, Dep2636 dep2636, Dep2637 dep2637, Dep2638 dep2638) {
      this.keeper += dep2635.getKeeper();
      this.keeper += dep2636.getKeeper();
      this.keeper += dep2637.getKeeper();
      this.keeper += dep2638.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep747 {
    private Integer keeper = 0;

    Dep747(Dep2639 dep2639, Dep2640 dep2640, Dep2641 dep2641) {
      this.keeper += dep2639.getKeeper();
      this.keeper += dep2640.getKeeper();
      this.keeper += dep2641.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep748 {
    private Integer keeper = 0;

    Dep748(Dep2642 dep2642, Dep2643 dep2643, Dep2644 dep2644) {
      this.keeper += dep2642.getKeeper();
      this.keeper += dep2643.getKeeper();
      this.keeper += dep2644.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep749 {
    private Integer keeper = 0;

    @Inject
    Dep749(
        Dep2645 dep2645,
        Dep2646 dep2646,
        Dep2647 dep2647,
        Dep2648 dep2648,
        Dep2649 dep2649,
        Dep2650 dep2650) {
      this.keeper += dep2645.getKeeper();
      this.keeper += dep2646.getKeeper();
      this.keeper += dep2647.getKeeper();
      this.keeper += dep2648.getKeeper();
      this.keeper += dep2649.getKeeper();
      this.keeper += dep2650.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep750 {
    private Integer keeper = 0;

    @Inject
    Dep750(Dep2651 dep2651, Dep2652 dep2652) {
      this.keeper += dep2651.getKeeper();
      this.keeper += dep2652.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep751 {
    private Integer keeper = 0;

    @Inject
    Dep751(Dep2653 dep2653, Dep2654 dep2654, Dep2655 dep2655) {
      this.keeper += dep2653.getKeeper();
      this.keeper += dep2654.getKeeper();
      this.keeper += dep2655.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep752 {
    private Integer keeper = 0;

    Dep752(Dep2656 dep2656, Dep2657 dep2657, Dep2658 dep2658) {
      this.keeper += dep2656.getKeeper();
      this.keeper += dep2657.getKeeper();
      this.keeper += dep2658.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep753 {
    private Integer keeper = 0;

    @Inject
    Dep753(Dep2659 dep2659, Dep2660 dep2660) {
      this.keeper += dep2659.getKeeper();
      this.keeper += dep2660.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep754 {
    private Integer keeper = 0;

    Dep754(Dep2661 dep2661, Dep2662 dep2662, Dep2663 dep2663, Dep2664 dep2664) {
      this.keeper += dep2661.getKeeper();
      this.keeper += dep2662.getKeeper();
      this.keeper += dep2663.getKeeper();
      this.keeper += dep2664.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep755 {
    private Integer keeper = 0;

    Dep755(Dep2665 dep2665, Dep2666 dep2666, Dep2667 dep2667) {
      this.keeper += dep2665.getKeeper();
      this.keeper += dep2666.getKeeper();
      this.keeper += dep2667.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep756 {
    private Integer keeper = 0;

    @Inject
    Dep756(Dep2668 dep2668, Dep2669 dep2669, Dep2670 dep2670, Dep2671 dep2671, Dep2672 dep2672) {
      this.keeper += dep2668.getKeeper();
      this.keeper += dep2669.getKeeper();
      this.keeper += dep2670.getKeeper();
      this.keeper += dep2671.getKeeper();
      this.keeper += dep2672.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep757 {
    private Integer keeper = 0;

    Dep757(Dep2673 dep2673, Dep2674 dep2674, Dep2675 dep2675, Dep2676 dep2676) {
      this.keeper += dep2673.getKeeper();
      this.keeper += dep2674.getKeeper();
      this.keeper += dep2675.getKeeper();
      this.keeper += dep2676.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep758 {
    private Integer keeper = 0;

    Dep758(Dep2677 dep2677, Dep2678 dep2678, Dep2679 dep2679, Dep2680 dep2680) {
      this.keeper += dep2677.getKeeper();
      this.keeper += dep2678.getKeeper();
      this.keeper += dep2679.getKeeper();
      this.keeper += dep2680.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep759 {
    private Integer keeper = 0;

    @Inject
    Dep759(Dep2681 dep2681, Dep2682 dep2682, Dep2683 dep2683) {
      this.keeper += dep2681.getKeeper();
      this.keeper += dep2682.getKeeper();
      this.keeper += dep2683.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep760 {
    private Integer keeper = 0;

    Dep760(Dep2684 dep2684, Dep2685 dep2685, Dep2686 dep2686, Dep2687 dep2687, Dep2688 dep2688) {
      this.keeper += dep2684.getKeeper();
      this.keeper += dep2685.getKeeper();
      this.keeper += dep2686.getKeeper();
      this.keeper += dep2687.getKeeper();
      this.keeper += dep2688.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep761 {
    private Integer keeper = 0;

    Dep761(Dep2689 dep2689, Dep2690 dep2690, Dep2691 dep2691, Dep2692 dep2692) {
      this.keeper += dep2689.getKeeper();
      this.keeper += dep2690.getKeeper();
      this.keeper += dep2691.getKeeper();
      this.keeper += dep2692.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep762 {
    private Integer keeper = 0;

    @Inject
    Dep762(Dep2693 dep2693, Dep2694 dep2694, Dep2695 dep2695, Dep2696 dep2696, Dep2697 dep2697) {
      this.keeper += dep2693.getKeeper();
      this.keeper += dep2694.getKeeper();
      this.keeper += dep2695.getKeeper();
      this.keeper += dep2696.getKeeper();
      this.keeper += dep2697.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep763 {
    private Integer keeper = 0;

    @Inject
    Dep763(Dep2698 dep2698) {
      this.keeper += dep2698.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep764 {
    private Integer keeper = 0;

    Dep764(Dep2699 dep2699, Dep2700 dep2700, Dep2701 dep2701, Dep2702 dep2702, Dep2703 dep2703) {
      this.keeper += dep2699.getKeeper();
      this.keeper += dep2700.getKeeper();
      this.keeper += dep2701.getKeeper();
      this.keeper += dep2702.getKeeper();
      this.keeper += dep2703.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep765 {
    private Integer keeper = 0;

    Dep765(
        Dep2704 dep2704,
        Dep2705 dep2705,
        Dep2706 dep2706,
        Dep2707 dep2707,
        Dep2708 dep2708,
        Dep2709 dep2709) {
      this.keeper += dep2704.getKeeper();
      this.keeper += dep2705.getKeeper();
      this.keeper += dep2706.getKeeper();
      this.keeper += dep2707.getKeeper();
      this.keeper += dep2708.getKeeper();
      this.keeper += dep2709.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep766 {
    private Integer keeper = 0;

    Dep766(Dep2710 dep2710, Dep2711 dep2711, Dep2712 dep2712, Dep2713 dep2713, Dep2714 dep2714) {
      this.keeper += dep2710.getKeeper();
      this.keeper += dep2711.getKeeper();
      this.keeper += dep2712.getKeeper();
      this.keeper += dep2713.getKeeper();
      this.keeper += dep2714.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep767 {
    private Integer keeper = 0;

    @Inject
    Dep767(Dep2715 dep2715, Dep2716 dep2716, Dep2717 dep2717, Dep2718 dep2718) {
      this.keeper += dep2715.getKeeper();
      this.keeper += dep2716.getKeeper();
      this.keeper += dep2717.getKeeper();
      this.keeper += dep2718.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep768 {
    private Integer keeper = 0;

    Dep768(Dep2719 dep2719, Dep2720 dep2720) {
      this.keeper += dep2719.getKeeper();
      this.keeper += dep2720.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep769 {
    private Integer keeper = 0;

    @Inject
    Dep769(
        Dep2721 dep2721,
        Dep2722 dep2722,
        Dep2723 dep2723,
        Dep2724 dep2724,
        Dep2725 dep2725,
        Dep2726 dep2726) {
      this.keeper += dep2721.getKeeper();
      this.keeper += dep2722.getKeeper();
      this.keeper += dep2723.getKeeper();
      this.keeper += dep2724.getKeeper();
      this.keeper += dep2725.getKeeper();
      this.keeper += dep2726.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep770 {
    private Integer keeper = 0;

    @Inject
    Dep770(Dep2727 dep2727, Dep2728 dep2728, Dep2729 dep2729) {
      this.keeper += dep2727.getKeeper();
      this.keeper += dep2728.getKeeper();
      this.keeper += dep2729.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep771 {
    private Integer keeper = 0;

    @Inject
    Dep771(
        Dep2730 dep2730,
        Dep2731 dep2731,
        Dep2732 dep2732,
        Dep2733 dep2733,
        Dep2734 dep2734,
        Dep2735 dep2735) {
      this.keeper += dep2730.getKeeper();
      this.keeper += dep2731.getKeeper();
      this.keeper += dep2732.getKeeper();
      this.keeper += dep2733.getKeeper();
      this.keeper += dep2734.getKeeper();
      this.keeper += dep2735.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep772 {
    private Integer keeper = 0;

    @Inject
    Dep772(Dep2736 dep2736, Dep2737 dep2737, Dep2738 dep2738, Dep2739 dep2739, Dep2740 dep2740) {
      this.keeper += dep2736.getKeeper();
      this.keeper += dep2737.getKeeper();
      this.keeper += dep2738.getKeeper();
      this.keeper += dep2739.getKeeper();
      this.keeper += dep2740.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep773 {
    private Integer keeper = 0;

    Dep773(Dep2741 dep2741, Dep2742 dep2742, Dep2743 dep2743, Dep2744 dep2744, Dep2745 dep2745) {
      this.keeper += dep2741.getKeeper();
      this.keeper += dep2742.getKeeper();
      this.keeper += dep2743.getKeeper();
      this.keeper += dep2744.getKeeper();
      this.keeper += dep2745.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep774 {
    private Integer keeper = 0;

    Dep774(Dep2746 dep2746, Dep2747 dep2747) {
      this.keeper += dep2746.getKeeper();
      this.keeper += dep2747.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep775 {
    private Integer keeper = 0;

    Dep775(Dep2748 dep2748, Dep2749 dep2749) {
      this.keeper += dep2748.getKeeper();
      this.keeper += dep2749.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep776 {
    private Integer keeper = 0;

    @Inject
    Dep776(
        Dep2750 dep2750,
        Dep2751 dep2751,
        Dep2752 dep2752,
        Dep2753 dep2753,
        Dep2754 dep2754,
        Dep2755 dep2755) {
      this.keeper += dep2750.getKeeper();
      this.keeper += dep2751.getKeeper();
      this.keeper += dep2752.getKeeper();
      this.keeper += dep2753.getKeeper();
      this.keeper += dep2754.getKeeper();
      this.keeper += dep2755.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep777 {
    private Integer keeper = 0;

    @Inject
    Dep777(Dep2756 dep2756, Dep2757 dep2757, Dep2758 dep2758, Dep2759 dep2759, Dep2760 dep2760) {
      this.keeper += dep2756.getKeeper();
      this.keeper += dep2757.getKeeper();
      this.keeper += dep2758.getKeeper();
      this.keeper += dep2759.getKeeper();
      this.keeper += dep2760.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep778 {
    private Integer keeper = 0;

    Dep778(Dep2761 dep2761, Dep2762 dep2762, Dep2763 dep2763, Dep2764 dep2764) {
      this.keeper += dep2761.getKeeper();
      this.keeper += dep2762.getKeeper();
      this.keeper += dep2763.getKeeper();
      this.keeper += dep2764.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep779 {
    private Integer keeper = 0;

    Dep779(Dep2765 dep2765, Dep2766 dep2766, Dep2767 dep2767, Dep2768 dep2768) {
      this.keeper += dep2765.getKeeper();
      this.keeper += dep2766.getKeeper();
      this.keeper += dep2767.getKeeper();
      this.keeper += dep2768.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep780 {
    private Integer keeper = 0;

    Dep780(Dep2769 dep2769, Dep2770 dep2770, Dep2771 dep2771) {
      this.keeper += dep2769.getKeeper();
      this.keeper += dep2770.getKeeper();
      this.keeper += dep2771.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep781 {
    private Integer keeper = 0;

    @Inject
    Dep781(Dep2772 dep2772, Dep2773 dep2773) {
      this.keeper += dep2772.getKeeper();
      this.keeper += dep2773.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep782 {
    private Integer keeper = 0;

    Dep782(Dep2774 dep2774, Dep2775 dep2775) {
      this.keeper += dep2774.getKeeper();
      this.keeper += dep2775.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep783 {
    private Integer keeper = 0;

    @Inject
    Dep783(Dep2776 dep2776, Dep2777 dep2777) {
      this.keeper += dep2776.getKeeper();
      this.keeper += dep2777.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep784 {
    private Integer keeper = 0;

    @Inject
    Dep784(Dep2778 dep2778, Dep2779 dep2779, Dep2780 dep2780, Dep2781 dep2781) {
      this.keeper += dep2778.getKeeper();
      this.keeper += dep2779.getKeeper();
      this.keeper += dep2780.getKeeper();
      this.keeper += dep2781.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep785 {
    private Integer keeper = 0;

    Dep785(Dep2782 dep2782, Dep2783 dep2783, Dep2784 dep2784) {
      this.keeper += dep2782.getKeeper();
      this.keeper += dep2783.getKeeper();
      this.keeper += dep2784.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep786 {
    private Integer keeper = 0;

    Dep786(Dep2785 dep2785) {
      this.keeper += dep2785.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep787 {
    private Integer keeper = 0;

    Dep787(Dep2786 dep2786, Dep2787 dep2787, Dep2788 dep2788) {
      this.keeper += dep2786.getKeeper();
      this.keeper += dep2787.getKeeper();
      this.keeper += dep2788.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep788 {
    private Integer keeper = 0;

    Dep788(Dep2789 dep2789, Dep2790 dep2790, Dep2791 dep2791, Dep2792 dep2792) {
      this.keeper += dep2789.getKeeper();
      this.keeper += dep2790.getKeeper();
      this.keeper += dep2791.getKeeper();
      this.keeper += dep2792.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep789 {
    private Integer keeper = 0;

    Dep789(
        Dep2793 dep2793,
        Dep2794 dep2794,
        Dep2795 dep2795,
        Dep2796 dep2796,
        Dep2797 dep2797,
        Dep2798 dep2798) {
      this.keeper += dep2793.getKeeper();
      this.keeper += dep2794.getKeeper();
      this.keeper += dep2795.getKeeper();
      this.keeper += dep2796.getKeeper();
      this.keeper += dep2797.getKeeper();
      this.keeper += dep2798.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep790 {
    private Integer keeper = 0;

    Dep790(Dep2799 dep2799, Dep2800 dep2800) {
      this.keeper += dep2799.getKeeper();
      this.keeper += dep2800.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep791 {
    private Integer keeper = 0;

    Dep791(Dep2801 dep2801, Dep2802 dep2802, Dep2803 dep2803, Dep2804 dep2804, Dep2805 dep2805) {
      this.keeper += dep2801.getKeeper();
      this.keeper += dep2802.getKeeper();
      this.keeper += dep2803.getKeeper();
      this.keeper += dep2804.getKeeper();
      this.keeper += dep2805.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep792 {
    private Integer keeper = 0;

    Dep792(Dep2806 dep2806, Dep2807 dep2807, Dep2808 dep2808, Dep2809 dep2809) {
      this.keeper += dep2806.getKeeper();
      this.keeper += dep2807.getKeeper();
      this.keeper += dep2808.getKeeper();
      this.keeper += dep2809.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep793 {
    private Integer keeper = 0;

    @Inject
    Dep793(Dep2810 dep2810, Dep2811 dep2811, Dep2812 dep2812, Dep2813 dep2813, Dep2814 dep2814) {
      this.keeper += dep2810.getKeeper();
      this.keeper += dep2811.getKeeper();
      this.keeper += dep2812.getKeeper();
      this.keeper += dep2813.getKeeper();
      this.keeper += dep2814.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep794 {
    private Integer keeper = 0;

    @Inject
    Dep794(Dep2815 dep2815, Dep2816 dep2816) {
      this.keeper += dep2815.getKeeper();
      this.keeper += dep2816.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep795 {
    private Integer keeper = 0;

    @Inject
    Dep795(Dep2817 dep2817, Dep2818 dep2818, Dep2819 dep2819, Dep2820 dep2820, Dep2821 dep2821) {
      this.keeper += dep2817.getKeeper();
      this.keeper += dep2818.getKeeper();
      this.keeper += dep2819.getKeeper();
      this.keeper += dep2820.getKeeper();
      this.keeper += dep2821.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep796 {
    private Integer keeper = 0;

    @Inject
    Dep796(
        Dep2822 dep2822,
        Dep2823 dep2823,
        Dep2824 dep2824,
        Dep2825 dep2825,
        Dep2826 dep2826,
        Dep2827 dep2827) {
      this.keeper += dep2822.getKeeper();
      this.keeper += dep2823.getKeeper();
      this.keeper += dep2824.getKeeper();
      this.keeper += dep2825.getKeeper();
      this.keeper += dep2826.getKeeper();
      this.keeper += dep2827.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep797 {
    private Integer keeper = 0;

    Dep797(Dep2828 dep2828) {
      this.keeper += dep2828.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep798 {
    private Integer keeper = 0;

    @Inject
    Dep798(Dep2829 dep2829, Dep2830 dep2830, Dep2831 dep2831) {
      this.keeper += dep2829.getKeeper();
      this.keeper += dep2830.getKeeper();
      this.keeper += dep2831.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep799 {
    private Integer keeper = 0;

    Dep799(
        Dep2832 dep2832,
        Dep2833 dep2833,
        Dep2834 dep2834,
        Dep2835 dep2835,
        Dep2836 dep2836,
        Dep2837 dep2837) {
      this.keeper += dep2832.getKeeper();
      this.keeper += dep2833.getKeeper();
      this.keeper += dep2834.getKeeper();
      this.keeper += dep2835.getKeeper();
      this.keeper += dep2836.getKeeper();
      this.keeper += dep2837.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep800 {
    private Integer keeper = 0;

    Dep800(Dep2838 dep2838, Dep2839 dep2839, Dep2840 dep2840) {
      this.keeper += dep2838.getKeeper();
      this.keeper += dep2839.getKeeper();
      this.keeper += dep2840.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep801 {
    private Integer keeper = 0;

    @Inject
    Dep801(Dep2841 dep2841, Dep2842 dep2842, Dep2843 dep2843, Dep2844 dep2844, Dep2845 dep2845) {
      this.keeper += dep2841.getKeeper();
      this.keeper += dep2842.getKeeper();
      this.keeper += dep2843.getKeeper();
      this.keeper += dep2844.getKeeper();
      this.keeper += dep2845.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep802 {
    private Integer keeper = 0;

    Dep802(Dep2846 dep2846, Dep2847 dep2847, Dep2848 dep2848, Dep2849 dep2849) {
      this.keeper += dep2846.getKeeper();
      this.keeper += dep2847.getKeeper();
      this.keeper += dep2848.getKeeper();
      this.keeper += dep2849.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep803 {
    private Integer keeper = 0;

    @Inject
    Dep803(Dep2850 dep2850, Dep2851 dep2851, Dep2852 dep2852) {
      this.keeper += dep2850.getKeeper();
      this.keeper += dep2851.getKeeper();
      this.keeper += dep2852.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep804 {
    private Integer keeper = 0;

    @Inject
    Dep804(Dep2853 dep2853) {
      this.keeper += dep2853.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep805 {
    private Integer keeper = 0;

    @Inject
    Dep805(Dep2854 dep2854, Dep2855 dep2855) {
      this.keeper += dep2854.getKeeper();
      this.keeper += dep2855.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep806 {
    private Integer keeper = 0;

    @Inject
    Dep806(
        Dep2856 dep2856,
        Dep2857 dep2857,
        Dep2858 dep2858,
        Dep2859 dep2859,
        Dep2860 dep2860,
        Dep2861 dep2861) {
      this.keeper += dep2856.getKeeper();
      this.keeper += dep2857.getKeeper();
      this.keeper += dep2858.getKeeper();
      this.keeper += dep2859.getKeeper();
      this.keeper += dep2860.getKeeper();
      this.keeper += dep2861.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep807 {
    private Integer keeper = 0;

    Dep807(Dep2862 dep2862) {
      this.keeper += dep2862.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep808 {
    private Integer keeper = 0;

    @Inject
    Dep808(Dep2863 dep2863, Dep2864 dep2864) {
      this.keeper += dep2863.getKeeper();
      this.keeper += dep2864.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep809 {
    private Integer keeper = 0;

    Dep809(Dep2865 dep2865, Dep2866 dep2866) {
      this.keeper += dep2865.getKeeper();
      this.keeper += dep2866.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep810 {
    private Integer keeper = 0;

    @Inject
    Dep810(
        Dep2867 dep2867,
        Dep2868 dep2868,
        Dep2869 dep2869,
        Dep2870 dep2870,
        Dep2871 dep2871,
        Dep2872 dep2872) {
      this.keeper += dep2867.getKeeper();
      this.keeper += dep2868.getKeeper();
      this.keeper += dep2869.getKeeper();
      this.keeper += dep2870.getKeeper();
      this.keeper += dep2871.getKeeper();
      this.keeper += dep2872.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep811 {
    private Integer keeper = 0;

    @Inject
    Dep811(Dep2873 dep2873, Dep2874 dep2874, Dep2875 dep2875, Dep2876 dep2876) {
      this.keeper += dep2873.getKeeper();
      this.keeper += dep2874.getKeeper();
      this.keeper += dep2875.getKeeper();
      this.keeper += dep2876.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep812 {
    private Integer keeper = 0;

    Dep812(Dep2877 dep2877, Dep2878 dep2878, Dep2879 dep2879) {
      this.keeper += dep2877.getKeeper();
      this.keeper += dep2878.getKeeper();
      this.keeper += dep2879.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep813 {
    private Integer keeper = 0;

    Dep813(Dep2880 dep2880, Dep2881 dep2881, Dep2882 dep2882) {
      this.keeper += dep2880.getKeeper();
      this.keeper += dep2881.getKeeper();
      this.keeper += dep2882.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep814 {
    private Integer keeper = 0;

    @Inject
    Dep814(Dep2883 dep2883, Dep2884 dep2884, Dep2885 dep2885, Dep2886 dep2886) {
      this.keeper += dep2883.getKeeper();
      this.keeper += dep2884.getKeeper();
      this.keeper += dep2885.getKeeper();
      this.keeper += dep2886.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep815 {
    private Integer keeper = 0;

    @Inject
    Dep815(Dep2887 dep2887, Dep2888 dep2888, Dep2889 dep2889, Dep2890 dep2890, Dep2891 dep2891) {
      this.keeper += dep2887.getKeeper();
      this.keeper += dep2888.getKeeper();
      this.keeper += dep2889.getKeeper();
      this.keeper += dep2890.getKeeper();
      this.keeper += dep2891.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep816 {
    private Integer keeper = 0;

    Dep816(
        Dep2892 dep2892,
        Dep2893 dep2893,
        Dep2894 dep2894,
        Dep2895 dep2895,
        Dep2896 dep2896,
        Dep2897 dep2897) {
      this.keeper += dep2892.getKeeper();
      this.keeper += dep2893.getKeeper();
      this.keeper += dep2894.getKeeper();
      this.keeper += dep2895.getKeeper();
      this.keeper += dep2896.getKeeper();
      this.keeper += dep2897.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep817 {
    private Integer keeper = 0;

    Dep817(Dep2898 dep2898, Dep2899 dep2899) {
      this.keeper += dep2898.getKeeper();
      this.keeper += dep2899.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep818 {
    private Integer keeper = 0;

    Dep818(Dep2900 dep2900) {
      this.keeper += dep2900.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep819 {
    private Integer keeper = 0;

    Dep819(Dep2901 dep2901, Dep2902 dep2902, Dep2903 dep2903) {
      this.keeper += dep2901.getKeeper();
      this.keeper += dep2902.getKeeper();
      this.keeper += dep2903.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep820 {
    private Integer keeper = 0;

    Dep820(Dep2904 dep2904, Dep2905 dep2905, Dep2906 dep2906, Dep2907 dep2907, Dep2908 dep2908) {
      this.keeper += dep2904.getKeeper();
      this.keeper += dep2905.getKeeper();
      this.keeper += dep2906.getKeeper();
      this.keeper += dep2907.getKeeper();
      this.keeper += dep2908.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep821 {
    private Integer keeper = 0;

    Dep821(Dep2909 dep2909, Dep2910 dep2910, Dep2911 dep2911, Dep2912 dep2912, Dep2913 dep2913) {
      this.keeper += dep2909.getKeeper();
      this.keeper += dep2910.getKeeper();
      this.keeper += dep2911.getKeeper();
      this.keeper += dep2912.getKeeper();
      this.keeper += dep2913.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep822 {
    private Integer keeper = 0;

    @Inject
    Dep822(
        Dep2914 dep2914,
        Dep2915 dep2915,
        Dep2916 dep2916,
        Dep2917 dep2917,
        Dep2918 dep2918,
        Dep2919 dep2919) {
      this.keeper += dep2914.getKeeper();
      this.keeper += dep2915.getKeeper();
      this.keeper += dep2916.getKeeper();
      this.keeper += dep2917.getKeeper();
      this.keeper += dep2918.getKeeper();
      this.keeper += dep2919.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep823 {
    private Integer keeper = 0;

    Dep823(Dep2920 dep2920) {
      this.keeper += dep2920.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep824 {
    private Integer keeper = 0;

    @Inject
    Dep824(Dep2921 dep2921) {
      this.keeper += dep2921.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep825 {
    private Integer keeper = 0;

    Dep825(Dep2922 dep2922, Dep2923 dep2923, Dep2924 dep2924, Dep2925 dep2925) {
      this.keeper += dep2922.getKeeper();
      this.keeper += dep2923.getKeeper();
      this.keeper += dep2924.getKeeper();
      this.keeper += dep2925.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep826 {
    private Integer keeper = 0;

    Dep826(Dep2926 dep2926, Dep2927 dep2927, Dep2928 dep2928, Dep2929 dep2929) {
      this.keeper += dep2926.getKeeper();
      this.keeper += dep2927.getKeeper();
      this.keeper += dep2928.getKeeper();
      this.keeper += dep2929.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep827 {
    private Integer keeper = 0;

    Dep827(Dep2930 dep2930, Dep2931 dep2931) {
      this.keeper += dep2930.getKeeper();
      this.keeper += dep2931.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep828 {
    private Integer keeper = 0;

    Dep828(Dep2932 dep2932, Dep2933 dep2933) {
      this.keeper += dep2932.getKeeper();
      this.keeper += dep2933.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep829 {
    private Integer keeper = 0;

    Dep829(Dep2934 dep2934, Dep2935 dep2935, Dep2936 dep2936) {
      this.keeper += dep2934.getKeeper();
      this.keeper += dep2935.getKeeper();
      this.keeper += dep2936.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep830 {
    private Integer keeper = 0;

    @Inject
    Dep830(Dep2937 dep2937, Dep2938 dep2938) {
      this.keeper += dep2937.getKeeper();
      this.keeper += dep2938.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep831 {
    private Integer keeper = 0;

    @Inject
    Dep831(Dep2939 dep2939, Dep2940 dep2940, Dep2941 dep2941, Dep2942 dep2942) {
      this.keeper += dep2939.getKeeper();
      this.keeper += dep2940.getKeeper();
      this.keeper += dep2941.getKeeper();
      this.keeper += dep2942.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep832 {
    private Integer keeper = 0;

    Dep832(Dep2943 dep2943, Dep2944 dep2944, Dep2945 dep2945, Dep2946 dep2946) {
      this.keeper += dep2943.getKeeper();
      this.keeper += dep2944.getKeeper();
      this.keeper += dep2945.getKeeper();
      this.keeper += dep2946.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep833 {
    private Integer keeper = 0;

    @Inject
    Dep833(Dep2947 dep2947) {
      this.keeper += dep2947.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep834 {
    private Integer keeper = 0;

    @Inject
    Dep834(Dep2948 dep2948, Dep2949 dep2949, Dep2950 dep2950, Dep2951 dep2951) {
      this.keeper += dep2948.getKeeper();
      this.keeper += dep2949.getKeeper();
      this.keeper += dep2950.getKeeper();
      this.keeper += dep2951.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep835 {
    private Integer keeper = 0;

    Dep835(Dep2952 dep2952, Dep2953 dep2953) {
      this.keeper += dep2952.getKeeper();
      this.keeper += dep2953.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep836 {
    private Integer keeper = 0;

    Dep836(Dep2954 dep2954, Dep2955 dep2955, Dep2956 dep2956) {
      this.keeper += dep2954.getKeeper();
      this.keeper += dep2955.getKeeper();
      this.keeper += dep2956.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep837 {
    private Integer keeper = 0;

    @Inject
    Dep837(Dep2957 dep2957) {
      this.keeper += dep2957.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep838 {
    private Integer keeper = 0;

    @Inject
    Dep838(Dep2958 dep2958) {
      this.keeper += dep2958.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep839 {
    private Integer keeper = 0;

    @Inject
    Dep839(Dep2959 dep2959, Dep2960 dep2960, Dep2961 dep2961, Dep2962 dep2962) {
      this.keeper += dep2959.getKeeper();
      this.keeper += dep2960.getKeeper();
      this.keeper += dep2961.getKeeper();
      this.keeper += dep2962.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep840 {
    private Integer keeper = 0;

    Dep840(Dep2963 dep2963) {
      this.keeper += dep2963.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep841 {
    private Integer keeper = 0;

    @Inject
    Dep841(Dep2964 dep2964, Dep2965 dep2965, Dep2966 dep2966, Dep2967 dep2967, Dep2968 dep2968) {
      this.keeper += dep2964.getKeeper();
      this.keeper += dep2965.getKeeper();
      this.keeper += dep2966.getKeeper();
      this.keeper += dep2967.getKeeper();
      this.keeper += dep2968.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep842 {
    private Integer keeper = 0;

    @Inject
    Dep842(Dep2969 dep2969, Dep2970 dep2970) {
      this.keeper += dep2969.getKeeper();
      this.keeper += dep2970.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep843 {
    private Integer keeper = 0;

    Dep843(Dep2971 dep2971, Dep2972 dep2972) {
      this.keeper += dep2971.getKeeper();
      this.keeper += dep2972.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep844 {
    private Integer keeper = 0;

    @Inject
    Dep844(
        Dep2973 dep2973,
        Dep2974 dep2974,
        Dep2975 dep2975,
        Dep2976 dep2976,
        Dep2977 dep2977,
        Dep2978 dep2978) {
      this.keeper += dep2973.getKeeper();
      this.keeper += dep2974.getKeeper();
      this.keeper += dep2975.getKeeper();
      this.keeper += dep2976.getKeeper();
      this.keeper += dep2977.getKeeper();
      this.keeper += dep2978.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep845 {
    private Integer keeper = 0;

    Dep845(Dep2979 dep2979, Dep2980 dep2980) {
      this.keeper += dep2979.getKeeper();
      this.keeper += dep2980.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep846 {
    private Integer keeper = 0;

    @Inject
    Dep846(Dep2981 dep2981, Dep2982 dep2982) {
      this.keeper += dep2981.getKeeper();
      this.keeper += dep2982.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep847 {
    private Integer keeper = 0;

    Dep847(Dep2983 dep2983) {
      this.keeper += dep2983.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep848 {
    private Integer keeper = 0;

    @Inject
    Dep848(
        Dep2984 dep2984,
        Dep2985 dep2985,
        Dep2986 dep2986,
        Dep2987 dep2987,
        Dep2988 dep2988,
        Dep2989 dep2989) {
      this.keeper += dep2984.getKeeper();
      this.keeper += dep2985.getKeeper();
      this.keeper += dep2986.getKeeper();
      this.keeper += dep2987.getKeeper();
      this.keeper += dep2988.getKeeper();
      this.keeper += dep2989.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep849 {
    private Integer keeper = 0;

    Dep849(Dep2990 dep2990, Dep2991 dep2991) {
      this.keeper += dep2990.getKeeper();
      this.keeper += dep2991.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep850 {
    private Integer keeper = 0;

    Dep850(Dep2992 dep2992, Dep2993 dep2993) {
      this.keeper += dep2992.getKeeper();
      this.keeper += dep2993.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep851 {
    private Integer keeper = 0;

    Dep851(Dep2994 dep2994) {
      this.keeper += dep2994.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep852 {
    private Integer keeper = 0;

    @Inject
    Dep852(Dep2995 dep2995, Dep2996 dep2996, Dep2997 dep2997) {
      this.keeper += dep2995.getKeeper();
      this.keeper += dep2996.getKeeper();
      this.keeper += dep2997.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep853 {
    private Integer keeper = 0;

    Dep853(Dep2998 dep2998, Dep2999 dep2999, Dep3000 dep3000) {
      this.keeper += dep2998.getKeeper();
      this.keeper += dep2999.getKeeper();
      this.keeper += dep3000.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep854 {
    private Integer keeper = 0;

    Dep854(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep855 {
    private Integer keeper = 0;

    Dep855(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep856 {
    private Integer keeper = 0;

    Dep856(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep857 {
    private Integer keeper = 0;

    @Inject
    Dep857(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep858 {
    private Integer keeper = 0;

    @Inject
    Dep858(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep859 {
    private Integer keeper = 0;

    @Inject
    Dep859(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep860 {
    private Integer keeper = 0;

    Dep860(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep861 {
    private Integer keeper = 0;

    Dep861(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep862 {
    private Integer keeper = 0;

    @Inject
    Dep862(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep863 {
    private Integer keeper = 0;

    Dep863(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep864 {
    private Integer keeper = 0;

    @Inject
    Dep864(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep865 {
    private Integer keeper = 0;

    @Inject
    Dep865(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep866 {
    private Integer keeper = 0;

    Dep866(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep867 {
    private Integer keeper = 0;

    Dep867(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep868 {
    private Integer keeper = 0;

    Dep868(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep869 {
    private Integer keeper = 0;

    @Inject
    Dep869(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep870 {
    private Integer keeper = 0;

    @Inject
    Dep870(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep871 {
    private Integer keeper = 0;

    Dep871(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep872 {
    private Integer keeper = 0;

    @Inject
    Dep872(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep873 {
    private Integer keeper = 0;

    Dep873(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep874 {
    private Integer keeper = 0;

    @Inject
    Dep874(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep875 {
    private Integer keeper = 0;

    Dep875(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep876 {
    private Integer keeper = 0;

    Dep876(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep877 {
    private Integer keeper = 0;

    Dep877(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep878 {
    private Integer keeper = 0;

    @Inject
    Dep878(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep879 {
    private Integer keeper = 0;

    Dep879(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep880 {
    private Integer keeper = 0;

    Dep880(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep881 {
    private Integer keeper = 0;

    Dep881(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep882 {
    private Integer keeper = 0;

    Dep882(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep883 {
    private Integer keeper = 0;

    Dep883(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep884 {
    private Integer keeper = 0;

    @Inject
    Dep884(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep885 {
    private Integer keeper = 0;

    Dep885(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep886 {
    private Integer keeper = 0;

    Dep886(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep887 {
    private Integer keeper = 0;

    @Inject
    Dep887(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep888 {
    private Integer keeper = 0;

    @Inject
    Dep888(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep889 {
    private Integer keeper = 0;

    @Inject
    Dep889(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep890 {
    private Integer keeper = 0;

    Dep890(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep891 {
    private Integer keeper = 0;

    @Inject
    Dep891(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep892 {
    private Integer keeper = 0;

    Dep892(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep893 {
    private Integer keeper = 0;

    Dep893(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep894 {
    private Integer keeper = 0;

    @Inject
    Dep894(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep895 {
    private Integer keeper = 0;

    @Inject
    Dep895(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep896 {
    private Integer keeper = 0;

    @Inject
    Dep896(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep897 {
    private Integer keeper = 0;

    @Inject
    Dep897(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep898 {
    private Integer keeper = 0;

    @Inject
    Dep898(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep899 {
    private Integer keeper = 0;

    @Inject
    Dep899(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep900 {
    private Integer keeper = 0;

    @Inject
    Dep900(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep901 {
    private Integer keeper = 0;

    Dep901(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep902 {
    private Integer keeper = 0;

    Dep902(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep903 {
    private Integer keeper = 0;

    @Inject
    Dep903(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep904 {
    private Integer keeper = 0;

    @Inject
    Dep904(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep905 {
    private Integer keeper = 0;

    Dep905(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep906 {
    private Integer keeper = 0;

    Dep906(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep907 {
    private Integer keeper = 0;

    @Inject
    Dep907(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep908 {
    private Integer keeper = 0;

    @Inject
    Dep908(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep909 {
    private Integer keeper = 0;

    @Inject
    Dep909(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep910 {
    private Integer keeper = 0;

    @Inject
    Dep910(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep911 {
    private Integer keeper = 0;

    Dep911(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep912 {
    private Integer keeper = 0;

    Dep912(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep913 {
    private Integer keeper = 0;

    Dep913(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep914 {
    private Integer keeper = 0;

    Dep914(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep915 {
    private Integer keeper = 0;

    @Inject
    Dep915(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep916 {
    private Integer keeper = 0;

    Dep916(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep917 {
    private Integer keeper = 0;

    Dep917(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep918 {
    private Integer keeper = 0;

    Dep918(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep919 {
    private Integer keeper = 0;

    Dep919(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep920 {
    private Integer keeper = 0;

    Dep920(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep921 {
    private Integer keeper = 0;

    Dep921(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep922 {
    private Integer keeper = 0;

    Dep922(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep923 {
    private Integer keeper = 0;

    @Inject
    Dep923(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep924 {
    private Integer keeper = 0;

    @Inject
    Dep924(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep925 {
    private Integer keeper = 0;

    Dep925(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep926 {
    private Integer keeper = 0;

    @Inject
    Dep926(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep927 {
    private Integer keeper = 0;

    Dep927(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep928 {
    private Integer keeper = 0;

    @Inject
    Dep928(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep929 {
    private Integer keeper = 0;

    @Inject
    Dep929(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep930 {
    private Integer keeper = 0;

    @Inject
    Dep930(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep931 {
    private Integer keeper = 0;

    @Inject
    Dep931(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep932 {
    private Integer keeper = 0;

    @Inject
    Dep932(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep933 {
    private Integer keeper = 0;

    Dep933(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep934 {
    private Integer keeper = 0;

    Dep934(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep935 {
    private Integer keeper = 0;

    @Inject
    Dep935(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep936 {
    private Integer keeper = 0;

    @Inject
    Dep936(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep937 {
    private Integer keeper = 0;

    Dep937(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep938 {
    private Integer keeper = 0;

    @Inject
    Dep938(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep939 {
    private Integer keeper = 0;

    Dep939(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep940 {
    private Integer keeper = 0;

    Dep940(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep941 {
    private Integer keeper = 0;

    @Inject
    Dep941(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep942 {
    private Integer keeper = 0;

    @Inject
    Dep942(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep943 {
    private Integer keeper = 0;

    Dep943(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep944 {
    private Integer keeper = 0;

    Dep944(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep945 {
    private Integer keeper = 0;

    @Inject
    Dep945(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep946 {
    private Integer keeper = 0;

    @Inject
    Dep946(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep947 {
    private Integer keeper = 0;

    @Inject
    Dep947(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep948 {
    private Integer keeper = 0;

    Dep948(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep949 {
    private Integer keeper = 0;

    Dep949(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep950 {
    private Integer keeper = 0;

    Dep950(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep951 {
    private Integer keeper = 0;

    Dep951(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep952 {
    private Integer keeper = 0;

    Dep952(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep953 {
    private Integer keeper = 0;

    @Inject
    Dep953(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep954 {
    private Integer keeper = 0;

    Dep954(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep955 {
    private Integer keeper = 0;

    Dep955(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep956 {
    private Integer keeper = 0;

    @Inject
    Dep956(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep957 {
    private Integer keeper = 0;

    Dep957(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep958 {
    private Integer keeper = 0;

    @Inject
    Dep958(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep959 {
    private Integer keeper = 0;

    @Inject
    Dep959(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep960 {
    private Integer keeper = 0;

    @Inject
    Dep960(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep961 {
    private Integer keeper = 0;

    @Inject
    Dep961(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep962 {
    private Integer keeper = 0;

    @Inject
    Dep962(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep963 {
    private Integer keeper = 0;

    @Inject
    Dep963(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep964 {
    private Integer keeper = 0;

    Dep964(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep965 {
    private Integer keeper = 0;

    @Inject
    Dep965(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep966 {
    private Integer keeper = 0;

    Dep966(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep967 {
    private Integer keeper = 0;

    Dep967(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep968 {
    private Integer keeper = 0;

    Dep968(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep969 {
    private Integer keeper = 0;

    @Inject
    Dep969(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep970 {
    private Integer keeper = 0;

    Dep970(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep971 {
    private Integer keeper = 0;

    Dep971(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep972 {
    private Integer keeper = 0;

    @Inject
    Dep972(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep973 {
    private Integer keeper = 0;

    Dep973(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep974 {
    private Integer keeper = 0;

    Dep974(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep975 {
    private Integer keeper = 0;

    Dep975(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep976 {
    private Integer keeper = 0;

    Dep976(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep977 {
    private Integer keeper = 0;

    @Inject
    Dep977(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep978 {
    private Integer keeper = 0;

    @Inject
    Dep978(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep979 {
    private Integer keeper = 0;

    @Inject
    Dep979(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep980 {
    private Integer keeper = 0;

    Dep980(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep981 {
    private Integer keeper = 0;

    Dep981(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep982 {
    private Integer keeper = 0;

    @Inject
    Dep982(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep983 {
    private Integer keeper = 0;

    @Inject
    Dep983(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep984 {
    private Integer keeper = 0;

    Dep984(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep985 {
    private Integer keeper = 0;

    @Inject
    Dep985(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep986 {
    private Integer keeper = 0;

    @Inject
    Dep986(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep987 {
    private Integer keeper = 0;

    Dep987(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep988 {
    private Integer keeper = 0;

    @Inject
    Dep988(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep989 {
    private Integer keeper = 0;

    Dep989(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep990 {
    private Integer keeper = 0;

    @Inject
    Dep990(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep991 {
    private Integer keeper = 0;

    @Inject
    Dep991(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep992 {
    private Integer keeper = 0;

    Dep992(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep993 {
    private Integer keeper = 0;

    Dep993(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep994 {
    private Integer keeper = 0;

    @Inject
    Dep994(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep995 {
    private Integer keeper = 0;

    @Inject
    Dep995(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep996 {
    private Integer keeper = 0;

    Dep996(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep997 {
    private Integer keeper = 0;

    Dep997(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep998 {
    private Integer keeper = 0;

    Dep998(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep999 {
    private Integer keeper = 0;

    Dep999(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1000 {
    private Integer keeper = 0;

    Dep1000(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1001 {
    private Integer keeper = 0;

    Dep1001(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1002 {
    private Integer keeper = 0;

    @Inject
    Dep1002(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1003 {
    private Integer keeper = 0;

    @Inject
    Dep1003(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1004 {
    private Integer keeper = 0;

    @Inject
    Dep1004(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1005 {
    private Integer keeper = 0;

    @Inject
    Dep1005(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1006 {
    private Integer keeper = 0;

    Dep1006(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1007 {
    private Integer keeper = 0;

    @Inject
    Dep1007(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1008 {
    private Integer keeper = 0;

    @Inject
    Dep1008(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1009 {
    private Integer keeper = 0;

    Dep1009(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1010 {
    private Integer keeper = 0;

    @Inject
    Dep1010(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1011 {
    private Integer keeper = 0;

    @Inject
    Dep1011(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1012 {
    private Integer keeper = 0;

    @Inject
    Dep1012(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1013 {
    private Integer keeper = 0;

    @Inject
    Dep1013(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1014 {
    private Integer keeper = 0;

    @Inject
    Dep1014(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1015 {
    private Integer keeper = 0;

    @Inject
    Dep1015(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1016 {
    private Integer keeper = 0;

    @Inject
    Dep1016(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1017 {
    private Integer keeper = 0;

    @Inject
    Dep1017(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1018 {
    private Integer keeper = 0;

    @Inject
    Dep1018(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1019 {
    private Integer keeper = 0;

    Dep1019(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1020 {
    private Integer keeper = 0;

    @Inject
    Dep1020(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1021 {
    private Integer keeper = 0;

    Dep1021(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1022 {
    private Integer keeper = 0;

    @Inject
    Dep1022(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1023 {
    private Integer keeper = 0;

    Dep1023(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1024 {
    private Integer keeper = 0;

    Dep1024(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1025 {
    private Integer keeper = 0;

    Dep1025(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1026 {
    private Integer keeper = 0;

    @Inject
    Dep1026(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1027 {
    private Integer keeper = 0;

    Dep1027(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1028 {
    private Integer keeper = 0;

    Dep1028(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1029 {
    private Integer keeper = 0;

    Dep1029(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1030 {
    private Integer keeper = 0;

    @Inject
    Dep1030(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1031 {
    private Integer keeper = 0;

    @Inject
    Dep1031(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1032 {
    private Integer keeper = 0;

    @Inject
    Dep1032(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1033 {
    private Integer keeper = 0;

    Dep1033(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1034 {
    private Integer keeper = 0;

    @Inject
    Dep1034(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1035 {
    private Integer keeper = 0;

    @Inject
    Dep1035(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1036 {
    private Integer keeper = 0;

    @Inject
    Dep1036(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1037 {
    private Integer keeper = 0;

    @Inject
    Dep1037(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1038 {
    private Integer keeper = 0;

    Dep1038(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1039 {
    private Integer keeper = 0;

    Dep1039(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1040 {
    private Integer keeper = 0;

    @Inject
    Dep1040(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1041 {
    private Integer keeper = 0;

    @Inject
    Dep1041(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1042 {
    private Integer keeper = 0;

    @Inject
    Dep1042(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1043 {
    private Integer keeper = 0;

    @Inject
    Dep1043(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1044 {
    private Integer keeper = 0;

    @Inject
    Dep1044(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1045 {
    private Integer keeper = 0;

    Dep1045(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1046 {
    private Integer keeper = 0;

    Dep1046(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1047 {
    private Integer keeper = 0;

    Dep1047(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1048 {
    private Integer keeper = 0;

    Dep1048(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1049 {
    private Integer keeper = 0;

    @Inject
    Dep1049(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1050 {
    private Integer keeper = 0;

    @Inject
    Dep1050(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1051 {
    private Integer keeper = 0;

    @Inject
    Dep1051(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1052 {
    private Integer keeper = 0;

    Dep1052(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1053 {
    private Integer keeper = 0;

    Dep1053(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1054 {
    private Integer keeper = 0;

    Dep1054(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1055 {
    private Integer keeper = 0;

    Dep1055(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1056 {
    private Integer keeper = 0;

    @Inject
    Dep1056(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1057 {
    private Integer keeper = 0;

    @Inject
    Dep1057(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1058 {
    private Integer keeper = 0;

    Dep1058(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1059 {
    private Integer keeper = 0;

    Dep1059(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1060 {
    private Integer keeper = 0;

    @Inject
    Dep1060(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1061 {
    private Integer keeper = 0;

    Dep1061(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1062 {
    private Integer keeper = 0;

    Dep1062(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1063 {
    private Integer keeper = 0;

    Dep1063(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1064 {
    private Integer keeper = 0;

    @Inject
    Dep1064(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1065 {
    private Integer keeper = 0;

    Dep1065(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1066 {
    private Integer keeper = 0;

    @Inject
    Dep1066(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1067 {
    private Integer keeper = 0;

    @Inject
    Dep1067(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1068 {
    private Integer keeper = 0;

    @Inject
    Dep1068(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1069 {
    private Integer keeper = 0;

    @Inject
    Dep1069(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1070 {
    private Integer keeper = 0;

    @Inject
    Dep1070(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1071 {
    private Integer keeper = 0;

    Dep1071(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1072 {
    private Integer keeper = 0;

    @Inject
    Dep1072(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1073 {
    private Integer keeper = 0;

    Dep1073(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1074 {
    private Integer keeper = 0;

    Dep1074(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1075 {
    private Integer keeper = 0;

    @Inject
    Dep1075(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1076 {
    private Integer keeper = 0;

    @Inject
    Dep1076(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1077 {
    private Integer keeper = 0;

    @Inject
    Dep1077(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1078 {
    private Integer keeper = 0;

    Dep1078(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1079 {
    private Integer keeper = 0;

    Dep1079(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1080 {
    private Integer keeper = 0;

    Dep1080(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1081 {
    private Integer keeper = 0;

    @Inject
    Dep1081(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1082 {
    private Integer keeper = 0;

    @Inject
    Dep1082(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1083 {
    private Integer keeper = 0;

    @Inject
    Dep1083(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1084 {
    private Integer keeper = 0;

    @Inject
    Dep1084(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1085 {
    private Integer keeper = 0;

    @Inject
    Dep1085(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1086 {
    private Integer keeper = 0;

    @Inject
    Dep1086(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1087 {
    private Integer keeper = 0;

    @Inject
    Dep1087(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1088 {
    private Integer keeper = 0;

    @Inject
    Dep1088(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1089 {
    private Integer keeper = 0;

    @Inject
    Dep1089(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1090 {
    private Integer keeper = 0;

    @Inject
    Dep1090(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1091 {
    private Integer keeper = 0;

    Dep1091(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1092 {
    private Integer keeper = 0;

    @Inject
    Dep1092(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1093 {
    private Integer keeper = 0;

    @Inject
    Dep1093(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1094 {
    private Integer keeper = 0;

    Dep1094(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1095 {
    private Integer keeper = 0;

    @Inject
    Dep1095(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1096 {
    private Integer keeper = 0;

    Dep1096(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1097 {
    private Integer keeper = 0;

    Dep1097(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1098 {
    private Integer keeper = 0;

    Dep1098(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1099 {
    private Integer keeper = 0;

    @Inject
    Dep1099(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1100 {
    private Integer keeper = 0;

    @Inject
    Dep1100(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1101 {
    private Integer keeper = 0;

    @Inject
    Dep1101(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1102 {
    private Integer keeper = 0;

    @Inject
    Dep1102(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1103 {
    private Integer keeper = 0;

    Dep1103(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1104 {
    private Integer keeper = 0;

    @Inject
    Dep1104(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1105 {
    private Integer keeper = 0;

    @Inject
    Dep1105(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1106 {
    private Integer keeper = 0;

    @Inject
    Dep1106(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1107 {
    private Integer keeper = 0;

    Dep1107(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1108 {
    private Integer keeper = 0;

    Dep1108(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1109 {
    private Integer keeper = 0;

    Dep1109(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1110 {
    private Integer keeper = 0;

    Dep1110(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1111 {
    private Integer keeper = 0;

    Dep1111(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1112 {
    private Integer keeper = 0;

    Dep1112(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1113 {
    private Integer keeper = 0;

    @Inject
    Dep1113(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1114 {
    private Integer keeper = 0;

    @Inject
    Dep1114(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1115 {
    private Integer keeper = 0;

    Dep1115(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1116 {
    private Integer keeper = 0;

    @Inject
    Dep1116(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1117 {
    private Integer keeper = 0;

    @Inject
    Dep1117(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1118 {
    private Integer keeper = 0;

    @Inject
    Dep1118(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1119 {
    private Integer keeper = 0;

    Dep1119(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1120 {
    private Integer keeper = 0;

    Dep1120(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1121 {
    private Integer keeper = 0;

    Dep1121(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1122 {
    private Integer keeper = 0;

    Dep1122(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1123 {
    private Integer keeper = 0;

    Dep1123(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1124 {
    private Integer keeper = 0;

    Dep1124(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1125 {
    private Integer keeper = 0;

    @Inject
    Dep1125(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1126 {
    private Integer keeper = 0;

    Dep1126(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1127 {
    private Integer keeper = 0;

    @Inject
    Dep1127(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1128 {
    private Integer keeper = 0;

    Dep1128(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1129 {
    private Integer keeper = 0;

    @Inject
    Dep1129(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1130 {
    private Integer keeper = 0;

    @Inject
    Dep1130(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1131 {
    private Integer keeper = 0;

    Dep1131(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1132 {
    private Integer keeper = 0;

    @Inject
    Dep1132(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1133 {
    private Integer keeper = 0;

    Dep1133(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1134 {
    private Integer keeper = 0;

    @Inject
    Dep1134(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1135 {
    private Integer keeper = 0;

    @Inject
    Dep1135(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1136 {
    private Integer keeper = 0;

    @Inject
    Dep1136(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1137 {
    private Integer keeper = 0;

    Dep1137(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1138 {
    private Integer keeper = 0;

    @Inject
    Dep1138(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1139 {
    private Integer keeper = 0;

    Dep1139(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1140 {
    private Integer keeper = 0;

    Dep1140(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1141 {
    private Integer keeper = 0;

    Dep1141(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1142 {
    private Integer keeper = 0;

    @Inject
    Dep1142(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1143 {
    private Integer keeper = 0;

    @Inject
    Dep1143(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1144 {
    private Integer keeper = 0;

    Dep1144(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1145 {
    private Integer keeper = 0;

    @Inject
    Dep1145(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1146 {
    private Integer keeper = 0;

    Dep1146(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1147 {
    private Integer keeper = 0;

    Dep1147(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1148 {
    private Integer keeper = 0;

    Dep1148(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1149 {
    private Integer keeper = 0;

    Dep1149(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1150 {
    private Integer keeper = 0;

    @Inject
    Dep1150(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1151 {
    private Integer keeper = 0;

    Dep1151(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1152 {
    private Integer keeper = 0;

    Dep1152(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1153 {
    private Integer keeper = 0;

    Dep1153(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1154 {
    private Integer keeper = 0;

    @Inject
    Dep1154(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1155 {
    private Integer keeper = 0;

    Dep1155(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1156 {
    private Integer keeper = 0;

    Dep1156(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1157 {
    private Integer keeper = 0;

    @Inject
    Dep1157(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1158 {
    private Integer keeper = 0;

    Dep1158(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1159 {
    private Integer keeper = 0;

    Dep1159(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1160 {
    private Integer keeper = 0;

    Dep1160(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1161 {
    private Integer keeper = 0;

    Dep1161(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1162 {
    private Integer keeper = 0;

    @Inject
    Dep1162(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1163 {
    private Integer keeper = 0;

    Dep1163(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1164 {
    private Integer keeper = 0;

    Dep1164(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1165 {
    private Integer keeper = 0;

    @Inject
    Dep1165(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1166 {
    private Integer keeper = 0;

    Dep1166(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1167 {
    private Integer keeper = 0;

    Dep1167(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1168 {
    private Integer keeper = 0;

    Dep1168(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1169 {
    private Integer keeper = 0;

    Dep1169(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1170 {
    private Integer keeper = 0;

    Dep1170(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1171 {
    private Integer keeper = 0;

    Dep1171(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1172 {
    private Integer keeper = 0;

    @Inject
    Dep1172(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1173 {
    private Integer keeper = 0;

    @Inject
    Dep1173(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1174 {
    private Integer keeper = 0;

    @Inject
    Dep1174(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1175 {
    private Integer keeper = 0;

    Dep1175(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1176 {
    private Integer keeper = 0;

    Dep1176(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1177 {
    private Integer keeper = 0;

    Dep1177(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1178 {
    private Integer keeper = 0;

    Dep1178(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1179 {
    private Integer keeper = 0;

    @Inject
    Dep1179(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1180 {
    private Integer keeper = 0;

    Dep1180(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1181 {
    private Integer keeper = 0;

    @Inject
    Dep1181(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1182 {
    private Integer keeper = 0;

    @Inject
    Dep1182(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1183 {
    private Integer keeper = 0;

    @Inject
    Dep1183(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1184 {
    private Integer keeper = 0;

    Dep1184(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1185 {
    private Integer keeper = 0;

    Dep1185(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1186 {
    private Integer keeper = 0;

    Dep1186(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1187 {
    private Integer keeper = 0;

    @Inject
    Dep1187(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1188 {
    private Integer keeper = 0;

    @Inject
    Dep1188(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1189 {
    private Integer keeper = 0;

    Dep1189(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1190 {
    private Integer keeper = 0;

    Dep1190(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1191 {
    private Integer keeper = 0;

    @Inject
    Dep1191(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1192 {
    private Integer keeper = 0;

    @Inject
    Dep1192(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1193 {
    private Integer keeper = 0;

    Dep1193(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1194 {
    private Integer keeper = 0;

    Dep1194(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1195 {
    private Integer keeper = 0;

    Dep1195(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1196 {
    private Integer keeper = 0;

    Dep1196(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1197 {
    private Integer keeper = 0;

    Dep1197(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1198 {
    private Integer keeper = 0;

    @Inject
    Dep1198(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1199 {
    private Integer keeper = 0;

    Dep1199(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1200 {
    private Integer keeper = 0;

    @Inject
    Dep1200(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1201 {
    private Integer keeper = 0;

    @Inject
    Dep1201(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1202 {
    private Integer keeper = 0;

    @Inject
    Dep1202(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1203 {
    private Integer keeper = 0;

    Dep1203(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1204 {
    private Integer keeper = 0;

    Dep1204(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1205 {
    private Integer keeper = 0;

    @Inject
    Dep1205(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1206 {
    private Integer keeper = 0;

    @Inject
    Dep1206(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1207 {
    private Integer keeper = 0;

    Dep1207(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1208 {
    private Integer keeper = 0;

    Dep1208(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1209 {
    private Integer keeper = 0;

    @Inject
    Dep1209(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1210 {
    private Integer keeper = 0;

    @Inject
    Dep1210(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1211 {
    private Integer keeper = 0;

    Dep1211(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1212 {
    private Integer keeper = 0;

    @Inject
    Dep1212(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1213 {
    private Integer keeper = 0;

    @Inject
    Dep1213(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1214 {
    private Integer keeper = 0;

    @Inject
    Dep1214(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1215 {
    private Integer keeper = 0;

    Dep1215(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1216 {
    private Integer keeper = 0;

    Dep1216(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1217 {
    private Integer keeper = 0;

    Dep1217(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1218 {
    private Integer keeper = 0;

    @Inject
    Dep1218(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1219 {
    private Integer keeper = 0;

    @Inject
    Dep1219(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1220 {
    private Integer keeper = 0;

    Dep1220(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1221 {
    private Integer keeper = 0;

    Dep1221(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1222 {
    private Integer keeper = 0;

    Dep1222(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1223 {
    private Integer keeper = 0;

    Dep1223(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1224 {
    private Integer keeper = 0;

    Dep1224(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1225 {
    private Integer keeper = 0;

    Dep1225(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1226 {
    private Integer keeper = 0;

    @Inject
    Dep1226(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1227 {
    private Integer keeper = 0;

    @Inject
    Dep1227(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1228 {
    private Integer keeper = 0;

    @Inject
    Dep1228(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1229 {
    private Integer keeper = 0;

    Dep1229(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1230 {
    private Integer keeper = 0;

    @Inject
    Dep1230(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1231 {
    private Integer keeper = 0;

    Dep1231(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1232 {
    private Integer keeper = 0;

    @Inject
    Dep1232(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1233 {
    private Integer keeper = 0;

    @Inject
    Dep1233(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1234 {
    private Integer keeper = 0;

    Dep1234(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1235 {
    private Integer keeper = 0;

    @Inject
    Dep1235(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1236 {
    private Integer keeper = 0;

    @Inject
    Dep1236(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1237 {
    private Integer keeper = 0;

    Dep1237(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1238 {
    private Integer keeper = 0;

    @Inject
    Dep1238(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1239 {
    private Integer keeper = 0;

    @Inject
    Dep1239(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1240 {
    private Integer keeper = 0;

    @Inject
    Dep1240(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1241 {
    private Integer keeper = 0;

    @Inject
    Dep1241(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1242 {
    private Integer keeper = 0;

    @Inject
    Dep1242(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1243 {
    private Integer keeper = 0;

    Dep1243(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1244 {
    private Integer keeper = 0;

    Dep1244(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1245 {
    private Integer keeper = 0;

    @Inject
    Dep1245(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1246 {
    private Integer keeper = 0;

    @Inject
    Dep1246(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1247 {
    private Integer keeper = 0;

    @Inject
    Dep1247(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1248 {
    private Integer keeper = 0;

    Dep1248(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1249 {
    private Integer keeper = 0;

    @Inject
    Dep1249(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1250 {
    private Integer keeper = 0;

    Dep1250(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1251 {
    private Integer keeper = 0;

    Dep1251(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1252 {
    private Integer keeper = 0;

    Dep1252(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1253 {
    private Integer keeper = 0;

    @Inject
    Dep1253(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1254 {
    private Integer keeper = 0;

    Dep1254(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1255 {
    private Integer keeper = 0;

    Dep1255(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1256 {
    private Integer keeper = 0;

    @Inject
    Dep1256(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1257 {
    private Integer keeper = 0;

    @Inject
    Dep1257(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1258 {
    private Integer keeper = 0;

    Dep1258(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1259 {
    private Integer keeper = 0;

    @Inject
    Dep1259(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1260 {
    private Integer keeper = 0;

    @Inject
    Dep1260(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1261 {
    private Integer keeper = 0;

    Dep1261(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1262 {
    private Integer keeper = 0;

    @Inject
    Dep1262(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1263 {
    private Integer keeper = 0;

    @Inject
    Dep1263(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1264 {
    private Integer keeper = 0;

    @Inject
    Dep1264(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1265 {
    private Integer keeper = 0;

    @Inject
    Dep1265(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1266 {
    private Integer keeper = 0;

    Dep1266(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1267 {
    private Integer keeper = 0;

    @Inject
    Dep1267(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1268 {
    private Integer keeper = 0;

    @Inject
    Dep1268(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1269 {
    private Integer keeper = 0;

    Dep1269(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1270 {
    private Integer keeper = 0;

    @Inject
    Dep1270(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1271 {
    private Integer keeper = 0;

    Dep1271(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1272 {
    private Integer keeper = 0;

    Dep1272(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1273 {
    private Integer keeper = 0;

    Dep1273(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1274 {
    private Integer keeper = 0;

    @Inject
    Dep1274(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1275 {
    private Integer keeper = 0;

    Dep1275(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1276 {
    private Integer keeper = 0;

    @Inject
    Dep1276(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1277 {
    private Integer keeper = 0;

    Dep1277(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1278 {
    private Integer keeper = 0;

    Dep1278(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1279 {
    private Integer keeper = 0;

    @Inject
    Dep1279(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1280 {
    private Integer keeper = 0;

    Dep1280(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1281 {
    private Integer keeper = 0;

    @Inject
    Dep1281(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1282 {
    private Integer keeper = 0;

    Dep1282(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1283 {
    private Integer keeper = 0;

    Dep1283(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1284 {
    private Integer keeper = 0;

    Dep1284(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1285 {
    private Integer keeper = 0;

    Dep1285(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1286 {
    private Integer keeper = 0;

    Dep1286(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1287 {
    private Integer keeper = 0;

    @Inject
    Dep1287(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1288 {
    private Integer keeper = 0;

    Dep1288(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1289 {
    private Integer keeper = 0;

    @Inject
    Dep1289(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1290 {
    private Integer keeper = 0;

    Dep1290(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1291 {
    private Integer keeper = 0;

    Dep1291(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1292 {
    private Integer keeper = 0;

    @Inject
    Dep1292(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1293 {
    private Integer keeper = 0;

    @Inject
    Dep1293(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1294 {
    private Integer keeper = 0;

    Dep1294(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1295 {
    private Integer keeper = 0;

    @Inject
    Dep1295(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1296 {
    private Integer keeper = 0;

    @Inject
    Dep1296(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1297 {
    private Integer keeper = 0;

    Dep1297(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1298 {
    private Integer keeper = 0;

    Dep1298(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1299 {
    private Integer keeper = 0;

    @Inject
    Dep1299(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1300 {
    private Integer keeper = 0;

    Dep1300(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1301 {
    private Integer keeper = 0;

    Dep1301(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1302 {
    private Integer keeper = 0;

    Dep1302(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1303 {
    private Integer keeper = 0;

    @Inject
    Dep1303(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1304 {
    private Integer keeper = 0;

    @Inject
    Dep1304(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1305 {
    private Integer keeper = 0;

    Dep1305(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1306 {
    private Integer keeper = 0;

    Dep1306(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1307 {
    private Integer keeper = 0;

    Dep1307(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1308 {
    private Integer keeper = 0;

    @Inject
    Dep1308(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1309 {
    private Integer keeper = 0;

    @Inject
    Dep1309(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1310 {
    private Integer keeper = 0;

    @Inject
    Dep1310(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1311 {
    private Integer keeper = 0;

    Dep1311(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1312 {
    private Integer keeper = 0;

    Dep1312(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1313 {
    private Integer keeper = 0;

    @Inject
    Dep1313(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1314 {
    private Integer keeper = 0;

    @Inject
    Dep1314(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1315 {
    private Integer keeper = 0;

    Dep1315(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1316 {
    private Integer keeper = 0;

    @Inject
    Dep1316(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1317 {
    private Integer keeper = 0;

    Dep1317(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1318 {
    private Integer keeper = 0;

    @Inject
    Dep1318(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1319 {
    private Integer keeper = 0;

    Dep1319(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1320 {
    private Integer keeper = 0;

    @Inject
    Dep1320(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1321 {
    private Integer keeper = 0;

    Dep1321(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1322 {
    private Integer keeper = 0;

    Dep1322(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1323 {
    private Integer keeper = 0;

    Dep1323(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1324 {
    private Integer keeper = 0;

    @Inject
    Dep1324(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1325 {
    private Integer keeper = 0;

    @Inject
    Dep1325(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1326 {
    private Integer keeper = 0;

    Dep1326(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1327 {
    private Integer keeper = 0;

    Dep1327(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1328 {
    private Integer keeper = 0;

    Dep1328(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1329 {
    private Integer keeper = 0;

    @Inject
    Dep1329(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1330 {
    private Integer keeper = 0;

    Dep1330(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1331 {
    private Integer keeper = 0;

    @Inject
    Dep1331(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1332 {
    private Integer keeper = 0;

    @Inject
    Dep1332(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1333 {
    private Integer keeper = 0;

    @Inject
    Dep1333(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1334 {
    private Integer keeper = 0;

    Dep1334(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1335 {
    private Integer keeper = 0;

    @Inject
    Dep1335(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1336 {
    private Integer keeper = 0;

    Dep1336(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1337 {
    private Integer keeper = 0;

    @Inject
    Dep1337(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1338 {
    private Integer keeper = 0;

    Dep1338(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1339 {
    private Integer keeper = 0;

    Dep1339(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1340 {
    private Integer keeper = 0;

    Dep1340(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1341 {
    private Integer keeper = 0;

    @Inject
    Dep1341(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1342 {
    private Integer keeper = 0;

    @Inject
    Dep1342(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1343 {
    private Integer keeper = 0;

    Dep1343(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1344 {
    private Integer keeper = 0;

    @Inject
    Dep1344(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1345 {
    private Integer keeper = 0;

    @Inject
    Dep1345(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1346 {
    private Integer keeper = 0;

    @Inject
    Dep1346(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1347 {
    private Integer keeper = 0;

    @Inject
    Dep1347(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1348 {
    private Integer keeper = 0;

    @Inject
    Dep1348(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1349 {
    private Integer keeper = 0;

    Dep1349(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1350 {
    private Integer keeper = 0;

    Dep1350(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1351 {
    private Integer keeper = 0;

    Dep1351(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1352 {
    private Integer keeper = 0;

    @Inject
    Dep1352(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1353 {
    private Integer keeper = 0;

    @Inject
    Dep1353(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1354 {
    private Integer keeper = 0;

    Dep1354(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1355 {
    private Integer keeper = 0;

    Dep1355(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1356 {
    private Integer keeper = 0;

    Dep1356(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1357 {
    private Integer keeper = 0;

    Dep1357(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1358 {
    private Integer keeper = 0;

    Dep1358(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1359 {
    private Integer keeper = 0;

    @Inject
    Dep1359(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1360 {
    private Integer keeper = 0;

    @Inject
    Dep1360(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1361 {
    private Integer keeper = 0;

    Dep1361(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1362 {
    private Integer keeper = 0;

    @Inject
    Dep1362(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1363 {
    private Integer keeper = 0;

    @Inject
    Dep1363(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1364 {
    private Integer keeper = 0;

    Dep1364(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1365 {
    private Integer keeper = 0;

    @Inject
    Dep1365(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1366 {
    private Integer keeper = 0;

    @Inject
    Dep1366(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1367 {
    private Integer keeper = 0;

    @Inject
    Dep1367(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1368 {
    private Integer keeper = 0;

    @Inject
    Dep1368(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1369 {
    private Integer keeper = 0;

    @Inject
    Dep1369(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1370 {
    private Integer keeper = 0;

    @Inject
    Dep1370(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1371 {
    private Integer keeper = 0;

    @Inject
    Dep1371(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1372 {
    private Integer keeper = 0;

    @Inject
    Dep1372(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1373 {
    private Integer keeper = 0;

    @Inject
    Dep1373(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1374 {
    private Integer keeper = 0;

    @Inject
    Dep1374(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1375 {
    private Integer keeper = 0;

    @Inject
    Dep1375(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1376 {
    private Integer keeper = 0;

    Dep1376(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1377 {
    private Integer keeper = 0;

    @Inject
    Dep1377(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1378 {
    private Integer keeper = 0;

    Dep1378(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1379 {
    private Integer keeper = 0;

    @Inject
    Dep1379(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1380 {
    private Integer keeper = 0;

    Dep1380(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1381 {
    private Integer keeper = 0;

    Dep1381(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1382 {
    private Integer keeper = 0;

    Dep1382(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1383 {
    private Integer keeper = 0;

    @Inject
    Dep1383(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1384 {
    private Integer keeper = 0;

    Dep1384(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1385 {
    private Integer keeper = 0;

    Dep1385(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1386 {
    private Integer keeper = 0;

    Dep1386(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1387 {
    private Integer keeper = 0;

    Dep1387(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1388 {
    private Integer keeper = 0;

    Dep1388(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1389 {
    private Integer keeper = 0;

    Dep1389(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1390 {
    private Integer keeper = 0;

    @Inject
    Dep1390(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1391 {
    private Integer keeper = 0;

    Dep1391(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1392 {
    private Integer keeper = 0;

    @Inject
    Dep1392(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1393 {
    private Integer keeper = 0;

    @Inject
    Dep1393(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1394 {
    private Integer keeper = 0;

    @Inject
    Dep1394(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1395 {
    private Integer keeper = 0;

    @Inject
    Dep1395(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1396 {
    private Integer keeper = 0;

    Dep1396(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1397 {
    private Integer keeper = 0;

    Dep1397(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1398 {
    private Integer keeper = 0;

    @Inject
    Dep1398(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1399 {
    private Integer keeper = 0;

    @Inject
    Dep1399(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1400 {
    private Integer keeper = 0;

    @Inject
    Dep1400(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1401 {
    private Integer keeper = 0;

    @Inject
    Dep1401(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1402 {
    private Integer keeper = 0;

    Dep1402(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1403 {
    private Integer keeper = 0;

    @Inject
    Dep1403(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1404 {
    private Integer keeper = 0;

    Dep1404(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1405 {
    private Integer keeper = 0;

    @Inject
    Dep1405(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1406 {
    private Integer keeper = 0;

    Dep1406(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1407 {
    private Integer keeper = 0;

    @Inject
    Dep1407(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1408 {
    private Integer keeper = 0;

    Dep1408(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1409 {
    private Integer keeper = 0;

    Dep1409(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1410 {
    private Integer keeper = 0;

    @Inject
    Dep1410(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1411 {
    private Integer keeper = 0;

    @Inject
    Dep1411(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1412 {
    private Integer keeper = 0;

    Dep1412(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1413 {
    private Integer keeper = 0;

    @Inject
    Dep1413(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1414 {
    private Integer keeper = 0;

    @Inject
    Dep1414(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1415 {
    private Integer keeper = 0;

    Dep1415(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1416 {
    private Integer keeper = 0;

    Dep1416(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1417 {
    private Integer keeper = 0;

    @Inject
    Dep1417(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1418 {
    private Integer keeper = 0;

    Dep1418(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1419 {
    private Integer keeper = 0;

    Dep1419(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1420 {
    private Integer keeper = 0;

    @Inject
    Dep1420(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1421 {
    private Integer keeper = 0;

    Dep1421(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1422 {
    private Integer keeper = 0;

    Dep1422(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1423 {
    private Integer keeper = 0;

    @Inject
    Dep1423(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1424 {
    private Integer keeper = 0;

    Dep1424(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1425 {
    private Integer keeper = 0;

    Dep1425(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1426 {
    private Integer keeper = 0;

    Dep1426(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1427 {
    private Integer keeper = 0;

    @Inject
    Dep1427(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1428 {
    private Integer keeper = 0;

    Dep1428(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1429 {
    private Integer keeper = 0;

    @Inject
    Dep1429(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1430 {
    private Integer keeper = 0;

    Dep1430(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1431 {
    private Integer keeper = 0;

    Dep1431(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1432 {
    private Integer keeper = 0;

    Dep1432(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1433 {
    private Integer keeper = 0;

    @Inject
    Dep1433(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1434 {
    private Integer keeper = 0;

    Dep1434(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1435 {
    private Integer keeper = 0;

    Dep1435(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1436 {
    private Integer keeper = 0;

    @Inject
    Dep1436(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1437 {
    private Integer keeper = 0;

    @Inject
    Dep1437(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1438 {
    private Integer keeper = 0;

    @Inject
    Dep1438(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1439 {
    private Integer keeper = 0;

    Dep1439(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1440 {
    private Integer keeper = 0;

    @Inject
    Dep1440(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1441 {
    private Integer keeper = 0;

    @Inject
    Dep1441(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1442 {
    private Integer keeper = 0;

    @Inject
    Dep1442(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1443 {
    private Integer keeper = 0;

    Dep1443(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1444 {
    private Integer keeper = 0;

    @Inject
    Dep1444(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1445 {
    private Integer keeper = 0;

    @Inject
    Dep1445(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1446 {
    private Integer keeper = 0;

    @Inject
    Dep1446(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1447 {
    private Integer keeper = 0;

    @Inject
    Dep1447(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1448 {
    private Integer keeper = 0;

    Dep1448(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1449 {
    private Integer keeper = 0;

    Dep1449(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1450 {
    private Integer keeper = 0;

    Dep1450(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1451 {
    private Integer keeper = 0;

    @Inject
    Dep1451(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1452 {
    private Integer keeper = 0;

    @Inject
    Dep1452(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1453 {
    private Integer keeper = 0;

    Dep1453(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1454 {
    private Integer keeper = 0;

    Dep1454(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1455 {
    private Integer keeper = 0;

    @Inject
    Dep1455(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1456 {
    private Integer keeper = 0;

    @Inject
    Dep1456(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1457 {
    private Integer keeper = 0;

    Dep1457(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1458 {
    private Integer keeper = 0;

    @Inject
    Dep1458(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1459 {
    private Integer keeper = 0;

    @Inject
    Dep1459(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1460 {
    private Integer keeper = 0;

    Dep1460(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1461 {
    private Integer keeper = 0;

    @Inject
    Dep1461(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1462 {
    private Integer keeper = 0;

    @Inject
    Dep1462(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1463 {
    private Integer keeper = 0;

    @Inject
    Dep1463(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1464 {
    private Integer keeper = 0;

    @Inject
    Dep1464(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1465 {
    private Integer keeper = 0;

    @Inject
    Dep1465(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1466 {
    private Integer keeper = 0;

    @Inject
    Dep1466(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1467 {
    private Integer keeper = 0;

    Dep1467(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1468 {
    private Integer keeper = 0;

    Dep1468(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1469 {
    private Integer keeper = 0;

    Dep1469(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1470 {
    private Integer keeper = 0;

    Dep1470(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1471 {
    private Integer keeper = 0;

    Dep1471(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1472 {
    private Integer keeper = 0;

    Dep1472(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1473 {
    private Integer keeper = 0;

    @Inject
    Dep1473(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1474 {
    private Integer keeper = 0;

    Dep1474(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1475 {
    private Integer keeper = 0;

    @Inject
    Dep1475(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1476 {
    private Integer keeper = 0;

    @Inject
    Dep1476(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1477 {
    private Integer keeper = 0;

    Dep1477(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1478 {
    private Integer keeper = 0;

    Dep1478(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1479 {
    private Integer keeper = 0;

    Dep1479(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1480 {
    private Integer keeper = 0;

    @Inject
    Dep1480(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1481 {
    private Integer keeper = 0;

    Dep1481(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1482 {
    private Integer keeper = 0;

    Dep1482(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1483 {
    private Integer keeper = 0;

    Dep1483(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1484 {
    private Integer keeper = 0;

    Dep1484(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1485 {
    private Integer keeper = 0;

    Dep1485(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1486 {
    private Integer keeper = 0;

    Dep1486(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1487 {
    private Integer keeper = 0;

    Dep1487(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1488 {
    private Integer keeper = 0;

    Dep1488(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1489 {
    private Integer keeper = 0;

    Dep1489(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1490 {
    private Integer keeper = 0;

    @Inject
    Dep1490(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1491 {
    private Integer keeper = 0;

    @Inject
    Dep1491(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1492 {
    private Integer keeper = 0;

    @Inject
    Dep1492(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1493 {
    private Integer keeper = 0;

    Dep1493(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1494 {
    private Integer keeper = 0;

    @Inject
    Dep1494(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1495 {
    private Integer keeper = 0;

    @Inject
    Dep1495(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1496 {
    private Integer keeper = 0;

    @Inject
    Dep1496(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1497 {
    private Integer keeper = 0;

    Dep1497(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1498 {
    private Integer keeper = 0;

    Dep1498(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1499 {
    private Integer keeper = 0;

    @Inject
    Dep1499(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1500 {
    private Integer keeper = 0;

    Dep1500(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1501 {
    private Integer keeper = 0;

    Dep1501(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1502 {
    private Integer keeper = 0;

    Dep1502(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1503 {
    private Integer keeper = 0;

    Dep1503(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1504 {
    private Integer keeper = 0;

    Dep1504(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1505 {
    private Integer keeper = 0;

    @Inject
    Dep1505(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1506 {
    private Integer keeper = 0;

    Dep1506(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1507 {
    private Integer keeper = 0;

    Dep1507(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1508 {
    private Integer keeper = 0;

    Dep1508(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1509 {
    private Integer keeper = 0;

    @Inject
    Dep1509(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1510 {
    private Integer keeper = 0;

    @Inject
    Dep1510(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1511 {
    private Integer keeper = 0;

    Dep1511(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1512 {
    private Integer keeper = 0;

    Dep1512(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1513 {
    private Integer keeper = 0;

    Dep1513(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1514 {
    private Integer keeper = 0;

    @Inject
    Dep1514(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1515 {
    private Integer keeper = 0;

    @Inject
    Dep1515(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1516 {
    private Integer keeper = 0;

    @Inject
    Dep1516(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1517 {
    private Integer keeper = 0;

    @Inject
    Dep1517(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1518 {
    private Integer keeper = 0;

    Dep1518(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1519 {
    private Integer keeper = 0;

    @Inject
    Dep1519(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1520 {
    private Integer keeper = 0;

    @Inject
    Dep1520(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1521 {
    private Integer keeper = 0;

    Dep1521(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1522 {
    private Integer keeper = 0;

    @Inject
    Dep1522(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1523 {
    private Integer keeper = 0;

    Dep1523(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1524 {
    private Integer keeper = 0;

    Dep1524(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1525 {
    private Integer keeper = 0;

    Dep1525(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1526 {
    private Integer keeper = 0;

    Dep1526(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1527 {
    private Integer keeper = 0;

    @Inject
    Dep1527(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1528 {
    private Integer keeper = 0;

    @Inject
    Dep1528(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1529 {
    private Integer keeper = 0;

    @Inject
    Dep1529(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1530 {
    private Integer keeper = 0;

    @Inject
    Dep1530(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1531 {
    private Integer keeper = 0;

    @Inject
    Dep1531(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1532 {
    private Integer keeper = 0;

    Dep1532(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1533 {
    private Integer keeper = 0;

    Dep1533(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1534 {
    private Integer keeper = 0;

    @Inject
    Dep1534(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1535 {
    private Integer keeper = 0;

    @Inject
    Dep1535(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1536 {
    private Integer keeper = 0;

    @Inject
    Dep1536(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1537 {
    private Integer keeper = 0;

    @Inject
    Dep1537(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1538 {
    private Integer keeper = 0;

    @Inject
    Dep1538(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1539 {
    private Integer keeper = 0;

    Dep1539(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1540 {
    private Integer keeper = 0;

    Dep1540(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1541 {
    private Integer keeper = 0;

    @Inject
    Dep1541(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1542 {
    private Integer keeper = 0;

    @Inject
    Dep1542(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1543 {
    private Integer keeper = 0;

    Dep1543(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1544 {
    private Integer keeper = 0;

    Dep1544(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1545 {
    private Integer keeper = 0;

    @Inject
    Dep1545(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1546 {
    private Integer keeper = 0;

    Dep1546(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1547 {
    private Integer keeper = 0;

    @Inject
    Dep1547(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1548 {
    private Integer keeper = 0;

    Dep1548(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1549 {
    private Integer keeper = 0;

    Dep1549(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1550 {
    private Integer keeper = 0;

    @Inject
    Dep1550(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1551 {
    private Integer keeper = 0;

    @Inject
    Dep1551(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1552 {
    private Integer keeper = 0;

    Dep1552(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1553 {
    private Integer keeper = 0;

    @Inject
    Dep1553(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1554 {
    private Integer keeper = 0;

    @Inject
    Dep1554(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1555 {
    private Integer keeper = 0;

    Dep1555(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1556 {
    private Integer keeper = 0;

    @Inject
    Dep1556(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1557 {
    private Integer keeper = 0;

    @Inject
    Dep1557(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1558 {
    private Integer keeper = 0;

    @Inject
    Dep1558(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1559 {
    private Integer keeper = 0;

    @Inject
    Dep1559(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1560 {
    private Integer keeper = 0;

    @Inject
    Dep1560(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1561 {
    private Integer keeper = 0;

    @Inject
    Dep1561(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1562 {
    private Integer keeper = 0;

    Dep1562(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1563 {
    private Integer keeper = 0;

    @Inject
    Dep1563(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1564 {
    private Integer keeper = 0;

    @Inject
    Dep1564(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1565 {
    private Integer keeper = 0;

    @Inject
    Dep1565(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1566 {
    private Integer keeper = 0;

    Dep1566(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1567 {
    private Integer keeper = 0;

    @Inject
    Dep1567(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1568 {
    private Integer keeper = 0;

    Dep1568(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1569 {
    private Integer keeper = 0;

    @Inject
    Dep1569(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1570 {
    private Integer keeper = 0;

    @Inject
    Dep1570(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1571 {
    private Integer keeper = 0;

    Dep1571(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1572 {
    private Integer keeper = 0;

    @Inject
    Dep1572(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1573 {
    private Integer keeper = 0;

    @Inject
    Dep1573(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1574 {
    private Integer keeper = 0;

    @Inject
    Dep1574(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1575 {
    private Integer keeper = 0;

    Dep1575(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1576 {
    private Integer keeper = 0;

    @Inject
    Dep1576(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1577 {
    private Integer keeper = 0;

    @Inject
    Dep1577(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1578 {
    private Integer keeper = 0;

    Dep1578(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1579 {
    private Integer keeper = 0;

    Dep1579(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1580 {
    private Integer keeper = 0;

    Dep1580(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1581 {
    private Integer keeper = 0;

    @Inject
    Dep1581(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1582 {
    private Integer keeper = 0;

    Dep1582(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1583 {
    private Integer keeper = 0;

    Dep1583(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1584 {
    private Integer keeper = 0;

    Dep1584(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1585 {
    private Integer keeper = 0;

    @Inject
    Dep1585(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1586 {
    private Integer keeper = 0;

    Dep1586(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1587 {
    private Integer keeper = 0;

    Dep1587(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1588 {
    private Integer keeper = 0;

    Dep1588(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1589 {
    private Integer keeper = 0;

    @Inject
    Dep1589(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1590 {
    private Integer keeper = 0;

    Dep1590(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1591 {
    private Integer keeper = 0;

    Dep1591(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1592 {
    private Integer keeper = 0;

    @Inject
    Dep1592(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1593 {
    private Integer keeper = 0;

    @Inject
    Dep1593(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1594 {
    private Integer keeper = 0;

    Dep1594(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1595 {
    private Integer keeper = 0;

    @Inject
    Dep1595(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1596 {
    private Integer keeper = 0;

    Dep1596(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1597 {
    private Integer keeper = 0;

    @Inject
    Dep1597(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1598 {
    private Integer keeper = 0;

    Dep1598(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1599 {
    private Integer keeper = 0;

    Dep1599(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1600 {
    private Integer keeper = 0;

    Dep1600(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1601 {
    private Integer keeper = 0;

    @Inject
    Dep1601(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1602 {
    private Integer keeper = 0;

    Dep1602(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1603 {
    private Integer keeper = 0;

    @Inject
    Dep1603(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1604 {
    private Integer keeper = 0;

    @Inject
    Dep1604(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1605 {
    private Integer keeper = 0;

    Dep1605(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1606 {
    private Integer keeper = 0;

    Dep1606(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1607 {
    private Integer keeper = 0;

    @Inject
    Dep1607(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1608 {
    private Integer keeper = 0;

    Dep1608(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1609 {
    private Integer keeper = 0;

    Dep1609(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1610 {
    private Integer keeper = 0;

    @Inject
    Dep1610(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1611 {
    private Integer keeper = 0;

    Dep1611(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1612 {
    private Integer keeper = 0;

    @Inject
    Dep1612(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1613 {
    private Integer keeper = 0;

    Dep1613(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1614 {
    private Integer keeper = 0;

    @Inject
    Dep1614(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1615 {
    private Integer keeper = 0;

    @Inject
    Dep1615(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1616 {
    private Integer keeper = 0;

    @Inject
    Dep1616(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1617 {
    private Integer keeper = 0;

    Dep1617(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1618 {
    private Integer keeper = 0;

    @Inject
    Dep1618(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1619 {
    private Integer keeper = 0;

    Dep1619(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1620 {
    private Integer keeper = 0;

    @Inject
    Dep1620(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1621 {
    private Integer keeper = 0;

    Dep1621(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1622 {
    private Integer keeper = 0;

    Dep1622(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1623 {
    private Integer keeper = 0;

    @Inject
    Dep1623(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1624 {
    private Integer keeper = 0;

    Dep1624(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1625 {
    private Integer keeper = 0;

    @Inject
    Dep1625(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1626 {
    private Integer keeper = 0;

    Dep1626(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1627 {
    private Integer keeper = 0;

    @Inject
    Dep1627(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1628 {
    private Integer keeper = 0;

    Dep1628(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1629 {
    private Integer keeper = 0;

    @Inject
    Dep1629(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1630 {
    private Integer keeper = 0;

    @Inject
    Dep1630(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1631 {
    private Integer keeper = 0;

    @Inject
    Dep1631(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1632 {
    private Integer keeper = 0;

    Dep1632(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1633 {
    private Integer keeper = 0;

    Dep1633(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1634 {
    private Integer keeper = 0;

    @Inject
    Dep1634(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1635 {
    private Integer keeper = 0;

    Dep1635(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1636 {
    private Integer keeper = 0;

    @Inject
    Dep1636(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1637 {
    private Integer keeper = 0;

    @Inject
    Dep1637(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1638 {
    private Integer keeper = 0;

    @Inject
    Dep1638(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1639 {
    private Integer keeper = 0;

    @Inject
    Dep1639(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1640 {
    private Integer keeper = 0;

    Dep1640(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1641 {
    private Integer keeper = 0;

    Dep1641(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1642 {
    private Integer keeper = 0;

    @Inject
    Dep1642(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1643 {
    private Integer keeper = 0;

    Dep1643(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1644 {
    private Integer keeper = 0;

    @Inject
    Dep1644(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1645 {
    private Integer keeper = 0;

    @Inject
    Dep1645(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1646 {
    private Integer keeper = 0;

    Dep1646(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1647 {
    private Integer keeper = 0;

    @Inject
    Dep1647(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1648 {
    private Integer keeper = 0;

    Dep1648(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1649 {
    private Integer keeper = 0;

    Dep1649(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1650 {
    private Integer keeper = 0;

    @Inject
    Dep1650(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1651 {
    private Integer keeper = 0;

    @Inject
    Dep1651(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1652 {
    private Integer keeper = 0;

    Dep1652(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1653 {
    private Integer keeper = 0;

    @Inject
    Dep1653(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1654 {
    private Integer keeper = 0;

    Dep1654(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1655 {
    private Integer keeper = 0;

    Dep1655(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1656 {
    private Integer keeper = 0;

    @Inject
    Dep1656(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1657 {
    private Integer keeper = 0;

    Dep1657(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1658 {
    private Integer keeper = 0;

    @Inject
    Dep1658(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1659 {
    private Integer keeper = 0;

    Dep1659(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1660 {
    private Integer keeper = 0;

    @Inject
    Dep1660(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1661 {
    private Integer keeper = 0;

    Dep1661(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1662 {
    private Integer keeper = 0;

    @Inject
    Dep1662(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1663 {
    private Integer keeper = 0;

    @Inject
    Dep1663(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1664 {
    private Integer keeper = 0;

    @Inject
    Dep1664(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1665 {
    private Integer keeper = 0;

    @Inject
    Dep1665(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1666 {
    private Integer keeper = 0;

    Dep1666(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1667 {
    private Integer keeper = 0;

    @Inject
    Dep1667(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1668 {
    private Integer keeper = 0;

    Dep1668(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1669 {
    private Integer keeper = 0;

    Dep1669(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1670 {
    private Integer keeper = 0;

    Dep1670(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1671 {
    private Integer keeper = 0;

    Dep1671(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1672 {
    private Integer keeper = 0;

    Dep1672(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1673 {
    private Integer keeper = 0;

    @Inject
    Dep1673(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1674 {
    private Integer keeper = 0;

    Dep1674(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1675 {
    private Integer keeper = 0;

    @Inject
    Dep1675(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1676 {
    private Integer keeper = 0;

    Dep1676(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1677 {
    private Integer keeper = 0;

    Dep1677(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1678 {
    private Integer keeper = 0;

    @Inject
    Dep1678(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1679 {
    private Integer keeper = 0;

    Dep1679(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1680 {
    private Integer keeper = 0;

    @Inject
    Dep1680(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1681 {
    private Integer keeper = 0;

    Dep1681(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1682 {
    private Integer keeper = 0;

    @Inject
    Dep1682(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1683 {
    private Integer keeper = 0;

    Dep1683(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1684 {
    private Integer keeper = 0;

    @Inject
    Dep1684(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1685 {
    private Integer keeper = 0;

    @Inject
    Dep1685(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1686 {
    private Integer keeper = 0;

    Dep1686(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1687 {
    private Integer keeper = 0;

    Dep1687(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1688 {
    private Integer keeper = 0;

    Dep1688(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1689 {
    private Integer keeper = 0;

    Dep1689(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1690 {
    private Integer keeper = 0;

    @Inject
    Dep1690(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1691 {
    private Integer keeper = 0;

    @Inject
    Dep1691(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1692 {
    private Integer keeper = 0;

    @Inject
    Dep1692(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1693 {
    private Integer keeper = 0;

    @Inject
    Dep1693(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1694 {
    private Integer keeper = 0;

    Dep1694(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1695 {
    private Integer keeper = 0;

    Dep1695(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1696 {
    private Integer keeper = 0;

    @Inject
    Dep1696(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1697 {
    private Integer keeper = 0;

    Dep1697(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1698 {
    private Integer keeper = 0;

    Dep1698(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1699 {
    private Integer keeper = 0;

    Dep1699(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1700 {
    private Integer keeper = 0;

    Dep1700(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1701 {
    private Integer keeper = 0;

    Dep1701(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1702 {
    private Integer keeper = 0;

    @Inject
    Dep1702(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1703 {
    private Integer keeper = 0;

    @Inject
    Dep1703(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1704 {
    private Integer keeper = 0;

    @Inject
    Dep1704(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1705 {
    private Integer keeper = 0;

    Dep1705(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1706 {
    private Integer keeper = 0;

    Dep1706(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1707 {
    private Integer keeper = 0;

    Dep1707(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1708 {
    private Integer keeper = 0;

    @Inject
    Dep1708(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1709 {
    private Integer keeper = 0;

    Dep1709(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1710 {
    private Integer keeper = 0;

    @Inject
    Dep1710(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1711 {
    private Integer keeper = 0;

    Dep1711(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1712 {
    private Integer keeper = 0;

    Dep1712(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1713 {
    private Integer keeper = 0;

    Dep1713(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1714 {
    private Integer keeper = 0;

    @Inject
    Dep1714(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1715 {
    private Integer keeper = 0;

    @Inject
    Dep1715(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1716 {
    private Integer keeper = 0;

    @Inject
    Dep1716(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1717 {
    private Integer keeper = 0;

    Dep1717(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1718 {
    private Integer keeper = 0;

    Dep1718(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1719 {
    private Integer keeper = 0;

    @Inject
    Dep1719(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1720 {
    private Integer keeper = 0;

    Dep1720(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1721 {
    private Integer keeper = 0;

    Dep1721(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1722 {
    private Integer keeper = 0;

    Dep1722(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1723 {
    private Integer keeper = 0;

    @Inject
    Dep1723(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1724 {
    private Integer keeper = 0;

    @Inject
    Dep1724(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1725 {
    private Integer keeper = 0;

    Dep1725(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1726 {
    private Integer keeper = 0;

    Dep1726(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1727 {
    private Integer keeper = 0;

    @Inject
    Dep1727(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1728 {
    private Integer keeper = 0;

    Dep1728(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1729 {
    private Integer keeper = 0;

    @Inject
    Dep1729(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1730 {
    private Integer keeper = 0;

    Dep1730(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1731 {
    private Integer keeper = 0;

    Dep1731(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1732 {
    private Integer keeper = 0;

    @Inject
    Dep1732(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1733 {
    private Integer keeper = 0;

    @Inject
    Dep1733(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1734 {
    private Integer keeper = 0;

    @Inject
    Dep1734(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1735 {
    private Integer keeper = 0;

    Dep1735(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1736 {
    private Integer keeper = 0;

    Dep1736(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1737 {
    private Integer keeper = 0;

    @Inject
    Dep1737(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1738 {
    private Integer keeper = 0;

    Dep1738(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1739 {
    private Integer keeper = 0;

    Dep1739(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1740 {
    private Integer keeper = 0;

    Dep1740(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1741 {
    private Integer keeper = 0;

    Dep1741(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1742 {
    private Integer keeper = 0;

    @Inject
    Dep1742(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1743 {
    private Integer keeper = 0;

    Dep1743(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1744 {
    private Integer keeper = 0;

    @Inject
    Dep1744(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1745 {
    private Integer keeper = 0;

    @Inject
    Dep1745(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1746 {
    private Integer keeper = 0;

    @Inject
    Dep1746(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1747 {
    private Integer keeper = 0;

    @Inject
    Dep1747(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1748 {
    private Integer keeper = 0;

    Dep1748(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1749 {
    private Integer keeper = 0;

    @Inject
    Dep1749(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1750 {
    private Integer keeper = 0;

    @Inject
    Dep1750(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1751 {
    private Integer keeper = 0;

    Dep1751(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1752 {
    private Integer keeper = 0;

    @Inject
    Dep1752(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1753 {
    private Integer keeper = 0;

    @Inject
    Dep1753(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1754 {
    private Integer keeper = 0;

    @Inject
    Dep1754(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1755 {
    private Integer keeper = 0;

    @Inject
    Dep1755(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1756 {
    private Integer keeper = 0;

    Dep1756(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1757 {
    private Integer keeper = 0;

    Dep1757(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1758 {
    private Integer keeper = 0;

    @Inject
    Dep1758(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1759 {
    private Integer keeper = 0;

    Dep1759(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1760 {
    private Integer keeper = 0;

    @Inject
    Dep1760(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1761 {
    private Integer keeper = 0;

    Dep1761(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1762 {
    private Integer keeper = 0;

    @Inject
    Dep1762(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1763 {
    private Integer keeper = 0;

    @Inject
    Dep1763(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1764 {
    private Integer keeper = 0;

    Dep1764(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1765 {
    private Integer keeper = 0;

    Dep1765(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1766 {
    private Integer keeper = 0;

    @Inject
    Dep1766(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1767 {
    private Integer keeper = 0;

    Dep1767(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1768 {
    private Integer keeper = 0;

    @Inject
    Dep1768(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1769 {
    private Integer keeper = 0;

    Dep1769(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1770 {
    private Integer keeper = 0;

    Dep1770(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1771 {
    private Integer keeper = 0;

    @Inject
    Dep1771(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1772 {
    private Integer keeper = 0;

    Dep1772(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1773 {
    private Integer keeper = 0;

    Dep1773(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1774 {
    private Integer keeper = 0;

    @Inject
    Dep1774(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1775 {
    private Integer keeper = 0;

    Dep1775(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1776 {
    private Integer keeper = 0;

    @Inject
    Dep1776(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1777 {
    private Integer keeper = 0;

    Dep1777(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1778 {
    private Integer keeper = 0;

    Dep1778(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1779 {
    private Integer keeper = 0;

    Dep1779(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1780 {
    private Integer keeper = 0;

    @Inject
    Dep1780(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1781 {
    private Integer keeper = 0;

    Dep1781(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1782 {
    private Integer keeper = 0;

    Dep1782(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1783 {
    private Integer keeper = 0;

    @Inject
    Dep1783(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1784 {
    private Integer keeper = 0;

    Dep1784(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1785 {
    private Integer keeper = 0;

    @Inject
    Dep1785(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1786 {
    private Integer keeper = 0;

    @Inject
    Dep1786(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1787 {
    private Integer keeper = 0;

    @Inject
    Dep1787(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1788 {
    private Integer keeper = 0;

    Dep1788(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1789 {
    private Integer keeper = 0;

    Dep1789(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1790 {
    private Integer keeper = 0;

    Dep1790(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1791 {
    private Integer keeper = 0;

    Dep1791(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1792 {
    private Integer keeper = 0;

    @Inject
    Dep1792(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1793 {
    private Integer keeper = 0;

    @Inject
    Dep1793(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1794 {
    private Integer keeper = 0;

    Dep1794(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1795 {
    private Integer keeper = 0;

    @Inject
    Dep1795(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1796 {
    private Integer keeper = 0;

    Dep1796(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1797 {
    private Integer keeper = 0;

    Dep1797(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1798 {
    private Integer keeper = 0;

    Dep1798(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1799 {
    private Integer keeper = 0;

    Dep1799(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1800 {
    private Integer keeper = 0;

    Dep1800(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1801 {
    private Integer keeper = 0;

    Dep1801(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1802 {
    private Integer keeper = 0;

    Dep1802(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1803 {
    private Integer keeper = 0;

    Dep1803(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1804 {
    private Integer keeper = 0;

    Dep1804(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1805 {
    private Integer keeper = 0;

    @Inject
    Dep1805(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1806 {
    private Integer keeper = 0;

    Dep1806(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1807 {
    private Integer keeper = 0;

    @Inject
    Dep1807(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1808 {
    private Integer keeper = 0;

    @Inject
    Dep1808(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1809 {
    private Integer keeper = 0;

    @Inject
    Dep1809(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1810 {
    private Integer keeper = 0;

    @Inject
    Dep1810(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1811 {
    private Integer keeper = 0;

    @Inject
    Dep1811(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1812 {
    private Integer keeper = 0;

    Dep1812(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1813 {
    private Integer keeper = 0;

    Dep1813(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1814 {
    private Integer keeper = 0;

    @Inject
    Dep1814(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1815 {
    private Integer keeper = 0;

    @Inject
    Dep1815(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1816 {
    private Integer keeper = 0;

    @Inject
    Dep1816(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1817 {
    private Integer keeper = 0;

    Dep1817(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1818 {
    private Integer keeper = 0;

    Dep1818(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1819 {
    private Integer keeper = 0;

    @Inject
    Dep1819(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1820 {
    private Integer keeper = 0;

    Dep1820(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1821 {
    private Integer keeper = 0;

    @Inject
    Dep1821(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1822 {
    private Integer keeper = 0;

    Dep1822(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1823 {
    private Integer keeper = 0;

    Dep1823(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1824 {
    private Integer keeper = 0;

    Dep1824(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1825 {
    private Integer keeper = 0;

    @Inject
    Dep1825(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1826 {
    private Integer keeper = 0;

    @Inject
    Dep1826(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1827 {
    private Integer keeper = 0;

    Dep1827(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1828 {
    private Integer keeper = 0;

    @Inject
    Dep1828(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1829 {
    private Integer keeper = 0;

    Dep1829(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1830 {
    private Integer keeper = 0;

    Dep1830(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1831 {
    private Integer keeper = 0;

    Dep1831(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1832 {
    private Integer keeper = 0;

    @Inject
    Dep1832(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1833 {
    private Integer keeper = 0;

    Dep1833(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1834 {
    private Integer keeper = 0;

    Dep1834(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1835 {
    private Integer keeper = 0;

    Dep1835(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1836 {
    private Integer keeper = 0;

    Dep1836(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1837 {
    private Integer keeper = 0;

    Dep1837(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1838 {
    private Integer keeper = 0;

    Dep1838(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1839 {
    private Integer keeper = 0;

    Dep1839(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1840 {
    private Integer keeper = 0;

    Dep1840(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1841 {
    private Integer keeper = 0;

    @Inject
    Dep1841(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1842 {
    private Integer keeper = 0;

    @Inject
    Dep1842(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1843 {
    private Integer keeper = 0;

    Dep1843(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1844 {
    private Integer keeper = 0;

    Dep1844(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1845 {
    private Integer keeper = 0;

    Dep1845(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1846 {
    private Integer keeper = 0;

    Dep1846(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1847 {
    private Integer keeper = 0;

    @Inject
    Dep1847(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1848 {
    private Integer keeper = 0;

    @Inject
    Dep1848(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1849 {
    private Integer keeper = 0;

    @Inject
    Dep1849(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1850 {
    private Integer keeper = 0;

    @Inject
    Dep1850(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1851 {
    private Integer keeper = 0;

    Dep1851(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1852 {
    private Integer keeper = 0;

    Dep1852(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1853 {
    private Integer keeper = 0;

    @Inject
    Dep1853(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1854 {
    private Integer keeper = 0;

    Dep1854(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1855 {
    private Integer keeper = 0;

    @Inject
    Dep1855(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1856 {
    private Integer keeper = 0;

    Dep1856(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1857 {
    private Integer keeper = 0;

    Dep1857(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1858 {
    private Integer keeper = 0;

    Dep1858(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1859 {
    private Integer keeper = 0;

    Dep1859(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1860 {
    private Integer keeper = 0;

    Dep1860(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1861 {
    private Integer keeper = 0;

    @Inject
    Dep1861(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1862 {
    private Integer keeper = 0;

    @Inject
    Dep1862(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1863 {
    private Integer keeper = 0;

    Dep1863(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1864 {
    private Integer keeper = 0;

    Dep1864(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1865 {
    private Integer keeper = 0;

    Dep1865(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1866 {
    private Integer keeper = 0;

    @Inject
    Dep1866(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1867 {
    private Integer keeper = 0;

    Dep1867(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1868 {
    private Integer keeper = 0;

    Dep1868(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1869 {
    private Integer keeper = 0;

    @Inject
    Dep1869(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1870 {
    private Integer keeper = 0;

    @Inject
    Dep1870(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1871 {
    private Integer keeper = 0;

    @Inject
    Dep1871(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1872 {
    private Integer keeper = 0;

    @Inject
    Dep1872(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1873 {
    private Integer keeper = 0;

    @Inject
    Dep1873(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1874 {
    private Integer keeper = 0;

    Dep1874(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1875 {
    private Integer keeper = 0;

    Dep1875(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1876 {
    private Integer keeper = 0;

    Dep1876(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1877 {
    private Integer keeper = 0;

    Dep1877(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1878 {
    private Integer keeper = 0;

    Dep1878(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1879 {
    private Integer keeper = 0;

    Dep1879(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1880 {
    private Integer keeper = 0;

    @Inject
    Dep1880(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1881 {
    private Integer keeper = 0;

    Dep1881(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1882 {
    private Integer keeper = 0;

    Dep1882(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1883 {
    private Integer keeper = 0;

    @Inject
    Dep1883(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1884 {
    private Integer keeper = 0;

    @Inject
    Dep1884(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1885 {
    private Integer keeper = 0;

    @Inject
    Dep1885(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1886 {
    private Integer keeper = 0;

    @Inject
    Dep1886(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1887 {
    private Integer keeper = 0;

    Dep1887(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1888 {
    private Integer keeper = 0;

    Dep1888(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1889 {
    private Integer keeper = 0;

    Dep1889(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1890 {
    private Integer keeper = 0;

    Dep1890(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1891 {
    private Integer keeper = 0;

    Dep1891(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1892 {
    private Integer keeper = 0;

    @Inject
    Dep1892(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1893 {
    private Integer keeper = 0;

    @Inject
    Dep1893(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1894 {
    private Integer keeper = 0;

    @Inject
    Dep1894(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1895 {
    private Integer keeper = 0;

    @Inject
    Dep1895(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1896 {
    private Integer keeper = 0;

    @Inject
    Dep1896(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1897 {
    private Integer keeper = 0;

    Dep1897(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1898 {
    private Integer keeper = 0;

    @Inject
    Dep1898(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1899 {
    private Integer keeper = 0;

    @Inject
    Dep1899(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1900 {
    private Integer keeper = 0;

    Dep1900(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1901 {
    private Integer keeper = 0;

    Dep1901(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1902 {
    private Integer keeper = 0;

    Dep1902(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1903 {
    private Integer keeper = 0;

    Dep1903(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1904 {
    private Integer keeper = 0;

    @Inject
    Dep1904(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1905 {
    private Integer keeper = 0;

    Dep1905(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1906 {
    private Integer keeper = 0;

    Dep1906(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1907 {
    private Integer keeper = 0;

    @Inject
    Dep1907(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1908 {
    private Integer keeper = 0;

    @Inject
    Dep1908(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1909 {
    private Integer keeper = 0;

    Dep1909(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1910 {
    private Integer keeper = 0;

    @Inject
    Dep1910(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1911 {
    private Integer keeper = 0;

    Dep1911(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1912 {
    private Integer keeper = 0;

    Dep1912(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1913 {
    private Integer keeper = 0;

    @Inject
    Dep1913(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1914 {
    private Integer keeper = 0;

    @Inject
    Dep1914(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1915 {
    private Integer keeper = 0;

    @Inject
    Dep1915(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1916 {
    private Integer keeper = 0;

    @Inject
    Dep1916(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1917 {
    private Integer keeper = 0;

    Dep1917(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1918 {
    private Integer keeper = 0;

    Dep1918(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1919 {
    private Integer keeper = 0;

    @Inject
    Dep1919(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1920 {
    private Integer keeper = 0;

    @Inject
    Dep1920(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1921 {
    private Integer keeper = 0;

    @Inject
    Dep1921(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1922 {
    private Integer keeper = 0;

    @Inject
    Dep1922(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1923 {
    private Integer keeper = 0;

    @Inject
    Dep1923(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1924 {
    private Integer keeper = 0;

    Dep1924(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1925 {
    private Integer keeper = 0;

    @Inject
    Dep1925(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1926 {
    private Integer keeper = 0;

    Dep1926(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1927 {
    private Integer keeper = 0;

    Dep1927(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1928 {
    private Integer keeper = 0;

    Dep1928(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1929 {
    private Integer keeper = 0;

    Dep1929(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1930 {
    private Integer keeper = 0;

    @Inject
    Dep1930(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1931 {
    private Integer keeper = 0;

    Dep1931(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1932 {
    private Integer keeper = 0;

    Dep1932(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1933 {
    private Integer keeper = 0;

    @Inject
    Dep1933(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1934 {
    private Integer keeper = 0;

    @Inject
    Dep1934(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1935 {
    private Integer keeper = 0;

    Dep1935(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1936 {
    private Integer keeper = 0;

    @Inject
    Dep1936(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1937 {
    private Integer keeper = 0;

    Dep1937(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1938 {
    private Integer keeper = 0;

    Dep1938(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1939 {
    private Integer keeper = 0;

    Dep1939(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1940 {
    private Integer keeper = 0;

    Dep1940(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1941 {
    private Integer keeper = 0;

    @Inject
    Dep1941(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1942 {
    private Integer keeper = 0;

    Dep1942(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1943 {
    private Integer keeper = 0;

    Dep1943(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1944 {
    private Integer keeper = 0;

    @Inject
    Dep1944(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1945 {
    private Integer keeper = 0;

    Dep1945(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1946 {
    private Integer keeper = 0;

    @Inject
    Dep1946(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1947 {
    private Integer keeper = 0;

    Dep1947(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1948 {
    private Integer keeper = 0;

    Dep1948(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1949 {
    private Integer keeper = 0;

    Dep1949(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1950 {
    private Integer keeper = 0;

    @Inject
    Dep1950(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1951 {
    private Integer keeper = 0;

    @Inject
    Dep1951(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1952 {
    private Integer keeper = 0;

    Dep1952(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1953 {
    private Integer keeper = 0;

    Dep1953(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1954 {
    private Integer keeper = 0;

    @Inject
    Dep1954(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1955 {
    private Integer keeper = 0;

    Dep1955(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1956 {
    private Integer keeper = 0;

    @Inject
    Dep1956(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1957 {
    private Integer keeper = 0;

    @Inject
    Dep1957(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1958 {
    private Integer keeper = 0;

    Dep1958(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1959 {
    private Integer keeper = 0;

    Dep1959(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1960 {
    private Integer keeper = 0;

    @Inject
    Dep1960(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1961 {
    private Integer keeper = 0;

    @Inject
    Dep1961(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1962 {
    private Integer keeper = 0;

    Dep1962(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1963 {
    private Integer keeper = 0;

    Dep1963(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1964 {
    private Integer keeper = 0;

    @Inject
    Dep1964(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1965 {
    private Integer keeper = 0;

    @Inject
    Dep1965(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1966 {
    private Integer keeper = 0;

    Dep1966(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1967 {
    private Integer keeper = 0;

    @Inject
    Dep1967(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1968 {
    private Integer keeper = 0;

    Dep1968(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1969 {
    private Integer keeper = 0;

    Dep1969(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1970 {
    private Integer keeper = 0;

    @Inject
    Dep1970(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1971 {
    private Integer keeper = 0;

    Dep1971(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1972 {
    private Integer keeper = 0;

    Dep1972(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1973 {
    private Integer keeper = 0;

    Dep1973(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1974 {
    private Integer keeper = 0;

    Dep1974(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1975 {
    private Integer keeper = 0;

    @Inject
    Dep1975(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1976 {
    private Integer keeper = 0;

    @Inject
    Dep1976(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1977 {
    private Integer keeper = 0;

    @Inject
    Dep1977(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1978 {
    private Integer keeper = 0;

    Dep1978(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1979 {
    private Integer keeper = 0;

    Dep1979(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1980 {
    private Integer keeper = 0;

    @Inject
    Dep1980(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1981 {
    private Integer keeper = 0;

    @Inject
    Dep1981(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1982 {
    private Integer keeper = 0;

    Dep1982(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1983 {
    private Integer keeper = 0;

    Dep1983(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1984 {
    private Integer keeper = 0;

    @Inject
    Dep1984(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1985 {
    private Integer keeper = 0;

    @Inject
    Dep1985(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1986 {
    private Integer keeper = 0;

    Dep1986(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1987 {
    private Integer keeper = 0;

    Dep1987(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1988 {
    private Integer keeper = 0;

    Dep1988(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1989 {
    private Integer keeper = 0;

    Dep1989(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1990 {
    private Integer keeper = 0;

    @Inject
    Dep1990(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1991 {
    private Integer keeper = 0;

    Dep1991(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1992 {
    private Integer keeper = 0;

    @Inject
    Dep1992(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1993 {
    private Integer keeper = 0;

    @Inject
    Dep1993(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1994 {
    private Integer keeper = 0;

    @Inject
    Dep1994(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1995 {
    private Integer keeper = 0;

    Dep1995(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1996 {
    private Integer keeper = 0;

    Dep1996(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1997 {
    private Integer keeper = 0;

    Dep1997(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1998 {
    private Integer keeper = 0;

    Dep1998(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep1999 {
    private Integer keeper = 0;

    @Inject
    Dep1999(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2000 {
    private Integer keeper = 0;

    @Inject
    Dep2000(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2001 {
    private Integer keeper = 0;

    Dep2001(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2002 {
    private Integer keeper = 0;

    Dep2002(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2003 {
    private Integer keeper = 0;

    Dep2003(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2004 {
    private Integer keeper = 0;

    @Inject
    Dep2004(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2005 {
    private Integer keeper = 0;

    @Inject
    Dep2005(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2006 {
    private Integer keeper = 0;

    @Inject
    Dep2006(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2007 {
    private Integer keeper = 0;

    @Inject
    Dep2007(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2008 {
    private Integer keeper = 0;

    @Inject
    Dep2008(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2009 {
    private Integer keeper = 0;

    Dep2009(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2010 {
    private Integer keeper = 0;

    Dep2010(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2011 {
    private Integer keeper = 0;

    @Inject
    Dep2011(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2012 {
    private Integer keeper = 0;

    @Inject
    Dep2012(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2013 {
    private Integer keeper = 0;

    @Inject
    Dep2013(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2014 {
    private Integer keeper = 0;

    @Inject
    Dep2014(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2015 {
    private Integer keeper = 0;

    @Inject
    Dep2015(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2016 {
    private Integer keeper = 0;

    @Inject
    Dep2016(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2017 {
    private Integer keeper = 0;

    @Inject
    Dep2017(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2018 {
    private Integer keeper = 0;

    @Inject
    Dep2018(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2019 {
    private Integer keeper = 0;

    @Inject
    Dep2019(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2020 {
    private Integer keeper = 0;

    Dep2020(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2021 {
    private Integer keeper = 0;

    Dep2021(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2022 {
    private Integer keeper = 0;

    Dep2022(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2023 {
    private Integer keeper = 0;

    Dep2023(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2024 {
    private Integer keeper = 0;

    @Inject
    Dep2024(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2025 {
    private Integer keeper = 0;

    Dep2025(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2026 {
    private Integer keeper = 0;

    Dep2026(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2027 {
    private Integer keeper = 0;

    Dep2027(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2028 {
    private Integer keeper = 0;

    Dep2028(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2029 {
    private Integer keeper = 0;

    @Inject
    Dep2029(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2030 {
    private Integer keeper = 0;

    @Inject
    Dep2030(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2031 {
    private Integer keeper = 0;

    Dep2031(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2032 {
    private Integer keeper = 0;

    @Inject
    Dep2032(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2033 {
    private Integer keeper = 0;

    @Inject
    Dep2033(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2034 {
    private Integer keeper = 0;

    Dep2034(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2035 {
    private Integer keeper = 0;

    @Inject
    Dep2035(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2036 {
    private Integer keeper = 0;

    Dep2036(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2037 {
    private Integer keeper = 0;

    @Inject
    Dep2037(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2038 {
    private Integer keeper = 0;

    Dep2038(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2039 {
    private Integer keeper = 0;

    Dep2039(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2040 {
    private Integer keeper = 0;

    @Inject
    Dep2040(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2041 {
    private Integer keeper = 0;

    Dep2041(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2042 {
    private Integer keeper = 0;

    @Inject
    Dep2042(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2043 {
    private Integer keeper = 0;

    Dep2043(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2044 {
    private Integer keeper = 0;

    @Inject
    Dep2044(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2045 {
    private Integer keeper = 0;

    Dep2045(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2046 {
    private Integer keeper = 0;

    Dep2046(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2047 {
    private Integer keeper = 0;

    Dep2047(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2048 {
    private Integer keeper = 0;

    @Inject
    Dep2048(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2049 {
    private Integer keeper = 0;

    @Inject
    Dep2049(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2050 {
    private Integer keeper = 0;

    @Inject
    Dep2050(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2051 {
    private Integer keeper = 0;

    Dep2051(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2052 {
    private Integer keeper = 0;

    @Inject
    Dep2052(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2053 {
    private Integer keeper = 0;

    Dep2053(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2054 {
    private Integer keeper = 0;

    @Inject
    Dep2054(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2055 {
    private Integer keeper = 0;

    @Inject
    Dep2055(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2056 {
    private Integer keeper = 0;

    Dep2056(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2057 {
    private Integer keeper = 0;

    @Inject
    Dep2057(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2058 {
    private Integer keeper = 0;

    @Inject
    Dep2058(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2059 {
    private Integer keeper = 0;

    @Inject
    Dep2059(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2060 {
    private Integer keeper = 0;

    Dep2060(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2061 {
    private Integer keeper = 0;

    Dep2061(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2062 {
    private Integer keeper = 0;

    Dep2062(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2063 {
    private Integer keeper = 0;

    Dep2063(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2064 {
    private Integer keeper = 0;

    @Inject
    Dep2064(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2065 {
    private Integer keeper = 0;

    @Inject
    Dep2065(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2066 {
    private Integer keeper = 0;

    @Inject
    Dep2066(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2067 {
    private Integer keeper = 0;

    Dep2067(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2068 {
    private Integer keeper = 0;

    Dep2068(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2069 {
    private Integer keeper = 0;

    @Inject
    Dep2069(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2070 {
    private Integer keeper = 0;

    Dep2070(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2071 {
    private Integer keeper = 0;

    Dep2071(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2072 {
    private Integer keeper = 0;

    @Inject
    Dep2072(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2073 {
    private Integer keeper = 0;

    @Inject
    Dep2073(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2074 {
    private Integer keeper = 0;

    @Inject
    Dep2074(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2075 {
    private Integer keeper = 0;

    @Inject
    Dep2075(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2076 {
    private Integer keeper = 0;

    @Inject
    Dep2076(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2077 {
    private Integer keeper = 0;

    Dep2077(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2078 {
    private Integer keeper = 0;

    @Inject
    Dep2078(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2079 {
    private Integer keeper = 0;

    @Inject
    Dep2079(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2080 {
    private Integer keeper = 0;

    @Inject
    Dep2080(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2081 {
    private Integer keeper = 0;

    @Inject
    Dep2081(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2082 {
    private Integer keeper = 0;

    @Inject
    Dep2082(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2083 {
    private Integer keeper = 0;

    Dep2083(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2084 {
    private Integer keeper = 0;

    @Inject
    Dep2084(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2085 {
    private Integer keeper = 0;

    @Inject
    Dep2085(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2086 {
    private Integer keeper = 0;

    @Inject
    Dep2086(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2087 {
    private Integer keeper = 0;

    Dep2087(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2088 {
    private Integer keeper = 0;

    @Inject
    Dep2088(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2089 {
    private Integer keeper = 0;

    @Inject
    Dep2089(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2090 {
    private Integer keeper = 0;

    Dep2090(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2091 {
    private Integer keeper = 0;

    @Inject
    Dep2091(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2092 {
    private Integer keeper = 0;

    @Inject
    Dep2092(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2093 {
    private Integer keeper = 0;

    @Inject
    Dep2093(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2094 {
    private Integer keeper = 0;

    Dep2094(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2095 {
    private Integer keeper = 0;

    @Inject
    Dep2095(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2096 {
    private Integer keeper = 0;

    @Inject
    Dep2096(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2097 {
    private Integer keeper = 0;

    Dep2097(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2098 {
    private Integer keeper = 0;

    @Inject
    Dep2098(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2099 {
    private Integer keeper = 0;

    @Inject
    Dep2099(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2100 {
    private Integer keeper = 0;

    Dep2100(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2101 {
    private Integer keeper = 0;

    @Inject
    Dep2101(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2102 {
    private Integer keeper = 0;

    @Inject
    Dep2102(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2103 {
    private Integer keeper = 0;

    @Inject
    Dep2103(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2104 {
    private Integer keeper = 0;

    @Inject
    Dep2104(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2105 {
    private Integer keeper = 0;

    @Inject
    Dep2105(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2106 {
    private Integer keeper = 0;

    @Inject
    Dep2106(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2107 {
    private Integer keeper = 0;

    Dep2107(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2108 {
    private Integer keeper = 0;

    @Inject
    Dep2108(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2109 {
    private Integer keeper = 0;

    @Inject
    Dep2109(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2110 {
    private Integer keeper = 0;

    @Inject
    Dep2110(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2111 {
    private Integer keeper = 0;

    @Inject
    Dep2111(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2112 {
    private Integer keeper = 0;

    Dep2112(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2113 {
    private Integer keeper = 0;

    @Inject
    Dep2113(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2114 {
    private Integer keeper = 0;

    @Inject
    Dep2114(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2115 {
    private Integer keeper = 0;

    @Inject
    Dep2115(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2116 {
    private Integer keeper = 0;

    Dep2116(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2117 {
    private Integer keeper = 0;

    @Inject
    Dep2117(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2118 {
    private Integer keeper = 0;

    Dep2118(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2119 {
    private Integer keeper = 0;

    @Inject
    Dep2119(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2120 {
    private Integer keeper = 0;

    Dep2120(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2121 {
    private Integer keeper = 0;

    @Inject
    Dep2121(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2122 {
    private Integer keeper = 0;

    Dep2122(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2123 {
    private Integer keeper = 0;

    Dep2123(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2124 {
    private Integer keeper = 0;

    Dep2124(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2125 {
    private Integer keeper = 0;

    @Inject
    Dep2125(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2126 {
    private Integer keeper = 0;

    Dep2126(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2127 {
    private Integer keeper = 0;

    Dep2127(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2128 {
    private Integer keeper = 0;

    @Inject
    Dep2128(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2129 {
    private Integer keeper = 0;

    Dep2129(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2130 {
    private Integer keeper = 0;

    @Inject
    Dep2130(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2131 {
    private Integer keeper = 0;

    Dep2131(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2132 {
    private Integer keeper = 0;

    @Inject
    Dep2132(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2133 {
    private Integer keeper = 0;

    Dep2133(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2134 {
    private Integer keeper = 0;

    @Inject
    Dep2134(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2135 {
    private Integer keeper = 0;

    @Inject
    Dep2135(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2136 {
    private Integer keeper = 0;

    Dep2136(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2137 {
    private Integer keeper = 0;

    Dep2137(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2138 {
    private Integer keeper = 0;

    Dep2138(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2139 {
    private Integer keeper = 0;

    @Inject
    Dep2139(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2140 {
    private Integer keeper = 0;

    @Inject
    Dep2140(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2141 {
    private Integer keeper = 0;

    @Inject
    Dep2141(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2142 {
    private Integer keeper = 0;

    @Inject
    Dep2142(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2143 {
    private Integer keeper = 0;

    @Inject
    Dep2143(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2144 {
    private Integer keeper = 0;

    @Inject
    Dep2144(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2145 {
    private Integer keeper = 0;

    Dep2145(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2146 {
    private Integer keeper = 0;

    Dep2146(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2147 {
    private Integer keeper = 0;

    Dep2147(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2148 {
    private Integer keeper = 0;

    @Inject
    Dep2148(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2149 {
    private Integer keeper = 0;

    @Inject
    Dep2149(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2150 {
    private Integer keeper = 0;

    @Inject
    Dep2150(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2151 {
    private Integer keeper = 0;

    Dep2151(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2152 {
    private Integer keeper = 0;

    @Inject
    Dep2152(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2153 {
    private Integer keeper = 0;

    @Inject
    Dep2153(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2154 {
    private Integer keeper = 0;

    Dep2154(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2155 {
    private Integer keeper = 0;

    Dep2155(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2156 {
    private Integer keeper = 0;

    @Inject
    Dep2156(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2157 {
    private Integer keeper = 0;

    @Inject
    Dep2157(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2158 {
    private Integer keeper = 0;

    @Inject
    Dep2158(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2159 {
    private Integer keeper = 0;

    @Inject
    Dep2159(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2160 {
    private Integer keeper = 0;

    @Inject
    Dep2160(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2161 {
    private Integer keeper = 0;

    Dep2161(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2162 {
    private Integer keeper = 0;

    Dep2162(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2163 {
    private Integer keeper = 0;

    Dep2163(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2164 {
    private Integer keeper = 0;

    Dep2164(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2165 {
    private Integer keeper = 0;

    Dep2165(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2166 {
    private Integer keeper = 0;

    Dep2166(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2167 {
    private Integer keeper = 0;

    @Inject
    Dep2167(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2168 {
    private Integer keeper = 0;

    Dep2168(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2169 {
    private Integer keeper = 0;

    @Inject
    Dep2169(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2170 {
    private Integer keeper = 0;

    @Inject
    Dep2170(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2171 {
    private Integer keeper = 0;

    Dep2171(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2172 {
    private Integer keeper = 0;

    @Inject
    Dep2172(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2173 {
    private Integer keeper = 0;

    @Inject
    Dep2173(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2174 {
    private Integer keeper = 0;

    @Inject
    Dep2174(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2175 {
    private Integer keeper = 0;

    @Inject
    Dep2175(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2176 {
    private Integer keeper = 0;

    Dep2176(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2177 {
    private Integer keeper = 0;

    Dep2177(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2178 {
    private Integer keeper = 0;

    @Inject
    Dep2178(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2179 {
    private Integer keeper = 0;

    Dep2179(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2180 {
    private Integer keeper = 0;

    @Inject
    Dep2180(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2181 {
    private Integer keeper = 0;

    @Inject
    Dep2181(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2182 {
    private Integer keeper = 0;

    @Inject
    Dep2182(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2183 {
    private Integer keeper = 0;

    Dep2183(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2184 {
    private Integer keeper = 0;

    Dep2184(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2185 {
    private Integer keeper = 0;

    @Inject
    Dep2185(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2186 {
    private Integer keeper = 0;

    Dep2186(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2187 {
    private Integer keeper = 0;

    Dep2187(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2188 {
    private Integer keeper = 0;

    Dep2188(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2189 {
    private Integer keeper = 0;

    @Inject
    Dep2189(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2190 {
    private Integer keeper = 0;

    @Inject
    Dep2190(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2191 {
    private Integer keeper = 0;

    @Inject
    Dep2191(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2192 {
    private Integer keeper = 0;

    Dep2192(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2193 {
    private Integer keeper = 0;

    Dep2193(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2194 {
    private Integer keeper = 0;

    @Inject
    Dep2194(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2195 {
    private Integer keeper = 0;

    Dep2195(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2196 {
    private Integer keeper = 0;

    Dep2196(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2197 {
    private Integer keeper = 0;

    Dep2197(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2198 {
    private Integer keeper = 0;

    Dep2198(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2199 {
    private Integer keeper = 0;

    @Inject
    Dep2199(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2200 {
    private Integer keeper = 0;

    Dep2200(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2201 {
    private Integer keeper = 0;

    Dep2201(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2202 {
    private Integer keeper = 0;

    Dep2202(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2203 {
    private Integer keeper = 0;

    Dep2203(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2204 {
    private Integer keeper = 0;

    @Inject
    Dep2204(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2205 {
    private Integer keeper = 0;

    Dep2205(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2206 {
    private Integer keeper = 0;

    @Inject
    Dep2206(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2207 {
    private Integer keeper = 0;

    @Inject
    Dep2207(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2208 {
    private Integer keeper = 0;

    Dep2208(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2209 {
    private Integer keeper = 0;

    Dep2209(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2210 {
    private Integer keeper = 0;

    @Inject
    Dep2210(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2211 {
    private Integer keeper = 0;

    Dep2211(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2212 {
    private Integer keeper = 0;

    @Inject
    Dep2212(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2213 {
    private Integer keeper = 0;

    Dep2213(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2214 {
    private Integer keeper = 0;

    @Inject
    Dep2214(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2215 {
    private Integer keeper = 0;

    Dep2215(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2216 {
    private Integer keeper = 0;

    Dep2216(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2217 {
    private Integer keeper = 0;

    @Inject
    Dep2217(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2218 {
    private Integer keeper = 0;

    Dep2218(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2219 {
    private Integer keeper = 0;

    Dep2219(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2220 {
    private Integer keeper = 0;

    Dep2220(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2221 {
    private Integer keeper = 0;

    @Inject
    Dep2221(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2222 {
    private Integer keeper = 0;

    Dep2222(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2223 {
    private Integer keeper = 0;

    Dep2223(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2224 {
    private Integer keeper = 0;

    Dep2224(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2225 {
    private Integer keeper = 0;

    Dep2225(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2226 {
    private Integer keeper = 0;

    @Inject
    Dep2226(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2227 {
    private Integer keeper = 0;

    @Inject
    Dep2227(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2228 {
    private Integer keeper = 0;

    Dep2228(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2229 {
    private Integer keeper = 0;

    Dep2229(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2230 {
    private Integer keeper = 0;

    @Inject
    Dep2230(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2231 {
    private Integer keeper = 0;

    @Inject
    Dep2231(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2232 {
    private Integer keeper = 0;

    @Inject
    Dep2232(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2233 {
    private Integer keeper = 0;

    @Inject
    Dep2233(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2234 {
    private Integer keeper = 0;

    Dep2234(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2235 {
    private Integer keeper = 0;

    Dep2235(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2236 {
    private Integer keeper = 0;

    Dep2236(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2237 {
    private Integer keeper = 0;

    Dep2237(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2238 {
    private Integer keeper = 0;

    Dep2238(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2239 {
    private Integer keeper = 0;

    Dep2239(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2240 {
    private Integer keeper = 0;

    @Inject
    Dep2240(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2241 {
    private Integer keeper = 0;

    Dep2241(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2242 {
    private Integer keeper = 0;

    Dep2242(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2243 {
    private Integer keeper = 0;

    Dep2243(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2244 {
    private Integer keeper = 0;

    Dep2244(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2245 {
    private Integer keeper = 0;

    @Inject
    Dep2245(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2246 {
    private Integer keeper = 0;

    @Inject
    Dep2246(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2247 {
    private Integer keeper = 0;

    Dep2247(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2248 {
    private Integer keeper = 0;

    Dep2248(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2249 {
    private Integer keeper = 0;

    @Inject
    Dep2249(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2250 {
    private Integer keeper = 0;

    Dep2250(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2251 {
    private Integer keeper = 0;

    Dep2251(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2252 {
    private Integer keeper = 0;

    Dep2252(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2253 {
    private Integer keeper = 0;

    Dep2253(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2254 {
    private Integer keeper = 0;

    Dep2254(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2255 {
    private Integer keeper = 0;

    Dep2255(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2256 {
    private Integer keeper = 0;

    Dep2256(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2257 {
    private Integer keeper = 0;

    @Inject
    Dep2257(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2258 {
    private Integer keeper = 0;

    Dep2258(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2259 {
    private Integer keeper = 0;

    Dep2259(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2260 {
    private Integer keeper = 0;

    Dep2260(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2261 {
    private Integer keeper = 0;

    @Inject
    Dep2261(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2262 {
    private Integer keeper = 0;

    Dep2262(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2263 {
    private Integer keeper = 0;

    @Inject
    Dep2263(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2264 {
    private Integer keeper = 0;

    @Inject
    Dep2264(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2265 {
    private Integer keeper = 0;

    Dep2265(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2266 {
    private Integer keeper = 0;

    Dep2266(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2267 {
    private Integer keeper = 0;

    @Inject
    Dep2267(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2268 {
    private Integer keeper = 0;

    @Inject
    Dep2268(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2269 {
    private Integer keeper = 0;

    Dep2269(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2270 {
    private Integer keeper = 0;

    @Inject
    Dep2270(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2271 {
    private Integer keeper = 0;

    @Inject
    Dep2271(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2272 {
    private Integer keeper = 0;

    Dep2272(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2273 {
    private Integer keeper = 0;

    @Inject
    Dep2273(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2274 {
    private Integer keeper = 0;

    Dep2274(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2275 {
    private Integer keeper = 0;

    @Inject
    Dep2275(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2276 {
    private Integer keeper = 0;

    @Inject
    Dep2276(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2277 {
    private Integer keeper = 0;

    @Inject
    Dep2277(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2278 {
    private Integer keeper = 0;

    @Inject
    Dep2278(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2279 {
    private Integer keeper = 0;

    @Inject
    Dep2279(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2280 {
    private Integer keeper = 0;

    @Inject
    Dep2280(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2281 {
    private Integer keeper = 0;

    Dep2281(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2282 {
    private Integer keeper = 0;

    @Inject
    Dep2282(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2283 {
    private Integer keeper = 0;

    Dep2283(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2284 {
    private Integer keeper = 0;

    Dep2284(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2285 {
    private Integer keeper = 0;

    @Inject
    Dep2285(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2286 {
    private Integer keeper = 0;

    Dep2286(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2287 {
    private Integer keeper = 0;

    Dep2287(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2288 {
    private Integer keeper = 0;

    @Inject
    Dep2288(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2289 {
    private Integer keeper = 0;

    Dep2289(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2290 {
    private Integer keeper = 0;

    Dep2290(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2291 {
    private Integer keeper = 0;

    Dep2291(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2292 {
    private Integer keeper = 0;

    @Inject
    Dep2292(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2293 {
    private Integer keeper = 0;

    @Inject
    Dep2293(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2294 {
    private Integer keeper = 0;

    Dep2294(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2295 {
    private Integer keeper = 0;

    Dep2295(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2296 {
    private Integer keeper = 0;

    @Inject
    Dep2296(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2297 {
    private Integer keeper = 0;

    Dep2297(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2298 {
    private Integer keeper = 0;

    Dep2298(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2299 {
    private Integer keeper = 0;

    @Inject
    Dep2299(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2300 {
    private Integer keeper = 0;

    Dep2300(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2301 {
    private Integer keeper = 0;

    @Inject
    Dep2301(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2302 {
    private Integer keeper = 0;

    Dep2302(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2303 {
    private Integer keeper = 0;

    Dep2303(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2304 {
    private Integer keeper = 0;

    @Inject
    Dep2304(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2305 {
    private Integer keeper = 0;

    Dep2305(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2306 {
    private Integer keeper = 0;

    @Inject
    Dep2306(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2307 {
    private Integer keeper = 0;

    Dep2307(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2308 {
    private Integer keeper = 0;

    Dep2308(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2309 {
    private Integer keeper = 0;

    Dep2309(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2310 {
    private Integer keeper = 0;

    Dep2310(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2311 {
    private Integer keeper = 0;

    Dep2311(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2312 {
    private Integer keeper = 0;

    Dep2312(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2313 {
    private Integer keeper = 0;

    @Inject
    Dep2313(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2314 {
    private Integer keeper = 0;

    Dep2314(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2315 {
    private Integer keeper = 0;

    Dep2315(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2316 {
    private Integer keeper = 0;

    @Inject
    Dep2316(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2317 {
    private Integer keeper = 0;

    Dep2317(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2318 {
    private Integer keeper = 0;

    @Inject
    Dep2318(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2319 {
    private Integer keeper = 0;

    Dep2319(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2320 {
    private Integer keeper = 0;

    Dep2320(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2321 {
    private Integer keeper = 0;

    Dep2321(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2322 {
    private Integer keeper = 0;

    Dep2322(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2323 {
    private Integer keeper = 0;

    Dep2323(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2324 {
    private Integer keeper = 0;

    @Inject
    Dep2324(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2325 {
    private Integer keeper = 0;

    @Inject
    Dep2325(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2326 {
    private Integer keeper = 0;

    @Inject
    Dep2326(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2327 {
    private Integer keeper = 0;

    Dep2327(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2328 {
    private Integer keeper = 0;

    @Inject
    Dep2328(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2329 {
    private Integer keeper = 0;

    Dep2329(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2330 {
    private Integer keeper = 0;

    Dep2330(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2331 {
    private Integer keeper = 0;

    @Inject
    Dep2331(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2332 {
    private Integer keeper = 0;

    Dep2332(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2333 {
    private Integer keeper = 0;

    Dep2333(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2334 {
    private Integer keeper = 0;

    @Inject
    Dep2334(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2335 {
    private Integer keeper = 0;

    @Inject
    Dep2335(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2336 {
    private Integer keeper = 0;

    Dep2336(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2337 {
    private Integer keeper = 0;

    @Inject
    Dep2337(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2338 {
    private Integer keeper = 0;

    Dep2338(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2339 {
    private Integer keeper = 0;

    @Inject
    Dep2339(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2340 {
    private Integer keeper = 0;

    @Inject
    Dep2340(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2341 {
    private Integer keeper = 0;

    Dep2341(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2342 {
    private Integer keeper = 0;

    Dep2342(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2343 {
    private Integer keeper = 0;

    Dep2343(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2344 {
    private Integer keeper = 0;

    @Inject
    Dep2344(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2345 {
    private Integer keeper = 0;

    @Inject
    Dep2345(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2346 {
    private Integer keeper = 0;

    Dep2346(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2347 {
    private Integer keeper = 0;

    Dep2347(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2348 {
    private Integer keeper = 0;

    @Inject
    Dep2348(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2349 {
    private Integer keeper = 0;

    @Inject
    Dep2349(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2350 {
    private Integer keeper = 0;

    Dep2350(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2351 {
    private Integer keeper = 0;

    Dep2351(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2352 {
    private Integer keeper = 0;

    Dep2352(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2353 {
    private Integer keeper = 0;

    @Inject
    Dep2353(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2354 {
    private Integer keeper = 0;

    Dep2354(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2355 {
    private Integer keeper = 0;

    Dep2355(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2356 {
    private Integer keeper = 0;

    @Inject
    Dep2356(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2357 {
    private Integer keeper = 0;

    @Inject
    Dep2357(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2358 {
    private Integer keeper = 0;

    Dep2358(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2359 {
    private Integer keeper = 0;

    @Inject
    Dep2359(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2360 {
    private Integer keeper = 0;

    Dep2360(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2361 {
    private Integer keeper = 0;

    Dep2361(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2362 {
    private Integer keeper = 0;

    @Inject
    Dep2362(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2363 {
    private Integer keeper = 0;

    @Inject
    Dep2363(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2364 {
    private Integer keeper = 0;

    @Inject
    Dep2364(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2365 {
    private Integer keeper = 0;

    @Inject
    Dep2365(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2366 {
    private Integer keeper = 0;

    Dep2366(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2367 {
    private Integer keeper = 0;

    @Inject
    Dep2367(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2368 {
    private Integer keeper = 0;

    Dep2368(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2369 {
    private Integer keeper = 0;

    Dep2369(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2370 {
    private Integer keeper = 0;

    Dep2370(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2371 {
    private Integer keeper = 0;

    @Inject
    Dep2371(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2372 {
    private Integer keeper = 0;

    @Inject
    Dep2372(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2373 {
    private Integer keeper = 0;

    Dep2373(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2374 {
    private Integer keeper = 0;

    Dep2374(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2375 {
    private Integer keeper = 0;

    Dep2375(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2376 {
    private Integer keeper = 0;

    Dep2376(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2377 {
    private Integer keeper = 0;

    Dep2377(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2378 {
    private Integer keeper = 0;

    Dep2378(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2379 {
    private Integer keeper = 0;

    Dep2379(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2380 {
    private Integer keeper = 0;

    @Inject
    Dep2380(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2381 {
    private Integer keeper = 0;

    Dep2381(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2382 {
    private Integer keeper = 0;

    @Inject
    Dep2382(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2383 {
    private Integer keeper = 0;

    @Inject
    Dep2383(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2384 {
    private Integer keeper = 0;

    Dep2384(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2385 {
    private Integer keeper = 0;

    Dep2385(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2386 {
    private Integer keeper = 0;

    Dep2386(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2387 {
    private Integer keeper = 0;

    @Inject
    Dep2387(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2388 {
    private Integer keeper = 0;

    @Inject
    Dep2388(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2389 {
    private Integer keeper = 0;

    Dep2389(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2390 {
    private Integer keeper = 0;

    Dep2390(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2391 {
    private Integer keeper = 0;

    @Inject
    Dep2391(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2392 {
    private Integer keeper = 0;

    Dep2392(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2393 {
    private Integer keeper = 0;

    @Inject
    Dep2393(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2394 {
    private Integer keeper = 0;

    Dep2394(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2395 {
    private Integer keeper = 0;

    Dep2395(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2396 {
    private Integer keeper = 0;

    Dep2396(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2397 {
    private Integer keeper = 0;

    Dep2397(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2398 {
    private Integer keeper = 0;

    @Inject
    Dep2398(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2399 {
    private Integer keeper = 0;

    Dep2399(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2400 {
    private Integer keeper = 0;

    Dep2400(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2401 {
    private Integer keeper = 0;

    Dep2401(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2402 {
    private Integer keeper = 0;

    @Inject
    Dep2402(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2403 {
    private Integer keeper = 0;

    @Inject
    Dep2403(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2404 {
    private Integer keeper = 0;

    @Inject
    Dep2404(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2405 {
    private Integer keeper = 0;

    Dep2405(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2406 {
    private Integer keeper = 0;

    @Inject
    Dep2406(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2407 {
    private Integer keeper = 0;

    Dep2407(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2408 {
    private Integer keeper = 0;

    Dep2408(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2409 {
    private Integer keeper = 0;

    Dep2409(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2410 {
    private Integer keeper = 0;

    @Inject
    Dep2410(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2411 {
    private Integer keeper = 0;

    Dep2411(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2412 {
    private Integer keeper = 0;

    Dep2412(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2413 {
    private Integer keeper = 0;

    @Inject
    Dep2413(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2414 {
    private Integer keeper = 0;

    @Inject
    Dep2414(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2415 {
    private Integer keeper = 0;

    Dep2415(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2416 {
    private Integer keeper = 0;

    Dep2416(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2417 {
    private Integer keeper = 0;

    Dep2417(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2418 {
    private Integer keeper = 0;

    Dep2418(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2419 {
    private Integer keeper = 0;

    @Inject
    Dep2419(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2420 {
    private Integer keeper = 0;

    Dep2420(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2421 {
    private Integer keeper = 0;

    Dep2421(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2422 {
    private Integer keeper = 0;

    Dep2422(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2423 {
    private Integer keeper = 0;

    @Inject
    Dep2423(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2424 {
    private Integer keeper = 0;

    @Inject
    Dep2424(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2425 {
    private Integer keeper = 0;

    @Inject
    Dep2425(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2426 {
    private Integer keeper = 0;

    Dep2426(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2427 {
    private Integer keeper = 0;

    Dep2427(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2428 {
    private Integer keeper = 0;

    @Inject
    Dep2428(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2429 {
    private Integer keeper = 0;

    @Inject
    Dep2429(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2430 {
    private Integer keeper = 0;

    Dep2430(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2431 {
    private Integer keeper = 0;

    @Inject
    Dep2431(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2432 {
    private Integer keeper = 0;

    Dep2432(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2433 {
    private Integer keeper = 0;

    @Inject
    Dep2433(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2434 {
    private Integer keeper = 0;

    @Inject
    Dep2434(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2435 {
    private Integer keeper = 0;

    Dep2435(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2436 {
    private Integer keeper = 0;

    @Inject
    Dep2436(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2437 {
    private Integer keeper = 0;

    @Inject
    Dep2437(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2438 {
    private Integer keeper = 0;

    @Inject
    Dep2438(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2439 {
    private Integer keeper = 0;

    @Inject
    Dep2439(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2440 {
    private Integer keeper = 0;

    Dep2440(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2441 {
    private Integer keeper = 0;

    @Inject
    Dep2441(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2442 {
    private Integer keeper = 0;

    @Inject
    Dep2442(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2443 {
    private Integer keeper = 0;

    @Inject
    Dep2443(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2444 {
    private Integer keeper = 0;

    @Inject
    Dep2444(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2445 {
    private Integer keeper = 0;

    Dep2445(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2446 {
    private Integer keeper = 0;

    Dep2446(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2447 {
    private Integer keeper = 0;

    @Inject
    Dep2447(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2448 {
    private Integer keeper = 0;

    @Inject
    Dep2448(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2449 {
    private Integer keeper = 0;

    Dep2449(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2450 {
    private Integer keeper = 0;

    Dep2450(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2451 {
    private Integer keeper = 0;

    @Inject
    Dep2451(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2452 {
    private Integer keeper = 0;

    @Inject
    Dep2452(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2453 {
    private Integer keeper = 0;

    Dep2453(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2454 {
    private Integer keeper = 0;

    Dep2454(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2455 {
    private Integer keeper = 0;

    Dep2455(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2456 {
    private Integer keeper = 0;

    Dep2456(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2457 {
    private Integer keeper = 0;

    Dep2457(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2458 {
    private Integer keeper = 0;

    Dep2458(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2459 {
    private Integer keeper = 0;

    Dep2459(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2460 {
    private Integer keeper = 0;

    Dep2460(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2461 {
    private Integer keeper = 0;

    Dep2461(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2462 {
    private Integer keeper = 0;

    Dep2462(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2463 {
    private Integer keeper = 0;

    Dep2463(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2464 {
    private Integer keeper = 0;

    Dep2464(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2465 {
    private Integer keeper = 0;

    Dep2465(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2466 {
    private Integer keeper = 0;

    @Inject
    Dep2466(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2467 {
    private Integer keeper = 0;

    Dep2467(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2468 {
    private Integer keeper = 0;

    @Inject
    Dep2468(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2469 {
    private Integer keeper = 0;

    @Inject
    Dep2469(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2470 {
    private Integer keeper = 0;

    @Inject
    Dep2470(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2471 {
    private Integer keeper = 0;

    @Inject
    Dep2471(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2472 {
    private Integer keeper = 0;

    @Inject
    Dep2472(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2473 {
    private Integer keeper = 0;

    Dep2473(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2474 {
    private Integer keeper = 0;

    Dep2474(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2475 {
    private Integer keeper = 0;

    @Inject
    Dep2475(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2476 {
    private Integer keeper = 0;

    @Inject
    Dep2476(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2477 {
    private Integer keeper = 0;

    @Inject
    Dep2477(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2478 {
    private Integer keeper = 0;

    Dep2478(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2479 {
    private Integer keeper = 0;

    @Inject
    Dep2479(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2480 {
    private Integer keeper = 0;

    Dep2480(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2481 {
    private Integer keeper = 0;

    @Inject
    Dep2481(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2482 {
    private Integer keeper = 0;

    @Inject
    Dep2482(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2483 {
    private Integer keeper = 0;

    Dep2483(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2484 {
    private Integer keeper = 0;

    @Inject
    Dep2484(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2485 {
    private Integer keeper = 0;

    Dep2485(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2486 {
    private Integer keeper = 0;

    @Inject
    Dep2486(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2487 {
    private Integer keeper = 0;

    @Inject
    Dep2487(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2488 {
    private Integer keeper = 0;

    @Inject
    Dep2488(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2489 {
    private Integer keeper = 0;

    @Inject
    Dep2489(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2490 {
    private Integer keeper = 0;

    @Inject
    Dep2490(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2491 {
    private Integer keeper = 0;

    Dep2491(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2492 {
    private Integer keeper = 0;

    Dep2492(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2493 {
    private Integer keeper = 0;

    Dep2493(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2494 {
    private Integer keeper = 0;

    @Inject
    Dep2494(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2495 {
    private Integer keeper = 0;

    Dep2495(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2496 {
    private Integer keeper = 0;

    Dep2496(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2497 {
    private Integer keeper = 0;

    Dep2497(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2498 {
    private Integer keeper = 0;

    Dep2498(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2499 {
    private Integer keeper = 0;

    Dep2499(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2500 {
    private Integer keeper = 0;

    @Inject
    Dep2500(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2501 {
    private Integer keeper = 0;

    @Inject
    Dep2501(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2502 {
    private Integer keeper = 0;

    @Inject
    Dep2502(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2503 {
    private Integer keeper = 0;

    @Inject
    Dep2503(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2504 {
    private Integer keeper = 0;

    Dep2504(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2505 {
    private Integer keeper = 0;

    @Inject
    Dep2505(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2506 {
    private Integer keeper = 0;

    Dep2506(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2507 {
    private Integer keeper = 0;

    @Inject
    Dep2507(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2508 {
    private Integer keeper = 0;

    @Inject
    Dep2508(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2509 {
    private Integer keeper = 0;

    @Inject
    Dep2509(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2510 {
    private Integer keeper = 0;

    @Inject
    Dep2510(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2511 {
    private Integer keeper = 0;

    Dep2511(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2512 {
    private Integer keeper = 0;

    @Inject
    Dep2512(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2513 {
    private Integer keeper = 0;

    Dep2513(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2514 {
    private Integer keeper = 0;

    @Inject
    Dep2514(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2515 {
    private Integer keeper = 0;

    @Inject
    Dep2515(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2516 {
    private Integer keeper = 0;

    @Inject
    Dep2516(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2517 {
    private Integer keeper = 0;

    @Inject
    Dep2517(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2518 {
    private Integer keeper = 0;

    Dep2518(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2519 {
    private Integer keeper = 0;

    Dep2519(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2520 {
    private Integer keeper = 0;

    Dep2520(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2521 {
    private Integer keeper = 0;

    @Inject
    Dep2521(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2522 {
    private Integer keeper = 0;

    @Inject
    Dep2522(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2523 {
    private Integer keeper = 0;

    @Inject
    Dep2523(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2524 {
    private Integer keeper = 0;

    @Inject
    Dep2524(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2525 {
    private Integer keeper = 0;

    Dep2525(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2526 {
    private Integer keeper = 0;

    @Inject
    Dep2526(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2527 {
    private Integer keeper = 0;

    @Inject
    Dep2527(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2528 {
    private Integer keeper = 0;

    Dep2528(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2529 {
    private Integer keeper = 0;

    @Inject
    Dep2529(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2530 {
    private Integer keeper = 0;

    @Inject
    Dep2530(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2531 {
    private Integer keeper = 0;

    Dep2531(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2532 {
    private Integer keeper = 0;

    @Inject
    Dep2532(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2533 {
    private Integer keeper = 0;

    @Inject
    Dep2533(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2534 {
    private Integer keeper = 0;

    Dep2534(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2535 {
    private Integer keeper = 0;

    @Inject
    Dep2535(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2536 {
    private Integer keeper = 0;

    @Inject
    Dep2536(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2537 {
    private Integer keeper = 0;

    Dep2537(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2538 {
    private Integer keeper = 0;

    Dep2538(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2539 {
    private Integer keeper = 0;

    @Inject
    Dep2539(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2540 {
    private Integer keeper = 0;

    @Inject
    Dep2540(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2541 {
    private Integer keeper = 0;

    @Inject
    Dep2541(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2542 {
    private Integer keeper = 0;

    Dep2542(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2543 {
    private Integer keeper = 0;

    @Inject
    Dep2543(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2544 {
    private Integer keeper = 0;

    Dep2544(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2545 {
    private Integer keeper = 0;

    @Inject
    Dep2545(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2546 {
    private Integer keeper = 0;

    @Inject
    Dep2546(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2547 {
    private Integer keeper = 0;

    @Inject
    Dep2547(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2548 {
    private Integer keeper = 0;

    @Inject
    Dep2548(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2549 {
    private Integer keeper = 0;

    Dep2549(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2550 {
    private Integer keeper = 0;

    @Inject
    Dep2550(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2551 {
    private Integer keeper = 0;

    @Inject
    Dep2551(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2552 {
    private Integer keeper = 0;

    @Inject
    Dep2552(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2553 {
    private Integer keeper = 0;

    @Inject
    Dep2553(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2554 {
    private Integer keeper = 0;

    @Inject
    Dep2554(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2555 {
    private Integer keeper = 0;

    @Inject
    Dep2555(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2556 {
    private Integer keeper = 0;

    @Inject
    Dep2556(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2557 {
    private Integer keeper = 0;

    @Inject
    Dep2557(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2558 {
    private Integer keeper = 0;

    @Inject
    Dep2558(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2559 {
    private Integer keeper = 0;

    Dep2559(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2560 {
    private Integer keeper = 0;

    @Inject
    Dep2560(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2561 {
    private Integer keeper = 0;

    Dep2561(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2562 {
    private Integer keeper = 0;

    Dep2562(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2563 {
    private Integer keeper = 0;

    Dep2563(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2564 {
    private Integer keeper = 0;

    Dep2564(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2565 {
    private Integer keeper = 0;

    Dep2565(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2566 {
    private Integer keeper = 0;

    Dep2566(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2567 {
    private Integer keeper = 0;

    @Inject
    Dep2567(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2568 {
    private Integer keeper = 0;

    @Inject
    Dep2568(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2569 {
    private Integer keeper = 0;

    Dep2569(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2570 {
    private Integer keeper = 0;

    Dep2570(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2571 {
    private Integer keeper = 0;

    @Inject
    Dep2571(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2572 {
    private Integer keeper = 0;

    @Inject
    Dep2572(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2573 {
    private Integer keeper = 0;

    Dep2573(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2574 {
    private Integer keeper = 0;

    @Inject
    Dep2574(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2575 {
    private Integer keeper = 0;

    @Inject
    Dep2575(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2576 {
    private Integer keeper = 0;

    @Inject
    Dep2576(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2577 {
    private Integer keeper = 0;

    @Inject
    Dep2577(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2578 {
    private Integer keeper = 0;

    Dep2578(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2579 {
    private Integer keeper = 0;

    @Inject
    Dep2579(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2580 {
    private Integer keeper = 0;

    Dep2580(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2581 {
    private Integer keeper = 0;

    @Inject
    Dep2581(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2582 {
    private Integer keeper = 0;

    @Inject
    Dep2582(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2583 {
    private Integer keeper = 0;

    @Inject
    Dep2583(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2584 {
    private Integer keeper = 0;

    Dep2584(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2585 {
    private Integer keeper = 0;

    @Inject
    Dep2585(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2586 {
    private Integer keeper = 0;

    Dep2586(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2587 {
    private Integer keeper = 0;

    @Inject
    Dep2587(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2588 {
    private Integer keeper = 0;

    @Inject
    Dep2588(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2589 {
    private Integer keeper = 0;

    Dep2589(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2590 {
    private Integer keeper = 0;

    Dep2590(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2591 {
    private Integer keeper = 0;

    Dep2591(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2592 {
    private Integer keeper = 0;

    Dep2592(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2593 {
    private Integer keeper = 0;

    @Inject
    Dep2593(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2594 {
    private Integer keeper = 0;

    @Inject
    Dep2594(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2595 {
    private Integer keeper = 0;

    @Inject
    Dep2595(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2596 {
    private Integer keeper = 0;

    Dep2596(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2597 {
    private Integer keeper = 0;

    Dep2597(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2598 {
    private Integer keeper = 0;

    Dep2598(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2599 {
    private Integer keeper = 0;

    Dep2599(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2600 {
    private Integer keeper = 0;

    Dep2600(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2601 {
    private Integer keeper = 0;

    @Inject
    Dep2601(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2602 {
    private Integer keeper = 0;

    @Inject
    Dep2602(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2603 {
    private Integer keeper = 0;

    Dep2603(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2604 {
    private Integer keeper = 0;

    @Inject
    Dep2604(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2605 {
    private Integer keeper = 0;

    Dep2605(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2606 {
    private Integer keeper = 0;

    Dep2606(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2607 {
    private Integer keeper = 0;

    Dep2607(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2608 {
    private Integer keeper = 0;

    Dep2608(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2609 {
    private Integer keeper = 0;

    @Inject
    Dep2609(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2610 {
    private Integer keeper = 0;

    @Inject
    Dep2610(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2611 {
    private Integer keeper = 0;

    @Inject
    Dep2611(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2612 {
    private Integer keeper = 0;

    @Inject
    Dep2612(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2613 {
    private Integer keeper = 0;

    @Inject
    Dep2613(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2614 {
    private Integer keeper = 0;

    Dep2614(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2615 {
    private Integer keeper = 0;

    @Inject
    Dep2615(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2616 {
    private Integer keeper = 0;

    Dep2616(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2617 {
    private Integer keeper = 0;

    Dep2617(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2618 {
    private Integer keeper = 0;

    @Inject
    Dep2618(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2619 {
    private Integer keeper = 0;

    Dep2619(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2620 {
    private Integer keeper = 0;

    @Inject
    Dep2620(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2621 {
    private Integer keeper = 0;

    Dep2621(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2622 {
    private Integer keeper = 0;

    @Inject
    Dep2622(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2623 {
    private Integer keeper = 0;

    Dep2623(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2624 {
    private Integer keeper = 0;

    @Inject
    Dep2624(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2625 {
    private Integer keeper = 0;

    Dep2625(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2626 {
    private Integer keeper = 0;

    @Inject
    Dep2626(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2627 {
    private Integer keeper = 0;

    Dep2627(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2628 {
    private Integer keeper = 0;

    @Inject
    Dep2628(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2629 {
    private Integer keeper = 0;

    Dep2629(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2630 {
    private Integer keeper = 0;

    Dep2630(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2631 {
    private Integer keeper = 0;

    Dep2631(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2632 {
    private Integer keeper = 0;

    Dep2632(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2633 {
    private Integer keeper = 0;

    @Inject
    Dep2633(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2634 {
    private Integer keeper = 0;

    @Inject
    Dep2634(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2635 {
    private Integer keeper = 0;

    @Inject
    Dep2635(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2636 {
    private Integer keeper = 0;

    Dep2636(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2637 {
    private Integer keeper = 0;

    @Inject
    Dep2637(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2638 {
    private Integer keeper = 0;

    @Inject
    Dep2638(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2639 {
    private Integer keeper = 0;

    Dep2639(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2640 {
    private Integer keeper = 0;

    @Inject
    Dep2640(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2641 {
    private Integer keeper = 0;

    Dep2641(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2642 {
    private Integer keeper = 0;

    Dep2642(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2643 {
    private Integer keeper = 0;

    Dep2643(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2644 {
    private Integer keeper = 0;

    Dep2644(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2645 {
    private Integer keeper = 0;

    Dep2645(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2646 {
    private Integer keeper = 0;

    Dep2646(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2647 {
    private Integer keeper = 0;

    Dep2647(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2648 {
    private Integer keeper = 0;

    @Inject
    Dep2648(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2649 {
    private Integer keeper = 0;

    Dep2649(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2650 {
    private Integer keeper = 0;

    @Inject
    Dep2650(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2651 {
    private Integer keeper = 0;

    @Inject
    Dep2651(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2652 {
    private Integer keeper = 0;

    Dep2652(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2653 {
    private Integer keeper = 0;

    @Inject
    Dep2653(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2654 {
    private Integer keeper = 0;

    @Inject
    Dep2654(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2655 {
    private Integer keeper = 0;

    @Inject
    Dep2655(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2656 {
    private Integer keeper = 0;

    Dep2656(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2657 {
    private Integer keeper = 0;

    @Inject
    Dep2657(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2658 {
    private Integer keeper = 0;

    @Inject
    Dep2658(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2659 {
    private Integer keeper = 0;

    @Inject
    Dep2659(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2660 {
    private Integer keeper = 0;

    @Inject
    Dep2660(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2661 {
    private Integer keeper = 0;

    Dep2661(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2662 {
    private Integer keeper = 0;

    @Inject
    Dep2662(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2663 {
    private Integer keeper = 0;

    Dep2663(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2664 {
    private Integer keeper = 0;

    @Inject
    Dep2664(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2665 {
    private Integer keeper = 0;

    @Inject
    Dep2665(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2666 {
    private Integer keeper = 0;

    Dep2666(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2667 {
    private Integer keeper = 0;

    Dep2667(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2668 {
    private Integer keeper = 0;

    Dep2668(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2669 {
    private Integer keeper = 0;

    @Inject
    Dep2669(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2670 {
    private Integer keeper = 0;

    Dep2670(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2671 {
    private Integer keeper = 0;

    Dep2671(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2672 {
    private Integer keeper = 0;

    @Inject
    Dep2672(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2673 {
    private Integer keeper = 0;

    Dep2673(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2674 {
    private Integer keeper = 0;

    @Inject
    Dep2674(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2675 {
    private Integer keeper = 0;

    @Inject
    Dep2675(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2676 {
    private Integer keeper = 0;

    @Inject
    Dep2676(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2677 {
    private Integer keeper = 0;

    Dep2677(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2678 {
    private Integer keeper = 0;

    Dep2678(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2679 {
    private Integer keeper = 0;

    Dep2679(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2680 {
    private Integer keeper = 0;

    @Inject
    Dep2680(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2681 {
    private Integer keeper = 0;

    @Inject
    Dep2681(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2682 {
    private Integer keeper = 0;

    Dep2682(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2683 {
    private Integer keeper = 0;

    Dep2683(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2684 {
    private Integer keeper = 0;

    Dep2684(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2685 {
    private Integer keeper = 0;

    Dep2685(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2686 {
    private Integer keeper = 0;

    @Inject
    Dep2686(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2687 {
    private Integer keeper = 0;

    @Inject
    Dep2687(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2688 {
    private Integer keeper = 0;

    @Inject
    Dep2688(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2689 {
    private Integer keeper = 0;

    @Inject
    Dep2689(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2690 {
    private Integer keeper = 0;

    Dep2690(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2691 {
    private Integer keeper = 0;

    @Inject
    Dep2691(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2692 {
    private Integer keeper = 0;

    Dep2692(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2693 {
    private Integer keeper = 0;

    @Inject
    Dep2693(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2694 {
    private Integer keeper = 0;

    @Inject
    Dep2694(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2695 {
    private Integer keeper = 0;

    Dep2695(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2696 {
    private Integer keeper = 0;

    Dep2696(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2697 {
    private Integer keeper = 0;

    Dep2697(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2698 {
    private Integer keeper = 0;

    Dep2698(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2699 {
    private Integer keeper = 0;

    @Inject
    Dep2699(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2700 {
    private Integer keeper = 0;

    @Inject
    Dep2700(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2701 {
    private Integer keeper = 0;

    @Inject
    Dep2701(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2702 {
    private Integer keeper = 0;

    Dep2702(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2703 {
    private Integer keeper = 0;

    @Inject
    Dep2703(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2704 {
    private Integer keeper = 0;

    @Inject
    Dep2704(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2705 {
    private Integer keeper = 0;

    Dep2705(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2706 {
    private Integer keeper = 0;

    @Inject
    Dep2706(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2707 {
    private Integer keeper = 0;

    @Inject
    Dep2707(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2708 {
    private Integer keeper = 0;

    Dep2708(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2709 {
    private Integer keeper = 0;

    Dep2709(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2710 {
    private Integer keeper = 0;

    Dep2710(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2711 {
    private Integer keeper = 0;

    Dep2711(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2712 {
    private Integer keeper = 0;

    Dep2712(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2713 {
    private Integer keeper = 0;

    @Inject
    Dep2713(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2714 {
    private Integer keeper = 0;

    Dep2714(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2715 {
    private Integer keeper = 0;

    @Inject
    Dep2715(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2716 {
    private Integer keeper = 0;

    Dep2716(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2717 {
    private Integer keeper = 0;

    @Inject
    Dep2717(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2718 {
    private Integer keeper = 0;

    Dep2718(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2719 {
    private Integer keeper = 0;

    Dep2719(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2720 {
    private Integer keeper = 0;

    @Inject
    Dep2720(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2721 {
    private Integer keeper = 0;

    Dep2721(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2722 {
    private Integer keeper = 0;

    Dep2722(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2723 {
    private Integer keeper = 0;

    @Inject
    Dep2723(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2724 {
    private Integer keeper = 0;

    @Inject
    Dep2724(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2725 {
    private Integer keeper = 0;

    @Inject
    Dep2725(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2726 {
    private Integer keeper = 0;

    @Inject
    Dep2726(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2727 {
    private Integer keeper = 0;

    @Inject
    Dep2727(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2728 {
    private Integer keeper = 0;

    Dep2728(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2729 {
    private Integer keeper = 0;

    Dep2729(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2730 {
    private Integer keeper = 0;

    Dep2730(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2731 {
    private Integer keeper = 0;

    Dep2731(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2732 {
    private Integer keeper = 0;

    @Inject
    Dep2732(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2733 {
    private Integer keeper = 0;

    Dep2733(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2734 {
    private Integer keeper = 0;

    Dep2734(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2735 {
    private Integer keeper = 0;

    Dep2735(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2736 {
    private Integer keeper = 0;

    Dep2736(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2737 {
    private Integer keeper = 0;

    @Inject
    Dep2737(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2738 {
    private Integer keeper = 0;

    Dep2738(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2739 {
    private Integer keeper = 0;

    Dep2739(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2740 {
    private Integer keeper = 0;

    Dep2740(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2741 {
    private Integer keeper = 0;

    @Inject
    Dep2741(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2742 {
    private Integer keeper = 0;

    @Inject
    Dep2742(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2743 {
    private Integer keeper = 0;

    Dep2743(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2744 {
    private Integer keeper = 0;

    @Inject
    Dep2744(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2745 {
    private Integer keeper = 0;

    @Inject
    Dep2745(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2746 {
    private Integer keeper = 0;

    @Inject
    Dep2746(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2747 {
    private Integer keeper = 0;

    Dep2747(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2748 {
    private Integer keeper = 0;

    Dep2748(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2749 {
    private Integer keeper = 0;

    @Inject
    Dep2749(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2750 {
    private Integer keeper = 0;

    Dep2750(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2751 {
    private Integer keeper = 0;

    Dep2751(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2752 {
    private Integer keeper = 0;

    @Inject
    Dep2752(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2753 {
    private Integer keeper = 0;

    Dep2753(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2754 {
    private Integer keeper = 0;

    Dep2754(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2755 {
    private Integer keeper = 0;

    Dep2755(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2756 {
    private Integer keeper = 0;

    Dep2756(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2757 {
    private Integer keeper = 0;

    @Inject
    Dep2757(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2758 {
    private Integer keeper = 0;

    Dep2758(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2759 {
    private Integer keeper = 0;

    @Inject
    Dep2759(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2760 {
    private Integer keeper = 0;

    @Inject
    Dep2760(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2761 {
    private Integer keeper = 0;

    Dep2761(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2762 {
    private Integer keeper = 0;

    Dep2762(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2763 {
    private Integer keeper = 0;

    @Inject
    Dep2763(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2764 {
    private Integer keeper = 0;

    Dep2764(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2765 {
    private Integer keeper = 0;

    @Inject
    Dep2765(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2766 {
    private Integer keeper = 0;

    Dep2766(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2767 {
    private Integer keeper = 0;

    @Inject
    Dep2767(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2768 {
    private Integer keeper = 0;

    @Inject
    Dep2768(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2769 {
    private Integer keeper = 0;

    Dep2769(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2770 {
    private Integer keeper = 0;

    @Inject
    Dep2770(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2771 {
    private Integer keeper = 0;

    @Inject
    Dep2771(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2772 {
    private Integer keeper = 0;

    Dep2772(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2773 {
    private Integer keeper = 0;

    Dep2773(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2774 {
    private Integer keeper = 0;

    @Inject
    Dep2774(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2775 {
    private Integer keeper = 0;

    @Inject
    Dep2775(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2776 {
    private Integer keeper = 0;

    @Inject
    Dep2776(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2777 {
    private Integer keeper = 0;

    @Inject
    Dep2777(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2778 {
    private Integer keeper = 0;

    Dep2778(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2779 {
    private Integer keeper = 0;

    Dep2779(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2780 {
    private Integer keeper = 0;

    Dep2780(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2781 {
    private Integer keeper = 0;

    Dep2781(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2782 {
    private Integer keeper = 0;

    Dep2782(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2783 {
    private Integer keeper = 0;

    @Inject
    Dep2783(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2784 {
    private Integer keeper = 0;

    @Inject
    Dep2784(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2785 {
    private Integer keeper = 0;

    @Inject
    Dep2785(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2786 {
    private Integer keeper = 0;

    Dep2786(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2787 {
    private Integer keeper = 0;

    Dep2787(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2788 {
    private Integer keeper = 0;

    @Inject
    Dep2788(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2789 {
    private Integer keeper = 0;

    Dep2789(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2790 {
    private Integer keeper = 0;

    @Inject
    Dep2790(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2791 {
    private Integer keeper = 0;

    @Inject
    Dep2791(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2792 {
    private Integer keeper = 0;

    @Inject
    Dep2792(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2793 {
    private Integer keeper = 0;

    @Inject
    Dep2793(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2794 {
    private Integer keeper = 0;

    Dep2794(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2795 {
    private Integer keeper = 0;

    @Inject
    Dep2795(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2796 {
    private Integer keeper = 0;

    Dep2796(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2797 {
    private Integer keeper = 0;

    @Inject
    Dep2797(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2798 {
    private Integer keeper = 0;

    Dep2798(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2799 {
    private Integer keeper = 0;

    @Inject
    Dep2799(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2800 {
    private Integer keeper = 0;

    Dep2800(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2801 {
    private Integer keeper = 0;

    Dep2801(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2802 {
    private Integer keeper = 0;

    @Inject
    Dep2802(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2803 {
    private Integer keeper = 0;

    @Inject
    Dep2803(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2804 {
    private Integer keeper = 0;

    Dep2804(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2805 {
    private Integer keeper = 0;

    @Inject
    Dep2805(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2806 {
    private Integer keeper = 0;

    Dep2806(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2807 {
    private Integer keeper = 0;

    @Inject
    Dep2807(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2808 {
    private Integer keeper = 0;

    Dep2808(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2809 {
    private Integer keeper = 0;

    Dep2809(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2810 {
    private Integer keeper = 0;

    Dep2810(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2811 {
    private Integer keeper = 0;

    @Inject
    Dep2811(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2812 {
    private Integer keeper = 0;

    Dep2812(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2813 {
    private Integer keeper = 0;

    @Inject
    Dep2813(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2814 {
    private Integer keeper = 0;

    Dep2814(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2815 {
    private Integer keeper = 0;

    @Inject
    Dep2815(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2816 {
    private Integer keeper = 0;

    Dep2816(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2817 {
    private Integer keeper = 0;

    Dep2817(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2818 {
    private Integer keeper = 0;

    Dep2818(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2819 {
    private Integer keeper = 0;

    @Inject
    Dep2819(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2820 {
    private Integer keeper = 0;

    Dep2820(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2821 {
    private Integer keeper = 0;

    Dep2821(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2822 {
    private Integer keeper = 0;

    Dep2822(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2823 {
    private Integer keeper = 0;

    @Inject
    Dep2823(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2824 {
    private Integer keeper = 0;

    @Inject
    Dep2824(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2825 {
    private Integer keeper = 0;

    @Inject
    Dep2825(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2826 {
    private Integer keeper = 0;

    @Inject
    Dep2826(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2827 {
    private Integer keeper = 0;

    Dep2827(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2828 {
    private Integer keeper = 0;

    Dep2828(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2829 {
    private Integer keeper = 0;

    Dep2829(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2830 {
    private Integer keeper = 0;

    Dep2830(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2831 {
    private Integer keeper = 0;

    @Inject
    Dep2831(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2832 {
    private Integer keeper = 0;

    @Inject
    Dep2832(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2833 {
    private Integer keeper = 0;

    Dep2833(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2834 {
    private Integer keeper = 0;

    Dep2834(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2835 {
    private Integer keeper = 0;

    Dep2835(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2836 {
    private Integer keeper = 0;

    Dep2836(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2837 {
    private Integer keeper = 0;

    @Inject
    Dep2837(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2838 {
    private Integer keeper = 0;

    Dep2838(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2839 {
    private Integer keeper = 0;

    Dep2839(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2840 {
    private Integer keeper = 0;

    Dep2840(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2841 {
    private Integer keeper = 0;

    Dep2841(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2842 {
    private Integer keeper = 0;

    @Inject
    Dep2842(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2843 {
    private Integer keeper = 0;

    Dep2843(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2844 {
    private Integer keeper = 0;

    @Inject
    Dep2844(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2845 {
    private Integer keeper = 0;

    Dep2845(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2846 {
    private Integer keeper = 0;

    @Inject
    Dep2846(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2847 {
    private Integer keeper = 0;

    @Inject
    Dep2847(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2848 {
    private Integer keeper = 0;

    Dep2848(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2849 {
    private Integer keeper = 0;

    Dep2849(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2850 {
    private Integer keeper = 0;

    @Inject
    Dep2850(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2851 {
    private Integer keeper = 0;

    @Inject
    Dep2851(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2852 {
    private Integer keeper = 0;

    @Inject
    Dep2852(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2853 {
    private Integer keeper = 0;

    Dep2853(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2854 {
    private Integer keeper = 0;

    @Inject
    Dep2854(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2855 {
    private Integer keeper = 0;

    @Inject
    Dep2855(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2856 {
    private Integer keeper = 0;

    Dep2856(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2857 {
    private Integer keeper = 0;

    Dep2857(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2858 {
    private Integer keeper = 0;

    Dep2858(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2859 {
    private Integer keeper = 0;

    @Inject
    Dep2859(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2860 {
    private Integer keeper = 0;

    Dep2860(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2861 {
    private Integer keeper = 0;

    @Inject
    Dep2861(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2862 {
    private Integer keeper = 0;

    @Inject
    Dep2862(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2863 {
    private Integer keeper = 0;

    @Inject
    Dep2863(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2864 {
    private Integer keeper = 0;

    @Inject
    Dep2864(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2865 {
    private Integer keeper = 0;

    @Inject
    Dep2865(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2866 {
    private Integer keeper = 0;

    Dep2866(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2867 {
    private Integer keeper = 0;

    @Inject
    Dep2867(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2868 {
    private Integer keeper = 0;

    Dep2868(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2869 {
    private Integer keeper = 0;

    Dep2869(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2870 {
    private Integer keeper = 0;

    @Inject
    Dep2870(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2871 {
    private Integer keeper = 0;

    Dep2871(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2872 {
    private Integer keeper = 0;

    @Inject
    Dep2872(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2873 {
    private Integer keeper = 0;

    @Inject
    Dep2873(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2874 {
    private Integer keeper = 0;

    @Inject
    Dep2874(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2875 {
    private Integer keeper = 0;

    @Inject
    Dep2875(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2876 {
    private Integer keeper = 0;

    @Inject
    Dep2876(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2877 {
    private Integer keeper = 0;

    @Inject
    Dep2877(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2878 {
    private Integer keeper = 0;

    @Inject
    Dep2878(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2879 {
    private Integer keeper = 0;

    Dep2879(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2880 {
    private Integer keeper = 0;

    @Inject
    Dep2880(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2881 {
    private Integer keeper = 0;

    Dep2881(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2882 {
    private Integer keeper = 0;

    Dep2882(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2883 {
    private Integer keeper = 0;

    @Inject
    Dep2883(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2884 {
    private Integer keeper = 0;

    Dep2884(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2885 {
    private Integer keeper = 0;

    Dep2885(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2886 {
    private Integer keeper = 0;

    Dep2886(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2887 {
    private Integer keeper = 0;

    Dep2887(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2888 {
    private Integer keeper = 0;

    @Inject
    Dep2888(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2889 {
    private Integer keeper = 0;

    @Inject
    Dep2889(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2890 {
    private Integer keeper = 0;

    @Inject
    Dep2890(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2891 {
    private Integer keeper = 0;

    @Inject
    Dep2891(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2892 {
    private Integer keeper = 0;

    Dep2892(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2893 {
    private Integer keeper = 0;

    Dep2893(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2894 {
    private Integer keeper = 0;

    Dep2894(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2895 {
    private Integer keeper = 0;

    Dep2895(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2896 {
    private Integer keeper = 0;

    Dep2896(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2897 {
    private Integer keeper = 0;

    @Inject
    Dep2897(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2898 {
    private Integer keeper = 0;

    @Inject
    Dep2898(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2899 {
    private Integer keeper = 0;

    @Inject
    Dep2899(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2900 {
    private Integer keeper = 0;

    Dep2900(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2901 {
    private Integer keeper = 0;

    @Inject
    Dep2901(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2902 {
    private Integer keeper = 0;

    @Inject
    Dep2902(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2903 {
    private Integer keeper = 0;

    @Inject
    Dep2903(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2904 {
    private Integer keeper = 0;

    Dep2904(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2905 {
    private Integer keeper = 0;

    @Inject
    Dep2905(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2906 {
    private Integer keeper = 0;

    @Inject
    Dep2906(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2907 {
    private Integer keeper = 0;

    Dep2907(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2908 {
    private Integer keeper = 0;

    @Inject
    Dep2908(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2909 {
    private Integer keeper = 0;

    Dep2909(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2910 {
    private Integer keeper = 0;

    Dep2910(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2911 {
    private Integer keeper = 0;

    Dep2911(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2912 {
    private Integer keeper = 0;

    Dep2912(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2913 {
    private Integer keeper = 0;

    Dep2913(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2914 {
    private Integer keeper = 0;

    @Inject
    Dep2914(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2915 {
    private Integer keeper = 0;

    Dep2915(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2916 {
    private Integer keeper = 0;

    Dep2916(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2917 {
    private Integer keeper = 0;

    Dep2917(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2918 {
    private Integer keeper = 0;

    Dep2918(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2919 {
    private Integer keeper = 0;

    @Inject
    Dep2919(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2920 {
    private Integer keeper = 0;

    @Inject
    Dep2920(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2921 {
    private Integer keeper = 0;

    @Inject
    Dep2921(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2922 {
    private Integer keeper = 0;

    Dep2922(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2923 {
    private Integer keeper = 0;

    @Inject
    Dep2923(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2924 {
    private Integer keeper = 0;

    @Inject
    Dep2924(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2925 {
    private Integer keeper = 0;

    @Inject
    Dep2925(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2926 {
    private Integer keeper = 0;

    @Inject
    Dep2926(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2927 {
    private Integer keeper = 0;

    @Inject
    Dep2927(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2928 {
    private Integer keeper = 0;

    Dep2928(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2929 {
    private Integer keeper = 0;

    @Inject
    Dep2929(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2930 {
    private Integer keeper = 0;

    Dep2930(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2931 {
    private Integer keeper = 0;

    @Inject
    Dep2931(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2932 {
    private Integer keeper = 0;

    @Inject
    Dep2932(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2933 {
    private Integer keeper = 0;

    @Inject
    Dep2933(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2934 {
    private Integer keeper = 0;

    @Inject
    Dep2934(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2935 {
    private Integer keeper = 0;

    Dep2935(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2936 {
    private Integer keeper = 0;

    Dep2936(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2937 {
    private Integer keeper = 0;

    Dep2937(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2938 {
    private Integer keeper = 0;

    Dep2938(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2939 {
    private Integer keeper = 0;

    @Inject
    Dep2939(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2940 {
    private Integer keeper = 0;

    @Inject
    Dep2940(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2941 {
    private Integer keeper = 0;

    Dep2941(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2942 {
    private Integer keeper = 0;

    Dep2942(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2943 {
    private Integer keeper = 0;

    Dep2943(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2944 {
    private Integer keeper = 0;

    @Inject
    Dep2944(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2945 {
    private Integer keeper = 0;

    @Inject
    Dep2945(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2946 {
    private Integer keeper = 0;

    Dep2946(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2947 {
    private Integer keeper = 0;

    Dep2947(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2948 {
    private Integer keeper = 0;

    Dep2948(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2949 {
    private Integer keeper = 0;

    @Inject
    Dep2949(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2950 {
    private Integer keeper = 0;

    @Inject
    Dep2950(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2951 {
    private Integer keeper = 0;

    @Inject
    Dep2951(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2952 {
    private Integer keeper = 0;

    Dep2952(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2953 {
    private Integer keeper = 0;

    Dep2953(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2954 {
    private Integer keeper = 0;

    @Inject
    Dep2954(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2955 {
    private Integer keeper = 0;

    @Inject
    Dep2955(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2956 {
    private Integer keeper = 0;

    @Inject
    Dep2956(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2957 {
    private Integer keeper = 0;

    Dep2957(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2958 {
    private Integer keeper = 0;

    Dep2958(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2959 {
    private Integer keeper = 0;

    @Inject
    Dep2959(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2960 {
    private Integer keeper = 0;

    @Inject
    Dep2960(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2961 {
    private Integer keeper = 0;

    @Inject
    Dep2961(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2962 {
    private Integer keeper = 0;

    @Inject
    Dep2962(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2963 {
    private Integer keeper = 0;

    @Inject
    Dep2963(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2964 {
    private Integer keeper = 0;

    Dep2964(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2965 {
    private Integer keeper = 0;

    Dep2965(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2966 {
    private Integer keeper = 0;

    Dep2966(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2967 {
    private Integer keeper = 0;

    Dep2967(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2968 {
    private Integer keeper = 0;

    Dep2968(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2969 {
    private Integer keeper = 0;

    Dep2969(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2970 {
    private Integer keeper = 0;

    @Inject
    Dep2970(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2971 {
    private Integer keeper = 0;

    Dep2971(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2972 {
    private Integer keeper = 0;

    @Inject
    Dep2972(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2973 {
    private Integer keeper = 0;

    Dep2973(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2974 {
    private Integer keeper = 0;

    Dep2974(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2975 {
    private Integer keeper = 0;

    Dep2975(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2976 {
    private Integer keeper = 0;

    Dep2976(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2977 {
    private Integer keeper = 0;

    @Inject
    Dep2977(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2978 {
    private Integer keeper = 0;

    @Inject
    Dep2978(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2979 {
    private Integer keeper = 0;

    Dep2979(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2980 {
    private Integer keeper = 0;

    Dep2980(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2981 {
    private Integer keeper = 0;

    @Inject
    Dep2981(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2982 {
    private Integer keeper = 0;

    Dep2982(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2983 {
    private Integer keeper = 0;

    Dep2983(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2984 {
    private Integer keeper = 0;

    Dep2984(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2985 {
    private Integer keeper = 0;

    Dep2985(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2986 {
    private Integer keeper = 0;

    @Inject
    Dep2986(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2987 {
    private Integer keeper = 0;

    @Inject
    Dep2987(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2988 {
    private Integer keeper = 0;

    Dep2988(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2989 {
    private Integer keeper = 0;

    @Inject
    Dep2989(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2990 {
    private Integer keeper = 0;

    @Inject
    Dep2990(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2991 {
    private Integer keeper = 0;

    Dep2991(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2992 {
    private Integer keeper = 0;

    @Inject
    Dep2992(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2993 {
    private Integer keeper = 0;

    @Inject
    Dep2993(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2994 {
    private Integer keeper = 0;

    @Inject
    Dep2994(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2995 {
    private Integer keeper = 0;

    @Inject
    Dep2995(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2996 {
    private Integer keeper = 0;

    Dep2996(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2997 {
    private Integer keeper = 0;

    Dep2997(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2998 {
    private Integer keeper = 0;

    Dep2998(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep2999 {
    private Integer keeper = 0;

    @Inject
    Dep2999(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep3000 {
    private Integer keeper = 0;

    @Inject
    Dep3000(Dep3001 dep3001) {
      this.keeper += dep3001.getKeeper();
    }

    public Integer getKeeper() {
      return keeper;
    }
  }

  static final class Dep3001 {
    private Integer keeper = 0;

    @Inject
    Dep3001() {}

    public Integer getKeeper() {
      return keeper;
    }
  }
}
