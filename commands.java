curl -L https://github.com/docker/machine/releases/download/v0.9.0-rc2/docker-machine-`uname -s`-`uname -m` >/tmp/docker-machine &&
  chmod +x /tmp/docker-machine &&
  sudo cp /tmp/docker-machine /usr/local/bin/docker-machine
  
  
  docker run -d ubuntu /bin/sh -c "while true; do echo hello world; sleep 1; done"
  
  
  1
