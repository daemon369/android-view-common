# Changelog

## [0.3.0] - 2021-09-05

### Added

- APP的`Application`为`me.daemon.infrastructure.application.InfrastructureApp`或其子类时，可以使用以下不依赖`Context`的方法、属性、扩展方法：
    - `dp2px(dp: Float): Float`
    - `px2dp(px: Float): Float`
    - `sp2px(sp: Float): Float`
    - `px2sp(px: Float): Float`
    - `screenWidth: Int`
    - `screenHeight: Int`
    - `Int.color(): Int`
    - `Int.dimen(): Float`
    - `Int.drawable(): Drawable`
    - `Int.string(): String`
    - `Int.string(vararg arg: Any): String`

## [0.2.0] - 2021-06-30

### Changed

- 废弃顶层方法`dp2px`、`px2dp`、`sp2px`、`px2sp`
- `targetSdkVersion`降低为`23`，降低对接入方的影响

## [0.1.0] - 2021-06-17

### Changed

- `kotlin`升级到`1.4.32`
- `fragment`升级到`1.3.4`