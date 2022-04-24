SUMMARY = "libqtxdg is An Qt implementation of freedesktop.org xdg specifications"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

# libmagic is supplied by file
DEPENDS += " \
    qtsvg \
    file \
"

EXTRA_OECMAKE += " \
    -DQTXDGX_ICONENGINEPLUGIN_INSTALL_PATH=${OE_QMAKE_PATH_PLUGINS}/iconengines \
"

SRCREV = "f3ebda1a8add4bf24841da7851d53ce74edceac2"
PV = "3.9.0"

do_configure:append() {
    # remove absolute paths from exported cmake files
    for f in `find ${B} -name '*-targets.cmake'`; do
        sed -i 's:${RECIPE_SYSROOT}${prefix}:${_IMPORT_PREFIX}:g' $f
    done
}

FILES:${PN} += " \
    ${datadir}/lxqt \
    ${OE_QMAKE_PATH_PLUGINS}/iconengines \
"
