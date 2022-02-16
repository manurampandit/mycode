// put the below script in browser console, replace from and to accordingly
const convertListToMap = (list) => {
    let map = new Map();
    for (let idx = 0; idx < list.length; idx+=2) {
        map.set(list[idx], list[idx + 1])
    }
    return map;
};

function convertStrToMap(str) {
    let strList = str.replaceAll('\n', ' ').split(' ').filter(z => z != '').filter( z => !z.startsWith('/'));
    return convertListToMap(strList);
}
/**
* returns list of dependencies present in fromMap but in toMap
*/
const findInAnother = (fromMap, toMap) =>{
    const keys = Array.from(fromMap.keys());
    // find the one which exists in fromMap but not in toMap
    let arr = [];
    for (let idx = 0; idx < keys.length; ++idx) {
        if (!toMap.has(keys[idx])) {
            arr.push(keys[idx]);
        }
    }
    return arr;
}

// enter two string here:
const x = `accept-types                       0.4.1
altair                             4.1.0
altair-data-server                 0.4.1
altair-saver                       0.5.0
altair-viewer                      0.4.0
amf-client                         14.0.1
ansicolors                         1.1.8
ansiwrap                           0.8.4
apipkg                             1.5
jsonschema                         3.2.0
jupyter                            1.0.0
jupyter-client                     5.2.3
jupyter-console                    5.2.0
jupyter-contrib-core               0.3.3
jupyter-contrib-nbextensions       0.5.1
jupyter-core                       4.4.0
jupyter-highlight-selected-word    0.2.0
jupyter-latex-envs                 1.4.6
jupyter-lsp                        0.9.2     /lsp_install/lsp/py_src
jupyter-nbextensions-configurator  0.4.1
jupyterlab                         2.2.4
jupyterlab-launcher                0.11.2
jupyterlab-server                  1.2.0
selenium                           3.141.0
Send2Trash                         1.5.0
setproctitle                       1.1.10
setuptools                         56.1.0
setuptools-git                     1.2
setuptools-scm                     5.0.1
sh                                 1.13.1
shap                               0.35.0
`;
const y = `altair                 4.1.0
altair-data-server     0.4.1
altair-saver           0.5.0
altair-viewer          0.4.0
amf-client             14.0.1
apache-beam            2.27.0
apache-flink           1.14.2
jupyter                1.0.0
jupyter-client         7.1.1
jupyter-console        6.4.0
jupyter-core           4.9.1
jupyterlab             2.3.0
jupyterlab-pygments    0.1.2
jupyterlab-server      1.2.0
jupyterlab-widgets     1.0.2
my-custom-package1     0.0.29      /Users/username/Desktop/something/src
my-custom-package2     0.0.49      /Users/manu/Desktop/something/src
`;

let mapX = convertStrToMap(x);
let mapY = convertStrToMap(y);
// present in one but not in another
let presentOnlyInY = findInAnother(mapY, mapX);
console.log(presentOnlyInY);
