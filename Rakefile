namespace :ci do
  task :install_lein do
    mkdir_p "bin"
    `wget -P ~/bin https://raw.github.com/technomancy/leiningen/stable/bin/lein`
    `chmod +x ~/bin/lein`
  end

  task :prepare => [:install_lein]
end

desc "Run automated tests"
task :test do
  sh "lein test"
end

desc "Deploy to Heroku"
task :deploy do
  sh "heroku push --app google-who-am-i"
end

desc "Run locally"
task :local do
  sh "lein run -m who-am-i.boot 5000"
end

