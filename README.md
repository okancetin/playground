# playground
playground some git commands


sudo apt-key adv \
               --keyserver hkp://ha.pool.sks-keyservers.net:80 \
               --recv-keys 58118E89F3A912897C070ADBF76221572C52609D


test2

deb https://apt.dockerproject.org/repo ubuntu-xenial main


echo "deb https://apt.dockerproject.org/repo ubuntu-xenial main" | sudo tee /etc/apt/sources.list.d/docker.list

Acquire::https::proxy "https://195.87.49.10:8080/";

sudo apt-get install linux-image-extra-$(uname -r) linux-image-extra-virtual
