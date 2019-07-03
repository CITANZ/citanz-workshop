# git clone https://github.com/CITANZ/citanz-workshop.git
# cd citanz-workshop/automation/dockerfiles/serenity_chrome

FROM bingc/serenity_base:latest

WORKDIR /opt/chrome
RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && echo 'deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main' | tee /etc/apt/sources.list.d/google-chrome.list\
    && apt-get update\ 
    && apt-get install google-chrome-stable -y \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

RUN CHROME_MAJOR_VERSION=$(google-chrome --version | cut --delimiter=' ' --fields=3 | cut --delimiter=. --fields=1) \
  && CD_VERSION=$(curl -Ls https://chromedriver.storage.googleapis.com/LATEST_RELEASE_${CHROME_MAJOR_VERSION}) \
  && curl -Ls https://chromedriver.storage.googleapis.com/$CD_VERSION/chromedriver_linux64.zip |gunzip > /usr/bin/chromedriver \
  && chmod +x /usr/bin/chromedriver


