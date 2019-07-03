# Reference: Docker commands for Web Automation


## Build Serenity + Chrome + Automation code image
```
$: git clone https://github.com/CITANZ/citanz-workshop.git
$: cd citanz-workshop/automation/serenity-automation-template
$: docker build --build-arg UID=$UID --no-cache -t bingc/serenity_chrome_allincluded:latest -f ./docker/Dockerfile.serenity_chrome_allincluded .
$: docker image ls

```

## Run the UI automation
```
$: docker run --name serenity_bdd --rm -v serenity_bdd_volume:/src/bdd/target/site/serenity \
bingc/serenity_chrome_allincluded:latest -o verify -Dwebdriver.driver=chrome -Dcucumber.options="--tags @demo"

```
## Generate Test Resport

```
$: docker run --name serenity_bdd_report -v serenity_bdd_volume:/src/bdd/target/site/serenity \
bingc/serenity_chrome_allincluded:latest -o serenity:aggregate

$: docker cp serenity_bdd_report:/src/bdd/target/site/serenity .

```

## View Test Report
Open **./serenity/index.html** in your Browser