SUMMARY = "Plugin based UI runtime used to write primary user interfaces"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += " \
    qtdeclarative \
    qtsvg \
    qtscript \
    kactivities \
    karchive \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kdbusaddons \
    kdeclarative \
    kdoctools \
    kglobalaccel \
    kguiaddons \
    ki18n \
    kservice \
    kwindowsystem \
    kxmlgui \
    knotifications \
    kpackage \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "4e8388cee55215412db36c226f4b3b2c"
SRC_URI[sha256sum] = "027544d49d3da11d8b16ac0caa3007fbb27d5a64d4ba02f113a6376282758280"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Plasma, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Plasma, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/dbus-1 \
    ${datadir}/plasma \
    \
    ${libdir}/plugins \
    ${libdir}/platformqml \
    ${libdir}/qml \
    ${libdir}/org/kde/plasma \
"

FILES_${PN}-dbg += " \
    ${libdir}/plugins/.debug \
    ${libdir}/plugins/kf5/*/.debug \
    ${libdir}/platformqml/*/org/kde/plasma/*/.debug \
    ${libdir}/org/kde/plasma/*/.debug \
    ${libdir}/qml/org/kde/plasma/*/.debug \
"
