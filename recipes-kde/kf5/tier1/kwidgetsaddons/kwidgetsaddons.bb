SUMMARY = "Addons to QtWidgets"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "cb646b97ced8a20bbb248b2c6366b7c1"
SRC_URI[sha256sum] = "1d6b67418b4d07f3145bb06ea3ee500942b9ef2f48eb687cae9360df4ae6e5a7"

CMAKE_HIDE_ERROR[1] = "KF5WidgetsAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5WidgetsAddons, -S${includedir}, -S${STAGING_INCDIR}"

