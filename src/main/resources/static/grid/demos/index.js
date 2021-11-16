const fs = require('fs');
const path = require('path');
var data = "<ul>";
walkSync(path.resolve(__dirname  + '/'));

function walkSync(dir) {
    const files = fs.readdirSync(dir);
	let fileIndex = 0;
	
    for (const file of files) {
        const newDir = path.join(dir, file);
	    
        if (fs.statSync(newDir).isDirectory()) {
            walkSync(newDir);
        }
        else {
			if (file === "index.htm") {
				
				data += "\n<li><a href='" + newDir.replace(__dirname, '.') + "'>" + dir.split('\\')[dir.split('\\').length-2] + "/" + dir.split('\\')[dir.split('\\').length-1] + "</a></li>\n";
			}
		}		
    }
}

data += "</ul>";

if (fs.existsSync('index.htm')) {
	fs.unlinkSync("index.htm");
}
fs.writeFileSync("index.htm", data);
